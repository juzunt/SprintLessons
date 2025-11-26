package org.example.lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025

fun main() {

    print("Введите год рождения: ")
    val yearOfBirth = readln().toInt()

    if (CURRENT_YEAR - yearOfBirth >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    } else {
        println("Возвращение на главный экран")
    }
}