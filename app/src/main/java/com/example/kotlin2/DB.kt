package com.example.kotlin2

import android.app.Activity
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Build
import androidx.annotation.RequiresApi

class DB(val act: MainActivity, var dbh: SQLiteDatabase = act.openOrCreateDatabase("WORDS", Context.MODE_PRIVATE, null))
{
    init     { readAll()  }
    lateinit var cursor:Cursor
    @RequiresApi(Build.VERSION_CODES.O_MR1)
    fun readAll()
    {
        val sqlall = "SELECT * FROM word"
        try {     cursor = dbh.rawQuery(sqlall, null)  }
        catch (e:Exception)
        {
            create_table();
            cursor = dbh.rawQuery(sqlall, null)
        }

        while (cursor.moveToNext())
        {
            var time  = cursor.getLong(0)
            val word1 = cursor.getString(1)
            val word2 = cursor.getInt(2)
            val id    = cursor.getInt(3)
            act.toast(word1 + " & " + word2)
        }
    }

    private fun create_table()
    {
        var sql="CREATE TABLE word (Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP, word1 TEXT, word2 TEXT, status INTEGER);"
        println (sql)
        dbh.execSQL(sql)
        sql = "INSERT INTO word VALUES (CURRENT_TIMESTAMP, \"book\", \"книга\", 10)"
        dbh.execSQL(sql)
    }

    fun select(table:String ,map:Map<String, Int>)
    {
        val where = ""
        dbh.execSQL("SELECT * FROM $table WHERE ")
    }

    fun create()
    {

    }

    fun writeAll()
    {

    }

    companion object
    {
        fun update(sql:String)
        {
            println("Companion object called")
        }
    }
}
