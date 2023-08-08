package com.example.kotilnstudy.study

class Product( val name: String, val price: Int )

interface Wheel {
    fun roll()
}

interface Order {

    fun add(product: Product){
        println("가격은 ${product.price}입니다.")
    }

    fun printId() = println("4321")
}

interface Cart : Wheel {

    var coin: Int

    val weight : String
        get() = "20KG"

    fun add(product: Product)

    fun rent() {
        if (coin > 0){
            println("카트를 대여합니다.")
        }
    }

    override fun roll() {
        println("카트가 굴러가유")
    }

    fun printId() = println("1234")
}

class MyCart(override var coin: Int = 0) : Cart, Order {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가됐습니다")

        super<Order>.add(product)
    }

    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }

}

fun main() {
    val myCart = MyCart(3)
    myCart.rent()
    myCart.roll()
    myCart.add(Product(name = "장난감", price = 1000))
    myCart.printId()
}

