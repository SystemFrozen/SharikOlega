package com.example.sharikolega.tyt_delat.grisha

import com.example.sharikolega.tyt_delat.core.Answer
import com.example.sharikolega.tyt_delat.core.Answers

class IntToAnswerImpl : IntToAnswer {
    override fun map(answerOrdinal: Int): Answer {
        val foundAnswer = Answers.values().find { it.ordinal == answerOrdinal }?.answerString
            ?: throw IllegalStateException("Такого ответа нету")

        return Answer(foundAnswer)
    }
}

interface IntToAnswer {
    fun map(randomInt: Int): Answer
}