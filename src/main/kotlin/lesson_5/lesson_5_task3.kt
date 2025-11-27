package org.example.lesson_5

fun main() {

    val win1 = 0
    val win2 = 42

    println("Введите два числа от 0 до 42.")

    print("Введите первое число: ")
    val number1 = readln().toInt()

    println()

    print("Введите второе число: ")
    val number2 = readln().toInt()

    println()

    println("Выигрышные числа: $win1 и $win2")

    val firstMatch = (number1 == win1 || number1 == win2)
    val secondMatch = (number2 == win1 || number2 == win2)

    val result = if (firstMatch && secondMatch){
        "Поздравляем! Вы выиграли главный приз!"
    } else if (firstMatch || secondMatch) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }

    println(result)

}