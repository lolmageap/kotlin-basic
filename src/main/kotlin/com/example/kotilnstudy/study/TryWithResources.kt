package com.example.kotilnstudy.study

import java.io.FileWriter


fun main() {

    runCatching()

}

fun use(){
    FileWriter("test.txt")
            .use {
                it.write("Hello World")
            }

}

fun getStr(): Nothing = throw Exception("예외 발생 메시지")

fun runCatching(){

//    val result = try {
//        getStr()
//    } catch (e : Exception){
//        println(e.message)
//        "기본값"
//    }

    val result = runCatching {
        getStr()
    }.getOrElse {
        println(it.message)
        "기본값"
    }

    println(result)

    val result2 = runCatching {
        getStr()
    }.getOrNull()

    println(result2)

    val result3 = runCatching {
        getStr()
    }.exceptionOrNull()

    println(result3)

    val result4 = runCatching {
        getStr()
    }.getOrDefault("result")

    println(result4)

    val result5 = runCatching { "getStr()" }
            .getOrThrow()

    println(result5)

    val result6 = runCatching { "안녕" }
            .map {
                "${it}하세요"
            }
            .getOrThrow()

    println(result6)

    // map 안에서 에러가 발생하면 getOrDefault 와 같은 에러 처리가 동작하지 않는다.
    // 이럴때는 mapCatching 을 사용해야함
    val result7 = runCatching { "안녕" }
            .mapCatching {
              throw Exception("예외")
            }
            .getOrDefault("기본값")

    println(result7)

    val result8 = runCatching { getStr() }
            .recover {
                "복구"
            }
            .getOrNull()

    println(result8)

    val result9 = runCatching { getStr() }
            .recoverCatching {
                println("복구중")
                throw Exception("예외")
            }
            .getOrDefault("복구 완료")

    println(result9)
}