package org.example.lesson_5

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val winningNumbers = mutableListOf<Int>()
    while (winningNumbers.size < 3) {
        winningNumbers.add(Random.nextInt(0, 43))
    }

    println("Введите три числа от 0 до 42 включительно")

    println()

    print("Введите первое число: ")
    val number1 = readln().toInt()

    println()

    print("Введите второе число: ")
    val number2 = readln().toInt()

    println()

    print("Введите третье число: ")
    val number3 = readln().toInt()

    println()

    val userNumbers = mutableListOf<Int>(number1, number2, number3)

    val matchedNumbers = winningNumbers.intersect(userNumbers)
    val matchetCount = matchedNumbers.size

    when (matchetCount) {
        0 -> println("Не угадано ни одного числа.")
        1 -> println("Угадано 1 число, вы получаете утешительный приз.")
        2 -> println("Угадано 2 числа, вы получаете крупный приз")
        3 -> println("Угаданы все 3 числа, вы выиграли джекпот")
    }

    println("Выигрышные числа: $winningNumbers")
}