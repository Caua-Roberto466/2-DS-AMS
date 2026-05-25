package com.example.appcomsqlite

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

private const val DATABASE_NAME    = "usuarios.db"
private const val DATABASE_VERSION = 1
private const val TABLE_USUARIOS   = "usuarios"
private const val COLUNA_ID        = "id"
private const val COLUNA_NOME      = "nome"
private const val COLUNA_IDADE     = "idade"

class DatabaseHelper(context: Context) : SQLiteOpenHelper(
    context, DATABASE_NAME, null, DATABASE_VERSION
) {

    override fun onCreate(db: SQLiteDatabase) {
        val criarTabela = """
            CREATE TABLE $TABLE_USUARIOS (
                $COLUNA_ID    INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUNA_NOME  TEXT    NOT NULL,
                $COLUNA_IDADE INTEGER NOT NULL
            )
        """.trimIndent()

        db.execSQL(criarTabela)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_USUARIOS")
        onCreate(db)
    }

    fun inserirUsuario(nome: String, idade: Int): Long {
        val db = writableDatabase

        val valores = ContentValues().apply {
            put(COLUNA_NOME, nome)
            put(COLUNA_IDADE, idade)
        }

        val idInserido = db.insert(TABLE_USUARIOS, null, valores)

        db.close()

        return idInserido
    }

    fun listarUsuarios(): List<Pair<String, Int>> {
        val lista = mutableListOf<Pair<String, Int>>()

        val db = readableDatabase

        val cursor = db.query(
            TABLE_USUARIOS,
            arrayOf(COLUNA_ID, COLUNA_NOME, COLUNA_IDADE),
            null, null, null, null, null
        )

        cursor.use { c ->
            while (c.moveToNext()) {
                val nome  = c.getString(c.getColumnIndexOrThrow(COLUNA_NOME))
                val idade = c.getInt(c.getColumnIndexOrThrow(COLUNA_IDADE))
                lista.add(Pair(nome, idade))
            }
        }

        db.close()
        return lista
    }
}