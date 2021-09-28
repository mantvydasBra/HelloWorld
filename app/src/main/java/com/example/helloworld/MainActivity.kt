package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtnClickChangeText(view: android.view.View) {
        val textView = findViewById<TextView>(R.id.tvMain)
        textView.setText("Hello world my first code in kotlin!").toString()
    }

    fun onBtnClickChangeColor(view: android.view.View) {
        val textView = findViewById<TextView>(R.id.tvMain)
        textView.setTextColor(Color.parseColor("#ff0000"))
    }
}