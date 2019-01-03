package com.needletipson.guga.alarmmanagerexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    class Receiver : BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            Log.d("MainActivity", "Receiver: " + Date().toString() )
        }
    }
}
