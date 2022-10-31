package com.example.kotlin2

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.view.KeyEvent
import android.widget.Toast

class HeadSet(val act: Activity) : BroadcastReceiver()
{
    init {
        //Toast.makeText(act, "INIT", Toast.LENGTH_LONG).show()
    }
    override fun onReceive(context: Context, intent: Intent)
    {
        Toast.makeText(act, "INIT", Toast.LENGTH_LONG).show()
        val intentAction = intent.action
        if (Intent.ACTION_MEDIA_BUTTON != intentAction)  return
        val event = intent.getParcelableExtra<Parcelable>(Intent.EXTRA_KEY_EVENT) as KeyEvent? ?: return
        val action = event.action
        if (action == KeyEvent.ACTION_UP)
        {
            //Words.iKnow()
            Toast.makeText(act, "learned!", Toast.LENGTH_LONG).show()
        }
        //abortBroadcast()
    }
}
