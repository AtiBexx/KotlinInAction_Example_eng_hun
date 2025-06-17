package largerNumber

fun max(a: Int?, b: Int?): Int? { //típusdekralációk
    return if (a == null || b ==null) null else if (a > b) a else b
    /*return visszadja az értéket ha az a vagy a || b null akkor az érték
     null külömbön ha a nagyobb b nél külömben b nagyobb a-nál
     */
}

fun main() {
    print("Add meg az első számot: ")
    val num1 :Int? = readlnOrNull()?.toIntOrNull()

    print("Add meg a második számot: ")
    val num2 :Int? = readlnOrNull()?.toIntOrNull()

    val result :Int? = max(num1, num2)
    if (result != null) {
    println("A nagyobb szám: $result")
}else {
    println("Kérlek adj meg egy értéket!")
}
}
//ilyenkor lehet null is azaz ha nem adsz meg értéket nem ad hibát
//de önmagában az elvis operátor nem véd meg a nulltól?

