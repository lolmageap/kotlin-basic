package com.example.kotilnstudy.study

class Properties {

}

class Coffee(
        var name: String = "",
        var price: Int = 0,
        ) {

    val brand: String
        get() = "스타벅스"

    var quantity : Int = 0
        set(value){
            if (value > 0) {
                field = value

                // 아래와 같이 필드명을 사용하면 setter 를 재호출을 해서 무한 재귀함수로 실행됨
                // quantity = value
            }
        }

}

fun main(){

    val coffee1 = Coffee()
    coffee1.name = "라떼"
    coffee1.price = 3000
    coffee1.quantity = 1


    val coffee2 = Coffee(name = "아이스 아메리카노", 2000)
    coffee2.quantity = 3

    println("${coffee1.name} 의 가격은 ${coffee1.price} 수량은 ${coffee1.quantity}")
    println()

}