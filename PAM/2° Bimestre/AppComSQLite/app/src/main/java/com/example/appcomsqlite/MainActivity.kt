package com.example.appcomsqlite

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
import com.example.appcomsqlite.ui.theme.AppComSQLiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AppComSQLiteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaCadastro(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TelaCadastro(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    val dbHelper = remember { DatabaseHelper(context) }

    var nome  by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }

    var usuarios by remember { mutableStateOf(dbHelper.listarUsuarios()) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Cadastro de Usuário",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        OutlinedTextField(
            value = nome,
            onValueChange = { nome = it },
            label = { Text("Nome") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = idade,
            onValueChange = { idade = it },
            label = { Text("Idade") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                if (nome.isBlank() || idade.isBlank()) {
                    Toast.makeText(context, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                    return@Button
                }

                val idadeInt = idade.toIntOrNull()
                if (idadeInt == null || idadeInt <= 0) {
                    Toast.makeText(context, "Idade inválida!", Toast.LENGTH_SHORT).show()
                    return@Button
                }

                val idInserido = dbHelper.inserirUsuario(nome.trim(), idadeInt)

                if (idInserido != -1L) {
                    Toast.makeText(context, "Usuário cadastrado! ID: $idInserido", Toast.LENGTH_SHORT).show()

                    nome  = ""
                    idade = ""

                    usuarios = dbHelper.listarUsuarios()
                } else {
                    Toast.makeText(context, "Erro ao cadastrar!", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Cadastrar", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(28.dp))

        if (usuarios.isNotEmpty()) {
            Text(
                text = "Usuários cadastrados (${usuarios.size})",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(bottom = 8.dp)
            )

            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(usuarios) { (nomeItem, idadeItem) ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Text(
                            text = "$nomeItem — $idadeItem anos",
                            modifier = Modifier.padding(12.dp),
                            fontSize = 15.sp
                        )
                    }
                }
            }
        }
    }
}