package org.example.lesson_5

fun main() {

    val number1 = 5
    val number2 = 6
    val sum = number1 + number2

    println("Докажите, что вы не бот.")
    print("Решите пример: $number1 + $number2 = ")

    val verification = readln().toInt()

    val result = if (verification == sum) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }

    println(result)

}