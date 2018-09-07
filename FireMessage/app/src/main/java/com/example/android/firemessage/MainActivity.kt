package com.example.android.firemessage

import android.app.Fragment
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.app.AppCompatDialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener{
            when (it.itemId){
                R.id.navigation_people ->{
                    //TODO: show people fragment
                    true
                }
                R.id.navigation_my_account ->{
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace()
        }
    }
}
