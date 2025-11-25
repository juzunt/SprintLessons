package org.example.lesson_4

const val IS_WEATHER_SUNNY: Boolean = true
const val IS_TENT_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON: String = "Зима"

fun main() {

    val isSunnyForBeans = true
    val isTentForBeans = true
    val airHumidityForBeans = 20
    val badSeason = "Зима"

    val result = (IS_WEATHER_SUNNY == isSunnyForBeans) &&
            (IS_TENT_OPEN == isTentForBeans) &&
            (AIR_HUMIDITY == airHumidityForBeans) &&
            (SEASON != badSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}