package com.example.kotilnstudy.study

//enum class PaymentStatus( val label: String ) {
//    UNPAID("미지급") {
//        override fun isPayable(): Boolean = true
//    },
//    PAID("지급완료"){
//        override fun isPayable(): Boolean = false
//    },
//    FAILED("지급실패"){
//        override fun isPayable(): Boolean = false
//    },
//    REFUNDED("환불"){
//        override fun isPayable(): Boolean = false
//    };
//
//    abstract fun isPayable(): Boolean
//}

interface Payable {
    fun isPayable(): Boolean
}

enum class PaymentStatus( val label: String ): Payable {
    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
    },
    PAID("지급완료"){
        override fun isPayable(): Boolean = false
    },
    FAILED("지급실패"){
        override fun isPayable(): Boolean = false
    },
    REFUNDED("환불"){
        override fun isPayable(): Boolean = false
    };
}


fun main() {
    println(PaymentStatus.REFUNDED.label)

    if (PaymentStatus.UNPAID.isPayable()) {
        println("결제 가능 상태")
    }

    val value = PaymentStatus.valueOf("FAILED");
    println(value.label)

    for (status in PaymentStatus.values()) {
        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }
}

