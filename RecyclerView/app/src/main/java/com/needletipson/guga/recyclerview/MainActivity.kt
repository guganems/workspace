package com.needletipson.guga.recyclerview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.country_child.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var countryList: RecyclerView
    private var countries: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
        countryList = findViewById(R.id.country_list)
        //country_list.layoutManager = LinearLayoutManager(this)
        countryList.layoutManager = GridLayoutManager(this, 2)
        countryList.adapter = CountryAdapter(countries, this)
    }

    class CountryAdapter(items: List<String>, ctx: Context): RecyclerView.Adapter<CountryAdapter.ViewHolder>(){

        var list = items
        var context = ctx

        class ViewHolder(v: View): RecyclerView.ViewHolder(v){
            val name = v.country_name!!
        }

        override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(context).inflate(R.layout.country_child, p0, false))
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
            p0.name.text = list[p1]
        }
    }

    private fun loadData(){
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
