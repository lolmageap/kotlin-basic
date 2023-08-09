package com.example.kotilnstudy.study


data class Tuple(val a : Int, val b : Int)

fun plus(tuple : Tuple) = tuple.a + tuple.b
fun plus(pair : Pair<Int, Int>) = pair.first + pair.second
fun plus(pair : Triple<String, String, String>) = pair.first + pair.second + pair.third

fun main() {

//    println(plus(1,3))
    val plus = plus( Tuple(1,3) )
    println(plus)

    val plus2 = plus( Pair(1,3) )
    println(plus)

    val pair = Pair("A", 1)
//    pair.first = "B"  // pair 내부 property 는 val 로 선언 되어있기 때문에 이거 안댐
    val newPair = pair.copy(first = "B")

    val second = newPair.component2()
    println(second)

    val list = newPair.toList()
    println(list)

    val triple = Triple("A","B", "C")
    println(triple)

    triple.first
    triple.second
    triple.third

    val newTriple = triple.copy(third = "D")
    println(newTriple)
    println(newTriple.third)

    val (a : String, b : String, c : String) = newTriple
    println("a = $a")
    println("b = $b")
    println("c = $c")

    val tripleList = newTriple.toList()
    println(tripleList)

    val (a1, a2, a3) = tripleList
    println("a1 = $a1, a2 = $a2, a3 = $a3")

    tripleList.component3()
//    tripleList.component6() // component5까지만 존재

    val map = mutableMapOf("정철희" to "자바", "김찬우" to "자바스크립트")
    for ((key, value) in map){
        println("key = $key, value = $value")
    }

////    to 내부도 pair 로 구성되어있음 그래서 아래와 같이 사용이 가능함
//    mutableMapOf(Pair("정철희", "자바"), Pair("김찬우", "자바스크립트"))

}
