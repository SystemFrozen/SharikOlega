package com.example.sharikolega.tyt_delat.grisha

import com.example.sharikolega.tyt_delat.core.Answers
import com.example.sharikolega.tyt_delat.core.AnswersRandomGenerator

class AnswersRandomGenerator(private val intToAnswer: IntToAnswer) :
    AnswersRandomGenerator {

    override fun generate(): Answers {
        val randomAnswerOrdinal = kotlin.random.Random.nextInt()

        return intToAnswer.map(randomAnswerOrdinal)
    }
}