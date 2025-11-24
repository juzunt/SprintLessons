package org.example.lesson_2

fun main() {
    val buffPercent = 20.0f

    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = (crystalOre * buffPercent / 100).toInt()

    val bonusIronOre = (ironOre * buffPercent / 100).toInt()

    println("Кристальная руда: $bonusCrystalOre")
    println("Железная руда: $bonusIronOre")
}