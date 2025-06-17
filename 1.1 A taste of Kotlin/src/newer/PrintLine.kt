package newer

fun main() {
    //példányoítás iterálás
    val persons :List<Person1> = listOf(
        Person1("Alice", age = 29),
        Person1("Bob")
    )
    //Példányosítás
    //.maxBy { it.age ?: 0 } kiírja ki a legidősebb
    //?: 0 = ha null akkor 0 lesz
    val oldest :Person1 = persons.maxBy { it.age ?: 0 }
    println("The oldest is :$oldest")
}