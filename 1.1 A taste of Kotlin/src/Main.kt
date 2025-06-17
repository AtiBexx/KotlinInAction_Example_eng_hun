data class Person(
    val name :String,
    val age :Int? = null
)
fun main() {
    //példányoítás iterálás
    val persons :List<Person> = listOf(
        Person("Alice", age = 29),
        Person("Bob")
    )
    //Példányosítás
    //.maxBy { it.age ?: 0 } kiírja ki a legidősebb
    //?: 0 = ha null akkor 0 lesz
    val oldest :Person = persons.maxBy { it.age ?: 0 }
    println("The oldest is :$oldest")
}
/*
a data class osztály egy konstruktor ami ahol megadjuk
a névhez tartozó típusokat String és Int? az elvis operator jelentése
hogy lehet null azaz =null ,null jelentése semmi nincs nem a 0
A data class osztályt használhatod egy másik fájlban is
a newer package-ba beraktam hogyan
ha viszont máshonnan hívod meg másik csomagból egy másik csomagbe vagy
az src mappából másik csomagba akkor importálni kell
pl : import newer.Person1

 */