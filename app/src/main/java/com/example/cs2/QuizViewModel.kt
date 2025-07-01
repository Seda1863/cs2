package com.example.cs2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {
    private val _resultMessage = MutableLiveData<String>()
    val resultMessage: LiveData<String> = _resultMessage

    init {
        calculateResult()
    }

    private fun calculateResult() {
        // Örnek doğru/yanlış cevabı belirleme
        val correctAnswers = 2

        _resultMessage.value = if (correctAnswers > 1) {
            "Kazandınız!"
        } else {
            "Kaybettiniz!"
        }
    }
}