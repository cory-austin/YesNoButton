package com.bluey.yesnobutton

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_yes: Button = findViewById(R.id.yes_button)
        val btn_no: Button = findViewById(R.id.no_button)
        val mp_no: MediaPlayer = MediaPlayer.create(this, R.raw.no)
        val mp_yes: MediaPlayer = MediaPlayer.create(this, R.raw.yes)

        btn_yes.setOnClickListener() {
            mp_yes.start()
        }

        btn_no.setOnClickListener() {
            mp_no.start()
        }
    }



}