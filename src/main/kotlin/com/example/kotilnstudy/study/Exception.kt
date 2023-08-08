package com.example.kotilnstudy.study

fun main() {
//    try {
//        throw Exception()
//    } catch (e: Exception){
//        println("에러 발생")
//    } finally {
//        println("apply finally")
//    }

    val a = try {
        "1234".toInt()
    } catch (e: Exception){
        println("에러 발생")
    } finally {
        println("apply finally")
    }

    val b : String? = null

    val c : String = b ?: failTest(message = "예외 발생")

    println(c.length)
    println(a)
}

fun failTest(message: String = "exception 발생") : Nothing {
    throw IllegalArgumentException(message);
}

