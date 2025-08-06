package org.example

fun main() {
    println("Hello Calculator!")
        val calculator = Calculator()

        val sum = calculator.add(5.0, 3.0)
        println("5.0 + 3.0 = $sum")  // 8.0

        val difference = calculator.subtract(10.0, 4.0)
        println("10.0 - 4.0 = $difference")  // 6.0

        val product = calculator.multiply(2.0, 3.0)
        println("2.0 * 3.0 = $product")  // 6.0

        val quotient = calculator.divide(10.0, 2.0)
        println("10.0 / 2.0 = $quotient")  // 5.0
    }

