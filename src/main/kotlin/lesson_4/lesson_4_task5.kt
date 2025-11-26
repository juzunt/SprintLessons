package org.example.lesson_4

const val MIN_CREW = 50
const val MAX_CREW = 70

const val MIN_PROVISION = 50

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

    val result =
        (isSheepDamaged == false && numberOfCrew >= MIN_CREW && numberOfCrew <= MAX_CREW && amountOfProvisions > MIN_PROVISION)
                || (isSheepDamaged == true && numberOfCrew == MAX_CREW && weather == true && amountOfProvisions >= MIN_PROVISION)

    println("Корабль  может отправиться в плавание: $result")

}