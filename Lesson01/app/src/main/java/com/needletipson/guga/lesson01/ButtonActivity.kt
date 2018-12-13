package com.needletipson.guga.lesson01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ButtonActivity : AppCompatActivity() {

    private lateinit var btnClickMe: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        btnClickMe = findViewById(R.id.btn_click_me)
        btnClickMe.setOnClickListener {
            btnClickMe.text = getString(R.string.btn_click)
        }

        btnClickMe.setOnLongClickListener{
            btnClickMe.text = getString(R.string.long_click)
            false
        }
    }
}
