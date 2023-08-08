package com.example.kotilnstudy.study

import java.util.LinkedList

fun main() {

    val immutableList = listOf("달러", "유로", "원")

//    val mutableList = mutableListOf<String>()
//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")

    val mutableList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    val intMutableSet = setOf(1, 2, 3, 4)

    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    val immutableMap = mapOf("one" to 1, "two" to 2)

//    val mutableMap = mutableMapOf<String, Int>().apply {
//        put("one", 1)
//        put("two", 2)
//        put("three", 3)
//    }

    val mutableMap = mutableMapOf<String, Int>()
    mutableMap["one"] = 1
    mutableMap["two"] = 2
    mutableMap["three"] = 3

    // 컬렉션 빌더는 내부에서는 mutable 반환은 immutable
    // mutable 한 방식으로 immutable 객체를 생성
    val buildList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
        add(4)
        add(5)
    }

    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    val arrayList = arrayListOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = immutableList.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }

    println("=============")

    for (list in immutableList) {
        println(list)
    }

    println("=============")

    immutableList.forEach {
        println(it)
    }

    println("=============")

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
    val upperList = mutableListOf<String>()

    for (lower in lowerList) {
        upperList.add( lower.uppercase() )
    }

    println(upperList)

    println("=============")

    val upperList2 = lowerList.map { it.uppercase() }
    println(upperList2)

    println("=============")

    val filteredList = mutableListOf<String>()
    for (upper in upperList) {
        if (upper == "A" || upper == "C")
            filteredList.add(upper)
    }
    println(filteredList)


    println("=============")


    val filter = upperList.filter { it == "A" || it == "C" }
    println(filter)


    println("=============")
}

