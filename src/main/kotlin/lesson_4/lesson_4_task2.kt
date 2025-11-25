package org.example.lesson_4

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val CAPACITY = 100


fun main() {

    val firstCargoWeight = 20
    val firstCargoCapacity = 80

    val firstCargo = (firstCargoWeight > MINIMUM_WEIGHT) && (firstCargoWeight <= MAXIMUM_WEIGHT) && (firstCargoCapacity < CAPACITY)

    val secondCargoWeight = 50
    val secondCargoCapacity = 100

    val secondCargo = (secondCargoWeight > MINIMUM_WEIGHT) && (secondCargoWeight <= MAXIMUM_WEIGHT) && (secondCargoCapacity < CAPACITY)

    println("Груз с весом $firstCargoWeight кг и объемом $firstCargoCapacity литров соответствует категории \'Average\': $firstCargo")
    println("Груз с весом $secondCargoWeight кг и объемом $secondCargoCapacity литров соответствует категории \'Average\': ${secondCargo}")

}