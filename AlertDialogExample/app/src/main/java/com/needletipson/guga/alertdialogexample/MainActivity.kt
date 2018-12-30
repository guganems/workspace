package com.needletipson.guga.alertdialogexample

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Are you sure?!")
        builder.setMessage("Do you want to close the app?")
        builder.setPositiveButton("Yes") { _: DialogInterface, _: Int ->
            finish()
        }
        builder.setNegativeButton("No") { _: DialogInterface, _: Int -> }
        builder.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
