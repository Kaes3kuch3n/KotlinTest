package me.kaes3kuch3n.kotlintest

fun main(args: Array<String>) {

    val triangle = Shape()
    val rectangle = Shape(5, 3, 6, 2)
    println(triangle.simpleDesc())
    triangle.listSides()
    println(rectangle.simpleDesc())
    rectangle.listSides()

    val text = "This is a text from which I would like to get a word"
    println(text.subSequence(10..13))

    val array = arrayOf(4, "Text", true, 3.5, false)
    array.forEach { when (it) {
        is Int -> println("Integer")
        is String -> println("String")
        is Boolean -> println("Boolean")
        is Double -> println("Double")
        else -> println("Not recognizable")
    } }

}