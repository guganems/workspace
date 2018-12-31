package com.needletipson.guga.progress2

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Downloading...")
        progressDialog.setCancelable(false)
        progressDialog.show()

        Handler().postDelayed({progressDialog.dismiss()}, 5000)
    }
}
