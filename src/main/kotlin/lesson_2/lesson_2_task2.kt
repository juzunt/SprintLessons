package org.example.lesson_2

fun main() {
    val employees = 50
    val employeeSalary = 30000

    val interns = 30
    val internSalary = 20000

    val employeeSalaryExpenses = employees * employeeSalary
    val totalSalaryExpenses = employeeSalaryExpenses + (interns * internSalary)
    val averageSalary = totalSalaryExpenses / (employees + interns)

    println("Расходы на ЗП постоянных сотрудников: $employeeSalaryExpenses")
    println("Общие расходы на ЗП после прихода стажеров: $totalSalaryExpenses")
    println("Средняя ЗП на одного сотрудника: $averageSalary")
}