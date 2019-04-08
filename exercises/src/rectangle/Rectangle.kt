package rectangle

import java.lang.IllegalArgumentException

// Understands a four-sided polygon with sides at right angles
class Rectangle(length: Number, width: Number) {
    init {
        if (length.toDouble() <= 0 || width.toDouble() <= 0)
            throw IllegalArgumentException("Each dimension must be greater than zero")
    }
    private val length = length.toDouble()
    private val width = width.toDouble()

    fun area() = length * width

    val perimeter get() = 2 * (length + width)

}