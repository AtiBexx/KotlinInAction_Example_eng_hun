package largerNumber

fun max2(a: Int?, b: Int?): Int? { //típusdekralációk
    if (a != null && b != null) {
        return if (a > b) a else b
    }
    return null
}
/*if ha a nem gyenlő null és b nem egyenlő null akkor
a nagyobb b nél vagy mégse azaz b is lehet nagyobb a nál
külömbön érték null
(null jelentése semmi nincs)*/


fun main() {
    print("Add meg az első számot: ")
    val num1 = readlnOrNull()?.toIntOrNull() //?:0

    print("Add meg a második számot: ")
    val num2 = readlnOrNull()?.toIntOrNull() //?:0

    val result = max2(num1, num2)


    if (num1 != null && num2 != null) {
        println("A nagyobb szám: $result")
    }else {
        println("Kérlek adj meg egy értéket!")
    }
}

