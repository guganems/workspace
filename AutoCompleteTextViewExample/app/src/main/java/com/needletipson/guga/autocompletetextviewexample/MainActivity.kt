package com.needletipson.guga.autocompletetextviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val suggestion = arrayOf("Apple", "Google", "Samsung", "Huawei", "HTC")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, suggestion)
        autocompletetextview.threshold = 0
        autocompletetextview.setAdapter(adapter)
        autocompletetextview.setOnFocusChangeListener { _, b -> if(b) autocompletetextview.showDropDown() }
    }
}
