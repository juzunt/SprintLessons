package org.example.lesson_1

fun main() {
    var numberOfOrders: Int = 42
    val welcomeMessage: String = "Welcome to our app!"

//    println(numberOfOrders)
    println(welcomeMessage)

    numberOfOrders = 52
    println(numberOfOrders)

    // const val - константа

    // Целочисленные
    val intNum1: Int = -2147483648
    val intNum2: Int = 2147483647
    val longNum: Long // 64 bit
    val shortNum: Short // 16 bit
    val byteNum: Byte // 8 bit

    // Вещественные
    val doubleNum: Double = 234.42 // 64 bit
    val floatNum: Float = 876.3f // 32 bit

    // Строковые
    val stringValue: String = "this is string"
    val charValue: Char = '1'

    // Логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false

}