package org.example.lesson_4

fun main() {
    val day = 5

    val armsAndAbs = day % 2 != 0
    val legsAndBack = !armsAndAbs

    println("""
        Упражнения для рук:     $armsAndAbs
        Упражнения для ног:     $legsAndBack
        Упражнения для спины:   $legsAndBack
        Упражнения для пресса:  $armsAndAbs
    """.trimIndent())

}