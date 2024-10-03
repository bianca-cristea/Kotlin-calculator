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
import com.example.mykotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addition.setOnClickListener(this);
        binding.subtraction.setOnClickListener(this);
        binding.division.setOnClickListener(this);
        binding.multiplication.setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        var a = binding.etA.text.toString().toDouble();
        var b = binding.etB.text.toString().toDouble();
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
        binding.result.text="Result is $result"
    }
}