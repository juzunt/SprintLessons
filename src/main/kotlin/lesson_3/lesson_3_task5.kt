package org.example.lesson_3

fun main() {
    val dataString = "D2-D4;0".split("-", ";")

    val from = dataString[0]
    val to = dataString[1]
    val moveNumber = dataString[2]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}