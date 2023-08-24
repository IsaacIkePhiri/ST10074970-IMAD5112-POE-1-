package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterNum = findViewById<TextView>(R.id.enterNum)
        val enterNum1 = findViewById<TextView>(R.id.enterNum1)
        val enterNum2 = findViewById<TextView>(R.id.enterNum2)
        val myAnswer = findViewById<TextView>(R.id.myAnswer)
        val myAddition = findViewById<TextView>(R.id.myAddition)
        val mySubtraction = findViewById<TextView>(R.id.mySubtraction)
        val myDivision = findViewById<TextView>(R.id.myDivision)
        val myMultiplication = findViewById<TextView>(R.id.myMultiplication)

        myAddition.setOnClickListener {
            var res1 = enterNum1.text.toString().toInt()
            var res2 = enterNum2.text.toString().toInt()
            var add = res1 + res2
            myAnswer.text = "{$res1} + {$res2} = ${add}"
        }
        mySubtraction.setOnClickListener {
            var res1 = enterNum1.text.toString().toInt()
            var res2 = enterNum2.text.toString().toInt()
            var minus = res1 - res2
            myAnswer.text = "{$res1} - {$res2} = ${minus}"
        }
        myMultiplication.setOnClickListener {
            var res1 = enterNum1.text.toString().toInt()
            var res2 = enterNum2.text.toString().toInt()
            var multiply = res1 * res2
            myAnswer.text = "{$res1} * {$res2}${multiply}"
        }
        myDivision.setOnClickListener {
            var res1 = enterNum1.text.toString().toInt()
            var res2 = enterNum2.text.toString().toInt()
            var div = res1 / res2
            myAnswer.text = "{$res1} / {$res2}${div}"
        }
    }
}

