package org.example.lesson_2

fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5

    val totalStudents = 4
    val sumOfScores = (student1 + student2 + student3 + student4).toFloat()
    val result = sumOfScores / totalStudents

    println(String.format("Средний балл учеников: %.2f", result))
}