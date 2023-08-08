package com.example.kotilnstudy.study

fun main() {
    val a : String? = null
//    println(a?.length)

//    var b : String = "tree"
//    b = null.toString()
//    println(b)

//    val c = a?.length ?: 0
//    println(c)

    val nullStr = getNullStr()
    val nullableLength = nullStr?.length ?: 0
    println(nullableLength)

    val nullLength = getLengthIfNotNull(null)
    println(nullLength)
}

fun getNullStr() : String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

