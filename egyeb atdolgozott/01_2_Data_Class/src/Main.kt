data class Person(
    val name :String,
    val age :Int? = null
)
{
    override fun toString(): String {
        return "$name - $age"
    }
}
fun main() {
    // val persons :List<Person> = listOf()
    // a Kotlin
    val persons = listOf(
        Person("Alice", 29),
        Person("Bob", age = 22),
        Person(name = "Kitty", age = 22)
    )
    //.maxby megkérdezük ki a legidősebb azaz az it.age -hivatkozunk az életkorra
    // a ?: 0 azt jelenti lehett null tehát nullától nézi
    //Alice a győztes mert 29 éves és ő legidősebb
    val oldest: Person = persons.maxBy {
        it.age ?: 0
    }
    println("The oldest Person is : $oldest")//outpout Alice
}