fun main(args: Array<String>) {
    val triangle = Shape()
    val rectangle = Shape(5, 3, 6, 2)
    println(triangle.simpleDesc())
    triangle.listSides()
    println(rectangle.simpleDesc())
    rectangle.listSides()
}