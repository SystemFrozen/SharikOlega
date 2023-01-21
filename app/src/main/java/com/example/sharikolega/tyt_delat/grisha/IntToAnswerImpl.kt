package com.example.sharikolega.tyt_delat.grisha

import com.example.sharikolega.tyt_delat.core.Answers

class IntToAnswerImpl : IntToAnswer {
    override fun map(answerOrdinal: Int): Answers {
        return Answers.values().find { it.ordinal == answerOrdinal }
            ?: throw IllegalStateException("Такого ответа нету")
    }
}

interface IntToAnswer {
    fun map(randomInt: Int): Answers
}