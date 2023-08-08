package com.example.kotilnstudy.study

open class Dog {
    open var age: Int = 0
    open fun bark() {
        println("멍멍")
    }
}

open class BullDog( override var age: Int = 0 ): Dog() {
    // final 로 상속 막기
    final override fun bark() {
        println("컹컹")
    }
}

class ChildBullDog( override var age: Int = 0 ): BullDog() {
//    override fun bark() {
//        println("컹컹")
//    }
}

//abstract class Developer {
//    abstract var age : Int
//    abstract fun code(language: String)
//}
//
//class BackEndDeveloper( override var age: Int ) : Developer() {
//
//    override fun code(language: String) {
//        println("I code with $language")
//    }
//
//}

fun main() {

    val bullDog = BullDog(age = 13)
    bullDog.bark();
    println(bullDog.age)

    val childBullDog = ChildBullDog(3)
    childBullDog.bark()
    println(childBullDog.age)

    val backEndDeveloper = BackEndDeveloper(30, "토미")
    println(backEndDeveloper.age)
    backEndDeveloper.code("Kotlin")

}

