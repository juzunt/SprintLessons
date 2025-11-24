package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    print("Введите год рождения: ")
    val yearOfBirth = readln().toInt()

    if (2025 - yearOfBirth >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    } else {
        println("Возвращение на главный экран")
    }
}