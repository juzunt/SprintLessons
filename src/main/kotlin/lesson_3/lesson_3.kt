package org.example.lesson_3

fun main() {
    // конкатенация строк
    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"


//    println(greeting + ", " + userName + "!" + space + "What is your main question?")

    // интерполяция строк
//    println("$greeting, $userName! What is your main question?")
//    println("To which you can respond ${40 + 2}")

    // многострочная интерполяция
    val multiString = """
            |aaaaa
        |bbbbb
           |ccccc
    """.trimMargin()
//    println(multiString)

    val phrase = "And he said - \"it is magnificent!\""
    println(phrase)
}