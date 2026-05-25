package com.example.appcomsqlite2

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

private const val DATABASE_NAME    = "livros.db"
private const val DATABASE_VERSION = 1
private const val TABLE_LIVROS     = "livros"
private const val COLUNA_ID        = "id"
private const val COLUNA_TITULO    = "titulo"
private const val COLUNA_ANO       = "ano"

class DatabaseHelper(context: Context) : SQLiteOpenHelper(
    context, DATABASE_NAME, null, DATABASE_VERSION
) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("""
            CREATE TABLE $TABLE_LIVROS (
                $COLUNA_ID     INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUNA_TITULO TEXT    NOT NULL,
                $COLUNA_ANO    INTEGER NOT NULL
            )
        """.trimIndent())
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_LIVROS")
        onCreate(db)
    }

    fun inserirLivro(titulo: String, ano: Int): Long {
        val db = writableDatabase
        val valores = ContentValues().apply {
            put(COLUNA_TITULO, titulo)
            put(COLUNA_ANO, ano)
        }
        val id = db.insert(TABLE_LIVROS, null, valores)
        db.close()
        return id
    }

    fun listarLivros(): List<Pair<String, Int>> {
        val lista = mutableListOf<Pair<String, Int>>()
        val db = readableDatabase
        val cursor = db.query(
            TABLE_LIVROS,
            arrayOf(COLUNA_ID, COLUNA_TITULO, COLUNA_ANO),
            null, null, null, null,
            "$COLUNA_ANO DESC"          // ← novidade: ordenado por ano, mais recente primeiro
        )
        cursor.use { c ->
            while (c.moveToNext()) {
                val titulo = c.getString(c.getColumnIndexOrThrow(COLUNA_TITULO))
                val ano    = c.getInt(c.getColumnIndexOrThrow(COLUNA_ANO))
                lista.add(Pair(titulo, ano))
            }
        }
        db.close()
        return lista
    }

    fun excluirLivro(titulo: String): Int {          // ← funcionalidade nova: exclusão
        val db = writableDatabase
        val removidos = db.delete(TABLE_LIVROS, "$COLUNA_TITULO = ?", arrayOf(titulo))
        db.close()
        return removidos
    }
}