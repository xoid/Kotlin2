package com.example.kotlin2

import android.app.Activity

class Words(act: Activity)
{
    var db:DB
    init {
        db = DB(act)
    }
}