package com.needletipson.guga.lesson01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class SeekBarActivity : AppCompatActivity() {

    private lateinit var slider: SeekBar
    lateinit var value: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        slider = findViewById(R.id.sb_slider)
        value = findViewById(R.id.tv_result)

        slider.max = 50 // DEFAULT: 100

        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                value.text = "Seeking to: " + p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                value.text = "Started at: " + p0?.progress
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                value.text = "Selected: " + p0?.progress
            }
        })
    }
}
