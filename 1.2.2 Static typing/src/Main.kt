/*
A statikusan tipizált programozási nyelvek számos előnnyel járnak, mint
példáulteljesítmény, megbízhatóság, karbantarthatóság és eszköztámogatás. A
statikusan tipizált nyelv legfontosabb előnye, hogy a programban lévő minden
kifejezés típusa ismert a fordításkor. A Kotlin egy statikusan tipizált
programozási nyelv; aA Kotlin fordító ellenőrizheti, hogy az objektumon elérni
kívánt metódusok és mezők valóban léteznek-e. Ez segít kiküszöbölni a hibák
egész osztályát – ahelyett, hogy futásidőben összeomlana, ha egy mező
hiányzik, vagy a függvényhívás visszatérési típusa nem felel meg a vártnak,
ezeket a problémákat a fordításkor fogja látni, lehetővé téve a fejlesztési ciklus
korábbi szakaszábanjavíthatja ki őket.
 */
//Azaz statikusan típusos


fun main() {
    val x :Int = 1 //de ha nem írod osa : Int típusú akkor is felismeri
    val y = 1 //mint itt is

   // println("$x $x")
   // println(x.toString() +" "+  y.toString() )
    println("${x} ${y}")
    // mind a 3 variácó kiírja az eredményeket
}