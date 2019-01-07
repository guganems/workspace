package com.needletipson.guga.popupmenuandwindow

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_popup.setOnClickListener {
//            val popup = PopupMenu(this, btn_show_popup)
//            popup.inflate(R.menu.test)
//            popup.setOnMenuItemClickListener {
//                Toast.makeText(this, "Item: " + it.title, Toast.LENGTH_SHORT).show()
//                true
//            }
//            popup.show()
            val windows = PopupWindow(this)
            val view = layoutInflater.inflate(R.layout.layour_popup, null)
            windows.contentView = view
            val imageView = view.findViewById<ImageView>(R.id.imageView)
            imageView.setOnClickListener {
                windows.dismiss()
            }
            windows.showAsDropDown(btn_show_popup)
        }
    }
}
