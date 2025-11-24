package org.example.lesson_5

import kotlin.math.pow

fun main() {

    print("Ваш вес в кг: ")
    val userWeight = readln().toDouble()

    println()

    print("Ваш рост в см: ")
    val userHeight = readln().toDouble()

    println()

    val heightInMeters = userHeight / 100

    println()

    val bodyMassIndex = userWeight / heightInMeters.pow(2)

    val category = when {
        bodyMassIndex < 18.5 -> "Недостаточная масса тела"
        bodyMassIndex < 25 -> "Нормальная масса тела"
        bodyMassIndex < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println(String.format("Ваш индекс массы тела: %.2f", bodyMassIndex))

    println("Ваша категория веса: $category")

}