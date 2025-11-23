package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {

    val reservedToday = TOTAL_TABLES
    val reservedTomorrow = 9

    val availableToday = reservedToday < TOTAL_TABLES
    val availableTomorrow = reservedTomorrow < TOTAL_TABLES

    println("[Доступность столиков на сегодня: $availableToday]\n[Доступность столиков на завтра: $availableTomorrow]")

}