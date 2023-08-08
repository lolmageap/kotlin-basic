package com.example.kotilnstudy.study

import com.example.kotilnstudy.study.DateTimeUtils.same
import com.example.kotilnstudy.study.Singleton.printA
import java.time.LocalDateTime

object Singleton {
    val a = 1234
    fun printA() = println(a)
}

object DateTimeUtils {

    val now : LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime) : Boolean {
        return a == b
    }

}

class MyClass {

    private constructor()

    companion object MyCompanion{
        val a = 1234

        fun newInstance() = MyClass()
    }

}

fun main() {

    println(Singleton.a)
    printA()

    println(DateTimeUtils.now)
    println(DateTimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()

    println(same(now, now))

    println(MyClass.a)
    println(MyClass.newInstance())

}
