package com.example.mykotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivision: Button
    lateinit var etA:EditText
    lateinit var etB:EditText
    lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd=findViewById(R.id.addition)
        btnSub=findViewById(R.id.subtraction)
        btnMultiply=findViewById(R.id.multiplication)
        btnDivision=findViewById(R.id.division)
        etA=findViewById(R.id.et_a)
        etB=findViewById(R.id.et_b)
        resultTextView=findViewById(R.id.result)

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble();
        var b = etB.text.toString().toDouble();
        var result = 0.0

        when(v?.id){
            R.id.addition -> {
                result=a+b
            }
            R.id.subtraction -> {
                result=a-b
            }
            R.id.multiplication -> {
                result=a*b
            }
            R.id.division -> {
                result=a/b
            }
        }
        resultTextView.text="Result is $result"
    }
}