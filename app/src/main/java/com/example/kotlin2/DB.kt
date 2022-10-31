package com.example.kotlin2

import android.app.Activity
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class DB(act: Activity, var dbh: SQLiteDatabase = act.openOrCreateDatabase("WORDS", Context.MODE_PRIVATE, null))
{
    init
    {        readAll()     }

    fun readAll()
    {
        val sql = "SELECT * FROM words"
        val cursor = dbh.rawQuery(sql, null)
        while (cursor.moveToNext())
        {
            val id       = cursor.getInt(0)
            val filename = cursor.getString(1)
            val status   = cursor.getInt(2)
        }
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
