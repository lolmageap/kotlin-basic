package com.example.kotilnstudy.study

import java.util.Collections


fun main() {
    printHello()

    val list = mutableListOf(printHello)
    val func = list[0]
    func()

    call(printHello)
    call(func)

    val mutableListOf = mutableListOf(printNo())
//    call(printNo())

    printMessage4("안녕", 3)
    println("더하기 시작 : ${ plus(5,19) }")

    val stringList = listOf("a", "b", "c", "d", "e", "f")

//    forEachStr(stringList, printMessage3)
//
//    stringList.forEach(printMessage2)

//    stringList.map {
//        item ->
//        val uppercase = item.uppercase()
//        println(uppercase)
//    }

    val uppercase : (String) -> String = { it.uppercase() }

    val map = stringList.map(uppercase)
    forEachStr(map, printMessage)

    forEachStr(map) {
        printMessage(it)
    }

    outerFunc()()

    callReference()
    callReference2()

    val numberList = listOf("1", "2", "3")

    numberList.map { it.toInt() }
            .forEach { println(it) }

    numberList.map(String::toInt).forEach(::println)


}

val func : () -> Unit = { }

val function : () -> String = { "" }

val printHello : () -> Unit = { println("hello") }

fun printNo() { println("NO!!") }

val printMessage : (String) -> Unit = {
    message : String -> println(message)
}

val printMessage2 : (String) -> Unit = {
    message -> println(message)
}

val printMessage3 : (String) -> Unit = { println(it) }

val printMessage4 : (String, Int) -> Unit = {
    a, b ->
    println(a)
    println(b)
    println(a + b)
}

val plus : (Int, Int) -> Int = {
        a, b -> a + b
}

fun call(block : () -> Unit){
        block()
}

fun printHello2() { println("hello") }

fun forEachStr(collections: Collection<String>, action: (String) -> Unit) {

    for (item in collections){
        action(item)
    }

}

fun forEach(collections: Collection<Any>, action: (Any) -> Unit) {
    for (item in collections){
        action(item)
    }
}

fun outerFunc() : () -> Unit {
    return fun() {
        println("이것은 익명함수!")
    }
}

fun outerFunc2() : () -> Unit {
    return {
        println("이것은 익명함수!")
    }

}

fun outerFunc3() : () -> Unit = { println("이것은 익명함수!") }

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y}

val sum2 = { x: Int, y: Int -> x + y}

val callReference : () -> Unit = { printHello() }
val callReference2 = ::printHello