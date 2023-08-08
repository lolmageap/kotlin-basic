package com.example.kotilnstudy.study

class Generics<out T>(val t : T){

}

class Bag<T>{

    fun saveAll(
            to: MutableList<in T>,
            from: MutableList<T>
    ){
        to.addAll(from)
    }

}

fun main() {

    val generics = Generics("테스트")

    // 변수의 타입에 제네릭을 사용한 경우
    val list: MutableList<String> = mutableListOf()

    // 타입 아규먼트를 생성자에서 추가
    val list2 = mutableListOf<String>()

    val list3 : List<*> = listOf("테스트")

    val list4 : List<*> = listOf(1,2,3,4)

    // 변성 : 공변성, 반공변성
    // PECS ( Producer-Extends, Consumer-Super)
    // 공변성은 자바 제네릭의 extends, 코틀린에선 out
    // 반공변성은 자바 제네릭의 super, 코틀린에선 in

    val stringGenerics = Generics<String>("test")
    val charGenerics : Generics<CharSequence> = stringGenerics

    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))
}

