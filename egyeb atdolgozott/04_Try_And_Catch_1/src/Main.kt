enum class Direction{
    UP,DOWN,UNKNOWN
}
fun main() {
    val myBoolean: Boolean = true
    val inputString : String = "u"

    val x = if (myBoolean) 3 else 5
    val direction :Direction = when (inputString) {
        "u" -> Direction.UP
        "d" -> Direction.DOWN
        else -> Direction.UNKNOWN
    }
    val number :Int = try {
        inputString.toInt()
    } catch (nfe: NumberFormatException) {
        println("Amúgy hiba történt: ${nfe.message}")
        -1
    }
    println("x = $x")
    println("direction = $direction")
    println("number = $number")
}