package com.needletipson.guga.activityresultexample

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.vicky.permission.PathUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.io.FileInputStream

const val FILE_PICKER_ID = 12

class MainActivity : AppCompatActivity() {

    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        btn_read.setOnClickListener({
            var intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "*/*"
            startActivityForResult(intent, FILE_PICKER_ID)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == FILE_PICKER_ID && resultCode == Activity.RESULT_OK){
            val dest = File(PathUtils.getPath(context, data!!.data))
            val readData = FileInputStream(dest).bufferedReader().use { it.readText() }
            tv_read_data.text = readData
        }
    }
}
