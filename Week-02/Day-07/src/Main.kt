
abstract class AbstractShape(val width: Double, val height: Double) {
    abstract fun area(): Double
}
interface InterfaceShape {
    fun area(): Double
}
class Rectangle(width: Double, height: Double) : AbstractShape(width, height) {
    override fun area(): Double = width * height
}
class Square(val side: Double) : InterfaceShape {
    override fun area(): Double = side * side
}

fun main() {
    val rectangle = Rectangle(4.0,8.0)
    val square = Square(5.0)

    println("Rectangle area is : ${rectangle.area()}" )
    println("Square area is : ${square.area()}")
}