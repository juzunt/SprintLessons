package org.example.lesson_5

fun main() {
    val totalSeconds = 6480
    val minutes = totalSeconds / 60
    val hours = minutes / 60
    val remainingMinutes = minutes % 60

    println("0$hours:$remainingMinutes:00")
}