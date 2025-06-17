data class Sender (val name :String)
data class Message(val contentMessage : String, val isRead: Boolean, val sender: Sender)

fun main() {
    val messages :List<Message> = listOf(
        Message("Hy",false ,Sender("Julia")),
        Message("empty",true ,Sender("Anna")),
        Message("Please....",false ,Sender("Kitty")),
        Message(" ",false ,Sender("George")),
        Message("I love you",true ,Sender("Anna")),
        Message("Please Help me",true ,Sender("Katty")),
        Message("Here your Money Thank you!",true ,Sender("Jennin"))

    )
    /*  - distinct () kiszűri a duplikált neveket
        - isNotBlank() ellenőrzi hogy nem -e üres stringről van szó
        - && mind a 2 feltételnek igaznak kell lennie
        - it.isRead olvasott Boolean ,!it.isRead nem olvasott Boolean (logikai negalás) !
          az ellentéte a rendesnek
        - it. hivatkozunk a típusokra Kotlinban
        - sortedBy(Sender::name) Név szerint rakja a Senderel hivatkozunk a típusra a data classban
          a ::name meg a névre Abc sorrrend szerint
        - map uj listát hozz létre az eredeti listából
    *  */

    val uniqueUnreadSenders :List<Sender> = messages
        .filter { it.contentMessage.isNotBlank() && !it.isRead }
        .map { it.sender }
        .distinct()
        .sortedBy(Sender::name)
    val uniqueReadSenders :List<Sender> = messages
        .filter { it.contentMessage.isNotBlank() && it.isRead}
        .map { it.sender }
        .distinct()
        .sortedBy(Sender::name)
    /*
    * uniqueUnreadSenders nem olvasott üzenetek nevek szerint
    * uniqueReadSenders olvasott üzenetek nevek szerint
    * */
    println("Nem olvasott üzenetek nevek szerint:")
          /*
           //for ciklus sender hivatkozik a Sender listára (in) uniqueUnreadSenders - ben
           //majd printLine-val kiiratjuk az uj létrehozott sendert
           for (sender :Sender in uniqueUnreadSenders){
               println("${sender.name},")
           */
            /*  -.withIndex() egy listából indexelt sorozatot csinál hogy,hozzáférj a for ciklusban
                  az elemhez és az indexéhez.
                - Ha az `index` kisebb, mint `uniqueReadSenders.lastIndex`, akkor kiírunk egy vesszőt utána.
                - ha nem else és nem írunk a.listIndex a lista utolsó eleme
            */

    for ((index, sender) in uniqueUnreadSenders.withIndex()){
               if (index < uniqueUnreadSenders.lastIndex)
                   print("${sender.name}, ")
               else
                   println(sender.name)//utolsó elemnél nincs vessző
           }
    println("Olvasott üzenetek: \n${uniqueReadSenders.joinToString (",\n") { it.name } } ")
    //.joinToString {it.name} csak a neveket írja ki zárojel nélkül
    //(",\n") \n uj sor előtte , add hozzá
}