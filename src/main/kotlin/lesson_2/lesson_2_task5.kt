package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val rate: Double = 16.7 / 100
    val years = 20

    val totalDepositAmount = depositAmount * (1 + rate).pow(years)

    println(String.format("Итоговый депозит через $years лет: %.3f", totalDepositAmount))
}

