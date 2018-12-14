package com.needletipson.guga.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var country_list: RecyclerView
    var countries: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        country_list = findViewById(R.id.country_list) as RecyclerView
    }

    class CountryAdapter: RecyclerView.Adapter<>(){
        class ViewHolder(v: View): RecyclerView.ViewHolder(){
            
        }
    }

    fun loadData(){
        countries.add("Georgia")
        countries.add("USA")
        countries.add("Great Britain")
        countries.add("Zambia")
        countries.add("Russia")
        countries.add("Turkey")
        countries.add("France")
        countries.add("Germany")
        countries.add("Brazil")
        countries.add("Italy")
        countries.add("Argentina")
        countries.add("Uruguay")
        countries.add("Spain")
        countries.add("The Netherlands")
        countries.add("South African Republic")
        countries.add("Democratic Republic of Kongo")
        countries.add("Rwanda")
        countries.add("Zimbabwe")
        countries.add("Kenya")
        countries.add("Madagascar")
        countries.add("Togo")
        countries.add("Uganda")
        countries.add("Lesotho")
        countries.add("Namibia")
        countries.add("Tanzania")
        countries.add("Armenia")
    }
}
