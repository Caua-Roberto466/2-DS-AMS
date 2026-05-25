package com.example.appcomsqlite2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcomsqlite2.ui.theme.AppComSQLite2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppComSQLite2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaCatalogo(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TelaCatalogo(modifier: Modifier = Modifier) {
    val context  = LocalContext.current
    val dbHelper = remember { DatabaseHelper(context) }

    var titulo by remember { mutableStateOf("") }
    var ano    by remember { mutableStateOf("") }
    var livros by remember { mutableStateOf(dbHelper.listarLivros()) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Catálogo de Livros",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        OutlinedTextField(
            value = titulo,
            onValueChange = { titulo = it },
            label = { Text("Título") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = ano,
            onValueChange = { ano = it },
            label = { Text("Ano de publicação") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                if (titulo.isBlank() || ano.isBlank()) {
                    Toast.makeText(context, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                    return@Button
                }
                val anoInt = ano.toIntOrNull()
                if (anoInt == null || anoInt < 1000 || anoInt > 2100) {
                    Toast.makeText(context, "Ano inválido!", Toast.LENGTH_SHORT).show()
                    return@Button
                }
                val id = dbHelper.inserirLivro(titulo.trim(), anoInt)
                if (id != -1L) {
                    Toast.makeText(context, "Livro adicionado!", Toast.LENGTH_SHORT).show()
                    titulo = ""
                    ano    = ""
                    livros = dbHelper.listarLivros()
                } else {
                    Toast.makeText(context, "Erro ao salvar!", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Adicionar livro", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(28.dp))

        if (livros.isNotEmpty()) {
            Text(
                text = "Acervo (${livros.size})",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(bottom = 8.dp)
            )

            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(livros) { (tituloItem, anoItem) ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = tituloItem,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "$anoItem",
                                    fontSize = 13.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }

                            TextButton(
                                onClick = {
                                    dbHelper.excluirLivro(tituloItem)
                                    livros = dbHelper.listarLivros()
                                    Toast.makeText(context, "\"$tituloItem\" removido.", Toast.LENGTH_SHORT).show()
                                }
                            ) {
                                Text(
                                    text = "Remover",
                                    color = MaterialTheme.colorScheme.error
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}