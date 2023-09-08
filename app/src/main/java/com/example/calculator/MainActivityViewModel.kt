package com.example.calculator

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var result = 0

    fun addition(num1: Int, num2: Int): Int {
        result = num1 + num2
        return result
    }

    fun multiplication(num1: Int, num2: Int): Int {
        result = num1 * num2
        return result
    }

    fun division(num1: Int, num2: Int): Float {
        if (num2 == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        result = num1 / num2
        return result.toFloat()
    }

    fun subtraction(num1: Int, num2: Int): Float {
        if (num2 == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        result = num1 - num2
        return result.toFloat()
    }
}
