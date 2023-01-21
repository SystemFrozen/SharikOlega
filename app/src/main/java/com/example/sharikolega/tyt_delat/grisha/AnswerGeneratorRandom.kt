package com.example.sharikolega.tyt_delat.grisha

import com.example.sharikolega.tyt_delat.core.Answer
import com.example.sharikolega.tyt_delat.core.AnswerGenerator

class AnswerGeneratorRandom(private val intToAnswer: IntToAnswer) : AnswerGenerator {

    override fun generate(): Answer {
        val randomAnswerOrdinal = kotlin.random.Random.nextInt()

        return intToAnswer.map(randomAnswerOrdinal)
    }
}