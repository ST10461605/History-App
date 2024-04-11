package com.example.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declarations
        val compareButton = findViewById<Button>(R.id.compareButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val ResultTextView = findViewById<TextView>(R.id.ResultTextView)
        val NumTextNumber = findViewById<EditText>(R.id.NumTextNumber)
        compareButton.setOnClickListener {


        //if else statement
        val age = NumTextNumber.text.toString().toIntOrNull()
        if (age == null) {
            ResultTextView.text = "Please enter a valid age"
        } else {
        if (age < 20 || age > 100) {
        ResultTextView.text = "Please enter a age between 20 and 100"
            NumTextNumber.text.clear()
        }else {
        //The 10 people i chose
            val result = when (age) {
            25 -> "Mongezi Stuurman, known professionally as a South African rapper,fashion designer and producer"
            34 -> "Rikhado Makhado, known professionally  as a South African rapper,singer and entreprenuer"
            35 -> "Kiernan Forbes, was a muscian and best selling hip hop artist"
            36 -> "Bulelwa Mkutukana, was a South African singer,songwriter and guitarist"
            44 -> "Noxolo Maqashalala, was a famous South African actor"
            45 -> "Lindiwe Ndlovu, was a famous actor known for her role in sarafina"
            47 -> "Shona  Ferguson, known professionally as a South African producer and actor"
            56 -> "Menzi Ngubane was a famous South African actor"
            62 -> "Steve Kekana, was one of South African most popular singer"
            96 -> "Queen Elizabeth II, was a dedicated head of the commonwealth, linking more than two billion people worldwide"

                else -> "no one died at this age"

            }
            ResultTextView.text = result
        }
            clearButton.setOnClickListener {
                NumTextNumber.text.clear()
                ResultTextView.text = ""
            }
        }



    }
}}