package org.example.lesson_4

const val IS_WEATHER_SUNNY: Boolean = true
const val IS_TENT_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON: String = "Зима"

fun main() {

    val sunnyForBeans = true
    val openedTentForBeans = true
    val airHumidityForBeans = 20
    val seasonForBeans = "Не зима"

    val result = (IS_WEATHER_SUNNY == sunnyForBeans) &&
            (IS_TENT_OPEN == openedTentForBeans) &&
            (AIR_HUMIDITY == airHumidityForBeans) &&
            (SEASON != "Зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}