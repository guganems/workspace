package com.needletipson.guga.snackbarexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show.setOnClickListener {
            val snackbar = Snackbar.make(root_layout, "Welcome to nowhere", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Close", View.OnClickListener {
                snackbar.dismiss()
            })
            snackbar.setActionTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
            val view = snackbar.view
            val text = view.findViewById<TextView>(android.support.design.R.id.snackbar_text)
            text.setTextColor(ContextCompat.getColor(this, R.color.colorAccent))
            snackbar.show()
        }
    }
}
