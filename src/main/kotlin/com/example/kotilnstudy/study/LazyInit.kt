package com.example.kotilnstudy.study

class HelloBot {
//    val greeting : String by lazy(LazyThreadSafetyMode.NONE) {
//        println("초기화 로직 수행")
//        getHello()
//    }
    val greeting : String by lazy {
        println("초기화 로직 수행")
        getHello()
    }
    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    for (i in 1..5){
        Thread{
            helloBot.sayHello()
        }.start()
    }

}

