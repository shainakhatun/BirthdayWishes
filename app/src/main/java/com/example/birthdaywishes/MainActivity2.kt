package com.example.birthdaywishes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var txt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txt = findViewById(R.id.birthdayGreeting)
        val name = intent.getStringExtra("name")
        txt.text = "Happy Birthday \n$name ! :)"
    }
}