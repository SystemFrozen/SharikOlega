package com.example.sharikolega

import com.example.sharikolega.tyt_delat.core.Answer
import com.example.sharikolega.tyt_delat.core.Answers
import com.example.sharikolega.tyt_delat.core.Shar
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class SharTest {

    private lateinit var shar: Shar

    @Test
    fun addition_isCorrect() {
        val actual = shar.generateAnswer()
    }

    @Test
    fun `test shar return yes answer`() {
        val shar: Shar =

        val actual = shar.generateAnswer()
        val expected = Answer(Answers.YES.answerString)

        assertEquals(actual.answer, expected.answer)
    }

    @Test
    fun `test shar return no answer`() {
        val actual = shar.generateAnswer()
        val expected = Answer(Answers.NO.answerString)

        assertEquals(actual.answer, expected.answer)
    }

    @Test
    fun `test shar return not_sure answer`() {
        val actual = shar.generateAnswer()
        val expected = Answer(Answers.NOT_SURE.answerString)

        assertEquals(actual.answer, expected.answer)
    }

    @Test(expected = IllegalStateException::class)
    fun `test shar return exception not found answer`() {
        shar.generateAnswer()
    }
}