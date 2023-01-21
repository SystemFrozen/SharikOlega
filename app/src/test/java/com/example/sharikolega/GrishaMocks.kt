package com.example.sharikolega

import com.example.sharikolega.tyt_delat.core.AnswersRandomGenerator
import com.example.sharikolega.tyt_delat.core.Answers

class GrishaMocks {

    class MockAnswersRandomGenerator(private val answer: Answers) : AnswersRandomGenerator {
        override fun generate() = answer
    }


    class MockAnswersExceptionRandom() : AnswersRandomGenerator {
        override fun generate() = throw IllegalStateException()
    }
}