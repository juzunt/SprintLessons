package org.example.lesson_2

const val BUFF_PERCENT = 20.0f

fun main() {
    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = (crystalOre * BUFF_PERCENT / 100).toInt()

    val bonusIronOre = (ironOre * BUFF_PERCENT / 100).toInt()

    println("Кристальная руда: $bonusCrystalOre")
    println("Железная руда: $bonusIronOre")
}