package com.example.kotlin2

import android.app.Activity
import android.speech.tts.TextToSpeech

class TTS(val act: Activity): TextToSpeech.OnInitListener
{
    private lateinit var tts:TextToSpeech
    var ready = false

    override fun onInit(p0: Int)
    {
        val tts = TextToSpeech(act, this)
        ready = true
        say("speach init")
    }

    fun say(str:String)
    {
       if (ready) tts.speak(str, TextToSpeech.QUEUE_FLUSH, null,"")
    }

}