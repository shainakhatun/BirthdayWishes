package com.example.birthdaywishes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.edtTxtName)
    }

    fun birthDayCard(view: View) {

        val name = name.editableText.toString()

        Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()

        val intent = Intent (this, MainActivity2 :: class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}