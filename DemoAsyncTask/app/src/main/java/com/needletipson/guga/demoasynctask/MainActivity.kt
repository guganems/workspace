@file:Suppress("DEPRECATION")

package com.needletipson.guga.demoasynctask

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Context
import android.net.ConnectivityManager
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import okhttp3.Request

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    lateinit var context : Context
    var hasInternet = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        GetQuestions().execute()
    }

     @SuppressLint("StaticFieldLeak")
     internal inner class GetQuestions: AsyncTask<Void, Void, String>(){
        private lateinit var progressDialog : ProgressDialog

        override fun onPreExecute() {
            super.onPreExecute()
            progressDialog = ProgressDialog(context)
            progressDialog.setMessage("Downloading questions...")
            progressDialog.setCancelable(false)
            progressDialog.show()
        }

        override fun doInBackground(vararg p0: Void?): String {
            var responseToReturn = ""

            if (isNetworkAvailable()){
                hasInternet = true
                val client = OkHttpClient()
                val url = "https://script.googleusercontent.com/macros/echo?user_content_key=1tgBN-ES-vsiLin8Lggs7R094sUSEWlBY3Lv7yLt0KnrexUuaTvreORsTenxGH0HaPDQ0rUkXVqmkc903P_gQrpXCbi98gcsm5_BxDlH2jW0nuo2oDemN9CCS2h10ox_1xSncGQajx_ryfhECjZEnBg4Wj9So2Q_mI0_S0Bm21-AGmcRnplmVaRcxvVzvCi9cnQQJegsnVb9TgJzPufw35cdv3aNHr6K&lib=MKMzvVvSFmMa3ZLOyg67WCThf1WVRYg6Z"
                val request = Request.Builder().url(url).build()
                val response = client.newCall(request).execute()
                responseToReturn = response.body()?.string().toString()
            }

            return responseToReturn
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            progressDialog.dismiss()

            if (hasInternet){
                tv_result.text = result
            }
            else{
                tv_result.text = getString(R.string.no_internet)
            }
        }
    }

    private fun isNetworkAvailable() : Boolean{
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }
}
