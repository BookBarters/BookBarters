package com.github.mustafaozhan.bookbarter.common

import org.junit.Assert.assertTrue
import org.junit.Test

class GreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check JVM is mentioned", Greeting().greeting().contains("JVM"))
    }
}