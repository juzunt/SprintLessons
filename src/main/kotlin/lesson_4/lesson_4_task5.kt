package org.example.lesson_4

fun main() {
    print("Корпус поврежден? ")
    val isSheepDamaged: Boolean = readln().toBoolean()

    println()

    print("Количество экипажа на борту: ")
    val numberOfCrew = readln().toInt()

    println()

    print("Количество ящиков провизии на борту: ")
    val amountOfProvisions = readln().toInt()

    println()

    print("Погода благоприятная? ")
    val weather = readln().toBoolean()

    val result = (
            isSheepDamaged == false && numberOfCrew >= 55 && numberOfCrew <= 70 && amountOfProvisions > 50) ||
            (
            isSheepDamaged == true && numberOfCrew == 70 && weather == true && amountOfProvisions >= 50
            )

    println("Корабль может отправиться в плавание: $result")

}