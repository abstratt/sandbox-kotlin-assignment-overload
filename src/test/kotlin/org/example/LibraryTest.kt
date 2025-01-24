/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.assign
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class LibraryTest {
    @Test
    fun changeValue() {
        val value = Value(20)
        assertEquals(20, value.currentValue())
        value.changeValue(30)
        assertEquals(30, value.currentValue())
    }

    @Test
    fun defaultConstructor() {
        var value = Value<Int>()
        assertEquals(null, value.currentValue())
        //value = 30
        assertEquals(30, value.currentValue())
    }

    @Test
    fun operator() {
        var value = Value(20)
        assertEquals(20, value.currentValue())
        //value = 30
        assertEquals(30, value.currentValue())
    }
}
