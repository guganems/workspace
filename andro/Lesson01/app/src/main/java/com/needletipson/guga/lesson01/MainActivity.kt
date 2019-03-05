package com.needletipson.guga.lesson01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv_hello_world_1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello_world_1 = findViewById(R.id.tv_hello_world_1) as TextView

        tv_hello_world_1.text = "Welcome WelcomeWelcome WelcomeWelcome WelcomeWelcome WelcomeWelcome WelcomeWelcome WelcomeWelcome WelcomeWelcome WelcomeWelcome Welcome"
        tv_hello_world_1.setSingleLine()
        tv_hello_world_1.ellipsize = TextUtils.TruncateAt.MARQUEE
        tv_hello_world_1.marqueeRepeatLimit = -1
        tv_hello_world_1.isSelected = true
    }
}
