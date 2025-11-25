package org.example.lesson_5

fun main() {
    print("Расстояние поездки(в километрах): ")
    val travelDistance = readln().toDouble()

    println()

    print("Расход топлива на 100 км (в литрах): ")
    val fuelСonsumption = readln().toDouble()

    println()

    print("Текущая цена за литр: ")
    val fuelPrice = readln().toDouble()

    println()

    val totalFuelConsumption = (travelDistance * fuelСonsumption) / 100

    val totalFuelCost = (totalFuelConsumption * fuelPrice)

    println(String.format("Для поездки необходимо $totalFuelConsumption литров топлива. Стоимость поездки: %.2f руб.", totalFuelCost))


}