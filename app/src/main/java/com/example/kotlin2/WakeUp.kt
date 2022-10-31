package com.example.kotlin2

import android.app.Activity
import android.view.Window
import android.view.WindowManager




class WakeUp (act: Activity)
{
    init {
        val w: Window = act.getWindow() // in Activity's onCreate() for instance

        w.setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON, WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON, )

    }
}