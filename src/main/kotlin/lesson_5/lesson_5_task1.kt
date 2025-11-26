package org.example.lesson_5

fun main() {

    val a = 5
    val b = 6
    val sum = a + b

    println("Докажите, что вы не бот.")
    print("Решите пример: $a + $b = ")

    val verification = readln().toInt()

    val result = if (verification == sum) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }

    println(result)

}