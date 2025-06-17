data class Person(
    val name :String,
    val age :Int? = null
)
fun main() {
    // val persons :List<Person> = listOf()
    // a Kotlin
    val persons = listOf(
        Person("Alice", 29),
        Person("Bob", age = 22),
        Person(name = "Kitty", age = 22)
    )
    //KiIrajuk a neveket
    val PersonClass = persons.joinToString("\n")
     {"${it.name} - ${it.age}"}//eltüntetjük a zárojeleket a - minusz jelet hozzáadjuk
    //vagy overridol-unk de az a következő Main2 fájlban

    println("The Persons of class :\n$PersonClass")
    // ajoinToString eltüntetti a zárojelet és ha beírod a
    // "\n" ami uj sort jelent akkor soronként rakja
}