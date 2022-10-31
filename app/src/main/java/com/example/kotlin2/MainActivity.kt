package com.example.kotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    private lateinit var tts:TTS
    private lateinit var hs:HeadSet
    private lateinit var words:Words

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tts   = TTS(this); tts.say("lol")
        hs    = HeadSet(this)
        words = Words(this)

    }

    fun toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}