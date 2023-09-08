package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var addButton : Button
    private lateinit var multButton : Button
    private lateinit var divideButton : Button
    private lateinit var subtractButton : Button
    private lateinit var viewModel : MainActivityViewModel
    private lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel :: class.java)
        addButton = findViewById(R.id.addButton)
        multButton = findViewById(R.id.multButton)
        divideButton = findViewById(R.id.divideButton)
        subtractButton = findViewById(R.id.subtractButton)
        result = findViewById(R.id.result)

        var number1 = findViewById(R.id.number1) as EditText
        var number2 = findViewById(R.id.number2) as EditText

        addButton.setOnClickListener {
            if (number1.text.isNotEmpty() && number2.text.isNotEmpty()){
                var var1 = number1.text.toString().toInt()
                var var2 = number2.text.toString().toInt()
                viewModel.addition(var1, var2)
                result.text = "Addition Result: " + viewModel.result.toString()
            }
        }
        multButton.setOnClickListener {
            if (number1.text.isNotEmpty() && number2.text.isNotEmpty()){
                var var3 = number1.text.toString().toInt()
                var var4 = number2.text.toString().toInt()
                viewModel.multiplication(var3, var4)
                result.text = "Multiplication Result: " + viewModel.result.toString()
            }
        }
        divideButton.setOnClickListener {
            if (number1.text.isNotEmpty() && number2.text.isNotEmpty()){
                var var3 = number1.text.toString().toInt()
                var var4 = number2.text.toString().toInt()
                viewModel.division(var3, var4)
                result.text = "Division Result: " + viewModel.result.toString()
            }
        }
        subtractButton.setOnClickListener {
            if (number1.text.isNotEmpty() && number2.text.isNotEmpty()){
                var var3 = number1.text.toString().toInt()
                var var4 = number2.text.toString().toInt()
                viewModel.subtraction(var3, var4)
                result.text = "Subtraction Result: " + viewModel.result.toString()
            }
        }
    }
}