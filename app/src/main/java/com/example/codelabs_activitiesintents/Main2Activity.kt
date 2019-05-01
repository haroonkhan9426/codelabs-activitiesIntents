package com.example.codelabs_activitiesintents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textView: TextView = findViewById(R.id.textView)
        val extras = intent.extras ?: return
        val message: String = extras.getString("message")
        textView.text = message

    }
}
