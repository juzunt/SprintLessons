package org.example.lesson_5

fun main() {

    println("Докажите, что вы не бот.")
    print("Решите пример: 2 + 2 = ")

    val verification = readln().toInt()

    val result = if (verification == 4) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }

    println(result)

}