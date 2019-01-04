package com.needletipson.guga.intentserviceexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

const val TYPEONE = 1
const val TYPETWO = 2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, MyIntentService::class.java)
        startService(intent)
        intent.putExtra("type", TYPEONE)
        val intent2 = Intent(this, MyIntentService::class.java)
        intent2.putExtra("type", TYPETWO)
        startService(intent2)
    }
}
