/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

annotation class CustomAnnotation

@CustomAnnotation
class Value<T>(var internalValue: T? = null) {
    fun changeValue(newValue: T) {
        internalValue = newValue
    }
    fun currentValue(): T? = internalValue
    fun get(): T = internalValue!!
    fun assign(value: T) {
        println("Assigning $value")
        changeValue(value)
    }

    override fun toString() = "$internalValue"

}

class AlwaysValued<T>(internalValue: T) : Value<T>(internalValue)
