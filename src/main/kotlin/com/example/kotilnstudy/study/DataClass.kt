package com.example.kotilnstudy.study

data class DataClass( val name : String , val age : Int, val nickname : String, val height : Int )

class Person( val name : String , val age : Int)

fun main() {

//    val person1 = Person(name = "tony", age = 12)
//    val person2 = Person(name = "tony", age = 12)
//
//    println(person1 == person2)

    val person1 = DataClass(name = "tony", age = 12, nickname = "토니", height = 10)
    val person2 = DataClass(name = "tony", age = 12, nickname = "토니", height = 10)

    println(person1 == person2)

    // copy
    val copyPerson = person1.copy(name = "antony", age = 24)
    println(copyPerson)

    // component n

    println("이름 = ${person1.component1()}, 나이 = ${person1.component2()}")

    val (name, age, nickname, height) = person1
    println("이름 = ${name}, 나이 = ${age}")

}
