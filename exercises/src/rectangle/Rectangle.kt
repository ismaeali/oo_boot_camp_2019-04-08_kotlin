package rectangle

// Understands a four-sided polygon with sides at right angles
class Rectangle(length: Number, width: Number) {
    private val length = length.toDouble()
    private val width = width.toDouble()

    fun area(): Double {
        return length * width
    }

}