package com.example.kotilnstudy.study

fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우에만 출력")
    else println("널이 아닌경우 출력")
}

fun main() {
    println("ABCD".first())

    println("ABCD".addFirst('Z'))

    val myExample = MyExample()
    myExample.printMessage()
    myExample.printNullOrNotNull()

    val myExample2 : MyExample? = null
    myExample2.printNullOrNotNull();

    myExample2?.printNullOrNotNull();
}

