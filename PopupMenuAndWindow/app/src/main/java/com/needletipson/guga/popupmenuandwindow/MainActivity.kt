package com.needletipson.guga.popupmenuandwindow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_popup.setOnClickListener {
            val popup = PopupMenu(this, btn_show_popup)
        }
    }
}
