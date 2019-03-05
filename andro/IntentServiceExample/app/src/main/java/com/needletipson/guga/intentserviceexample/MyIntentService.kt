package com.needletipson.guga.intentserviceexample

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("MyIntentService") {
    override fun onHandleIntent(p0: Intent?) {

        when(p0?.getIntExtra("type", 0)){
            TYPEONE -> for (i in 1..5){
                            Log.d("MyIntentService", " Task1. " + i)
                            Thread.sleep(1000)
                        }

            TYPETWO -> for (i in 1..5){
                            Log.d("MyIntentService", " Task2. " + i)
                            Thread.sleep(1000)
                        }
        }


    }

}