package com.example.kotilnstudy.study


sealed class Developer {
    abstract var name : String
    abstract var age : Int
    abstract fun code(language: String)
}

data class BackEndDeveloper(override var age: Int, override var name: String) : Developer() {

    override fun code(language: String) {
        println("나는 백엔드 개발자다. ${language}를 사용한다")
    }

}

data class FrontEndDeveloper(override var age: Int, override var name: String) : Developer() {

    override fun code(language: String) {
        println("나는 프론트엔드 개발자다. ${language}를 사용한다")
    }

}

data class AndroidDeveloper(override var age: Int, override var name: String) : Developer() {

    override fun code(language: String) {
        println("나는 안드로이드 개발자다. ${language}를 사용한다")
    }

}

object OtherDeveloper : Developer() {
    override var name: String = "익명"
    override var age: Int = 0

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackEndDeveloper -> pool[developer.name] = developer
        is FrontEndDeveloper -> pool[developer.name] = developer
        is OtherDeveloper, is AndroidDeveloper -> println("지원하지 않는 개발자 종류입니다.")
    }

    fun get(name: String) = pool[name]
}


fun main() {
    val backEndDeveloper = BackEndDeveloper(name = "토니", age = 20);
    DeveloperPool.add(backEndDeveloper)

    val frontEndDeveloper = FrontEndDeveloper(name = "카즈하", age = 18);
    DeveloperPool.add(frontEndDeveloper)

    val androidDeveloper = AndroidDeveloper(name = "안드", age = 18);
    DeveloperPool.add(androidDeveloper)

    println(DeveloperPool.get("토니"))
    println(DeveloperPool.get("카즈하"))
    println(DeveloperPool.get("안드"))

}
