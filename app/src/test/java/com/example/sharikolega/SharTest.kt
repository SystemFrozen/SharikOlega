package com.example.sharikolega

import com.example.sharikolega.tyt_delat.core.Answers
import com.example.sharikolega.tyt_delat.core.Shar
import com.example.sharikolega.tyt_delat.core.SharImpl
import com.example.sharikolega.tyt_delat.grisha.AnswersRandomGenerator
import com.example.sharikolega.tyt_delat.grisha.IntToAnswerImpl
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class SharTest {
    fun createShar(answer: Answers): Shar = SharImpl(GrishaMocks.MockAnswersRandomGenerator(answer))

    @Test
    fun `test return some answer`() {
        val shar: Shar = SharImpl(AnswersRandomGenerator(IntToAnswerImpl()))

        val actual = shar.generateAnswer()

        assertTrue(Answers.values().any { it.answerString == actual })
    }

    @Test
    fun `test shar return yes answer`() {
        val expectedAnswer = Answers.YES

        val shar: Shar = createShar(expectedAnswer)

        val actual = shar.generateAnswer()
        val expected = expectedAnswer.answerString

        assertEquals(actual, expected)
    }

    @Test
    fun `test shar return no answer`() {
        val expectedAnswer = Answers.NO

        val shar: Shar = createShar(expectedAnswer)

        val actual = shar.generateAnswer()
        val expected = expectedAnswer.answerString

        assertEquals(actual, expected)
    }

    @Test
    fun `test shar return not_sure answer`() {
        val expectedAnswer = Answers.NOT_SURE

        val shar: Shar = createShar(expectedAnswer)

        val actual = shar.generateAnswer()
        val expected = expectedAnswer.answerString

        assertEquals(actual, expected)
    }

    @Test(expected = IllegalStateException::class)
    fun `test shar return exception not found answer`() {
        val shar = SharImpl(GrishaMocks.MockAnswersExceptionRandom())

        shar.generateAnswer()
    }
}