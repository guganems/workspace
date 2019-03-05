package com.needletipson.guga.fbauthapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.facebook.AccessToken
import com.facebook.GraphRequest
import com.facebook.HttpMethod
import com.facebook.login.LoginManager
import com.facebook.GraphResponse
import com.google.firebase.database.*
import org.json.JSONObject



class AuthenticatedActivity : AppCompatActivity() {

    // [START declare_database_ref]
    private lateinit var database: DatabaseReference
    // [END declare_database_ref]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticated)

        database = FirebaseDatabase.getInstance().reference

        var btnLogout = findViewById<Button>(R.id.btn_logout)
        val message = findViewById<TextView>(R.id.message)

        btnLogout.setOnClickListener{
            val request = GraphRequest.newMeRequest(
                AccessToken.getCurrentAccessToken()
            ) { `object`, response ->
                Log.d("RESPONSE: ", response.jsonObject["name"].toString())

                var yourSweetieBday: String = response.jsonObject["birthday"].toString()
                var yourname: String = response.jsonObject["name"].toString()

                val shmuser = Shmuser(yourname, yourSweetieBday)
                Log.d("SHMUSER: ", shmuser.name)
                Log.d("SHMUSER: ", shmuser.bday)

                database.child("bdays").child(shmuser.name).setValue(shmuser)
                val contentChange = object : ValueEventListener{
                    override fun onCancelled(p0: DatabaseError) {
                        Log.d("DATARAVA: ", p0.toString())
                    }

                    override fun equals(other: Any?): Boolean {
                        return super.equals(other)
                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        Log.d("DATARAVA: ", "GOOD")
                    }
                }
                database.child("bdays").addListenerForSingleValueEvent(contentChange)

                message.text = response.jsonObject["name"].toString()
            }
            val parameters = Bundle()
            parameters.putString("fields", "id,name,birthday")
            request.parameters = parameters
            request.executeAsync()
        }
    }
}
