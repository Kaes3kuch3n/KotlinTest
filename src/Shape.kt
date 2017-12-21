class Shape(vararg sides: Int = intArrayOf(2, 4, 5)) {
    var sides = sides
    var numSides = sides.size
    var totalSideLength = sides.sum()
    fun simpleDesc() = "A shape with $numSides sides and a total side length of $totalSideLength"
    fun listSides() {
        for (index in sides.indices)
            println("Side $index has a length of ${sides[index]}")
    }
}