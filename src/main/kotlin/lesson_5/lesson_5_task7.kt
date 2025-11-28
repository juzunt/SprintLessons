package org.example.lesson_5

fun main() {
    print("Расстояние поездки(в километрах): ")
    val travelDistance = readln().toDouble()

    println()

    print("Расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toDouble()

    println()

    print("Текущая цена за литр: ")
    val fuelPrice = readln().toDouble()

    println()

    val totalFuelConsumption = (travelDistance * fuelConsumption) / 100

    val totalFuelCost = (totalFuelConsumption * fuelPrice)

    println(String.format("""|Для поездки необходимо $totalFuelConsumption литров топлива.
        |Стоимость поездки: %.2f руб.""".trimMargin(), totalFuelCost))


}