package com.lightbulbs

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var bulboff=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    @SuppressLint("SetTextI18n")
    private fun init() {
        btnStart.setOnClickListener {

            bulboff = !bulboff

            if(bulboff){
                (img_.drawable as TransitionDrawable).startTransition(3000)
                btnStart.text="ON"
                btnStart.setBackgroundColor(Color.GREEN)
            } else {
                (img_.drawable as TransitionDrawable).reverseTransition(3000)
                btnStart.text="OFF"
                btnStart.setBackgroundColor(Color.RED)
            }

        }

    }
}
