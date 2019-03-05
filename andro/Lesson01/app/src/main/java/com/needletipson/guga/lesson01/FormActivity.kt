package com.needletipson.guga.lesson01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class FormActivity : AppCompatActivity() {

    private lateinit var rgGender: RadioGroup
    private lateinit var rbMale: RadioButton
    private lateinit var rbFemale: RadioButton

    private lateinit var cbEnglish: CheckBox
    private lateinit var cbGeorgian: CheckBox
    private lateinit var cbMegrelian: CheckBox

    private lateinit var btnSubmit: Button
    private lateinit var tvAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        rgGender = findViewById(R.id.rg_gender)
        rbMale = findViewById(R.id.rb_male)
        rbFemale = findViewById(R.id.rb_female)

        cbEnglish = findViewById(R.id.cb_english)
        cbGeorgian = findViewById(R.id.cb_georgian)
        cbMegrelian = findViewById(R.id.cb_megrelian)

        btnSubmit = findViewById(R.id.btn_submit)
        tvAnswer = findViewById(R.id.tv_answer)

        btnSubmit.setOnClickListener{
            var result = ""
            if(rgGender.checkedRadioButtonId != -1){
                result += "Selected gender: "
                if (rbMale.isChecked)
                    result += "male\n"
                else if(rbFemale.isChecked)
                    result += "female\n"
            }

            result += "Languages known: "

            if(cbEnglish.isChecked)
                result += "English, "
            if(cbGeorgian.isChecked)
                result += "Georgian, "
            if(cbMegrelian.isChecked)
                result += "Megrelian."

            tvAnswer.text = result
        }
    }
}
