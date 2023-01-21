package com.example.sharikolega

import com.example.sharikolega.tyt_delat.core.Answer
import com.example.sharikolega.tyt_delat.core.AnswerGenerator
import com.example.sharikolega.tyt_delat.core.Answers
import com.example.sharikolega.tyt_delat.core.Shar
import com.example.sharikolega.tyt_delat.grisha.AnswerGeneratorRandom

class GrishaMocks {

    class GrishaShar(
        private val answerGenerator: AnswerGenerator
    ) : Shar {
        override fun generateAnswer(): Answer = answerGenerator.generate()
    }

    class MockAnswerGenerator(private val answerInt: Answers) : AnswerGenerator {
        override fun generate(): Answer = Answer(answerInt.answerString)
    }
}