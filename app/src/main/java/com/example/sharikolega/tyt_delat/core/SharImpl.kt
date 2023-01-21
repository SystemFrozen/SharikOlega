package com.example.sharikolega.tyt_delat.core

class SharImpl(private val answersRandomGenerator: AnswersRandomGenerator) : Shar {

    override fun generateAnswer(): String = answersRandomGenerator.generate().answerString
}