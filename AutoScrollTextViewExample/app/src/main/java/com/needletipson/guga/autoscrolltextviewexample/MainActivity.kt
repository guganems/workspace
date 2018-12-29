package com.needletipson.guga.autoscrolltextviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_data.setSingleLine()
        tv_data.isSelected = true
        tv_data.text = getString(R.string.scrollable_text)

    }
}
