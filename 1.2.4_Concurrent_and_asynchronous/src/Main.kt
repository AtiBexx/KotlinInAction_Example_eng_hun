import kotlinx.coroutines.*//importáljuk a Courutins-eket

//data osztályok
data class Credentials(val username: String, val password: String)
data class User(val id : Int,val name :String)
data class Data(val userID:Int, val imageId:Int)
data class Image(val id: Int, val url: String)
//suspend függvények
suspend fun authenticate(credentials: Credentials) :User{
    delay(1000)
    println("username authenticated: ${credentials.username}")
    return User(1, credentials.username)
}
suspend fun loadUserData(user: User) :Data{
    delay(800)
    println("User data loaded for user: ${user.name}")
    return Data(user.id, imageId = 42)
}
suspend fun loadImage(id: Int) : Image{
    delay(500)
    println("Image loaded with id: $id")
    return Image(id, "https://example.com/image/$id.jpg")
}
suspend fun processUser(credentials: Credentials){
    val user :User = authenticate(credentials)
    val data:Data = loadUserData(user)
    val image:Image = loadImage(data.imageId)

    println("Minden adat betöltve ${user.name}- felhasználónévhez!")
    println("Kép URL: ${image.url}")
}

fun main() = runBlocking {
    val credentials =Credentials("Ati", "Password123")
    processUser(credentials)
}
//
/*Mit jelent a suspend függvény?
A suspend kulcsszó azt jelzi, hogy a függvény futását meg
lehet szakítani (szuspendálni), majd később folytatni, anélkül,
hogy blokkolná az aktuális szálat.
Ezeket a függvényeket csak más suspend függvényből vagy korutinból
 (coroutine) lehet meghívni.
Ezek a függvények nem automatikusan párhuzamosak
vagy háttérben futnak, hanem a futási kontextusuktól
függően aszinkron módon kezelhetők*/