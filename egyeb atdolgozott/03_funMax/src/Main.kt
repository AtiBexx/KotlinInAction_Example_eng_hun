fun max(a :Int, b: Int) :Int//típusdekralációk
{return if(a > b) a else b}//a nagyobb b-nél külömben b
//return visszaadja az értéket után if() else
//egy egysoros if else

fun main() {
    val num1 = 47//első szám
    val num2 = 17//második szám

    val result :Int = max(num1, num2)
    println("The maximum (larger)of the numbers is: $result")
    println("A nagyobb szám: $result")

}