data class Szemelyek(
    val name :String,
    val age :Int? = null
)
{
    override fun toString(): String { //felülírjük a toStringet így eltünik a zárojel a- minusz jelet hozzáadjuk
        return "$name - $age"
    }
}
fun main() {
    // val persons :List<Person> = listOf()
    // a Kotlin
    val persons2: List<Szemelyek> = listOf( //Mivel a data class Szemelyek ezért a listához is ide az kell
        Szemelyek("Alice", 29),
        Szemelyek("Bob", age = 22),
        Szemelyek(name = "Kitty", age = 22)
    )
    //KiIrajuk a neveket
    val personClass2 = persons2.joinToString("\n")
    //{"${it.name} - ${it.age}"}

    println("The Persons of class :\n$personClass2")
    // ajoinToString eltüntetti a zárojelet és ha beírod a
    // "\n" ami uj sort jelent akkor soronként rakja
}