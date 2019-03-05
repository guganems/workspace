@file:Suppress("DEPRECATION")

package com.needletipson.guga.demoasynctask

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import android.net.ConnectivityManager
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONException

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    lateinit var context : Context
    var hasInternet = false
    var questionList : MutableList<Question> = ArrayList()
    var index = -1
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        btn_next.isEnabled = false
        btn_next.alpha = 0.5.toFloat()
        GetQuestions().execute()
    }

    fun updateQuestion(){
        val selected = rg_choice.checkedRadioButtonId
        if (selected == -1){
            Toast.makeText(this, "Please, select answer.", Toast.LENGTH_SHORT).show()
            return
        }

        if (index < questionList.size){
            when(selected){
                rb_choice1.id -> {
                    if (questionList[index].Answer == 1)
                        score++
                }
                rb_choice2.id -> {
                    if (questionList[index].Answer == 2)
                        score++
                }
                rb_choice3.id -> {
                    if (questionList[index].Answer == 3)
                        score++
                }
                rb_choice4.id -> {
                    if (questionList[index].Answer == 4)
                        score++
                }
            }

            index++
            if (index < questionList.size){
                tv_question.text = questionList[index].Question
                rb_choice1.text = questionList[index].Option1
                rb_choice2.text = questionList[index].Option2
                rb_choice3.text = questionList[index].Option3
                rb_choice4.text = questionList[index].Option4
                rg_choice.clearCheck()

                if ((index+1) == questionList.size)
                    btn_next.text = getString(R.string.finish)
            }
            else{
                val dialog = AlertDialog.Builder(context)
                dialog.setTitle("Your score")
                dialog.setMessage("You have answered " + score + " out of " + questionList.size + " Questions correctly.")
                dialog.setPositiveButton("Close") { dialogInterface: DialogInterface, _: Int ->
                    dialogInterface.dismiss()
                    finish()
                }
                dialog.show()
            }
        }
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
                try {
                    val resultArray = JSONArray(result)

                    for (i in 0..(resultArray.length()-1)){
                        val currentObject = resultArray.getJSONObject(i)
                        val obj = Question()
                        obj.Question = currentObject.getString("Question")
                        obj.Option1 = currentObject.getString("Option1")
                        obj.Option2 = currentObject.getString("Option2")
                        obj.Option3 = currentObject.getString("Option3")
                        obj.Option4 = currentObject.getString("Option4")
                        obj.Answer = currentObject.getInt("Answer")
                        questionList.add(obj)
                    }

                    if (index == -1){
                        index++
                        tv_question.text = questionList[index].Question
                        rb_choice1.text = questionList[index].Option1
                        rb_choice2.text = questionList[index].Option2
                        rb_choice3.text = questionList[index].Option3
                        rb_choice4.text = questionList[index].Option4
                    }

                    btn_next.isEnabled = true
                    btn_next.alpha = 1.toFloat()

                    btn_next.setOnClickListener {
                        updateQuestion()
                    }
                }
                catch (e: JSONException){

                }
            }
        }
    }

    private fun isNetworkAvailable() : Boolean{
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }
}
