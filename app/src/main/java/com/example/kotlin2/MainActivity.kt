package com.example.kotlin2

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


@RequiresApi(Build.VERSION_CODES.O_MR1)
class MainActivity : AppCompatActivity()
{
    lateinit var tts:TTS
    lateinit var hs:HeadSet
    lateinit var words:Words

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTurnScreenOn(true)

        tts   = TTS(this); tts.say("lol")
        hs    = HeadSet(this)
        words = Words(this)
    }

    fun toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}