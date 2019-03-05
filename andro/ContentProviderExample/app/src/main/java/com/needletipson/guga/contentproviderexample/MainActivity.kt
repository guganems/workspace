package com.needletipson.guga.contentproviderexample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        getContacts()
    }

    fun getContacts(){
        val Contacts : MutableList<String> = ArrayList()
        val cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null)
        if (cursor != null && cursor.moveToFirst()){
            do{
                val name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME))
                Log.d("getContacts", "name " + name)
                Contacts.add(name)
            }while (cursor.moveToNext())
            cursor.close()
        }
        autocomplete.setAdapter(ArrayAdapter(context, android.R.layout.simple_list_item_1, Contacts))
        autocomplete.threshold = 1

        autocomplete.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(context, "Selected Contact: " + p0?.getItemAtPosition(p2), Toast.LENGTH_SHORT).show()
            }

        }
    }
}
