package com.example.kotilnstudy.study

class Client {
    var url: String? = null
    var username: String? = null
    var password: String? = null

    fun connect(): Boolean {
        println("DB 접속 중 ...")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true
    }
}

fun main() {
    basic()
    let()
    run()
    with()
    apply()
    also()
}

fun basic() {
    val config = Client()
    config.url = "localhost:3306"
    config.username = "mysql"
    config.password = "1234"
    config.connect()
}

// let 은 null 이 아닌 경우 새로운 값을 반환 하고 싶을 때
fun let() {

    val str : String? = null
    val str2 : String? = "hello"

    // null 이 아닌경우에만 동작
    val result = str?.let {

        println(it)

        "1234"
    }
//    println(result)

    val result2 = str2?.let {
        println(it)

        1234
    }
    println(result2)

    val connected = Client().let {
        it.url = "localhost:3306"
        it.username = "mysql"
        it.password = "1234"
        it.connect()
    }

//    result.let { a : String ->
//
//        println(a.length)
//
//        result2.let { b : String ->
//            println(b.length)
//        }
//
//    }

}

// run 은 수신 객체의 property 를 구성할 때 많이 사용
fun run() {
    val connected: Boolean = Client().run {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(connected)
}

fun with() {

    val str = "안녕하세요"

    with(str) {
        println("length = $length")
    }

    val with = with(str) {
        length
    }
    println(with)

    val connected = with(Client()) {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
}

// 수신객체의 property 를 구성하고 수신객체의 결과를 반환하고 싶을 때 사용
fun apply() {
    val apply: Client = Client().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }

    val connect = apply.connect()
    println(connect)
}

class User(private val name : String, private val password : String) {
    fun validate() {
        if (name.isNotEmpty() && password.isNotEmpty()){
            println("검증 성공")
        } else{
            println("검증 실패")
        }


    }

    fun printName() = println(name)
}


// 수신객체의 property 를 구성하고 수신객체의 결과를 반환하고 싶을 때 사용
fun also() {
    val user = User(name = "tony", password = "1234").also {
        it.validate()
        it.printName()
    }
}
