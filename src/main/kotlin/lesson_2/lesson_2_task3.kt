package org.example.lesson_2

const val MINUTE_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelMinutes = 457

    val departureTotalMinutes = departureHour * MINUTE_IN_HOUR + departureMinute

    val arrivalTotalMinutes = departureTotalMinutes + travelMinutes

    val arrivalHour = (arrivalTotalMinutes / MINUTE_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinute = arrivalTotalMinutes % MINUTE_IN_HOUR

    println(String.format("Время прибытия поезда: %02d:%02d", arrivalHour, arrivalMinute))
}