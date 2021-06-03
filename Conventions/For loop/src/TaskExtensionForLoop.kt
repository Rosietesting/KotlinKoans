import Library.books
import java.util.*


fun main (args: Array<String>){

    /*
    EXAMPLE 1 :  ◊◊◊◊◊ FOR LOOPS    ◊◊◊◊◊◊
    */
    val myList = listOf(100,92,300,94,55,36,72,811,922)
    for (item in myList) println(item)

    val myList1 = listOf("a","b","c","d","e","f","g","h","i")
    for (item in myList1.indices)println(myList[item])


    for ((index, value) in myList1.withIndex()) {
        println("the element at $index is $value")
    }

    for (item in myList1)
        println(myList1.iterator().hasNext())

    /*
   EXAMPLE 2 :  ◊◊◊◊◊ USING OBJECT EXPRESSION   https://agrawalsuneet.github.io/blogs/object-expression-in-kotlin/  ◊◊◊◊◊◊
   What are object expressions : Sometimes we need to create an object of some class with slight modification, without explicitly declaring a new subclass for it.
   */

    val usingClearServices = UsingClearServices()
    usingClearServices.useCleanServices(object  : CleaningServices() {
        override fun cleanFloors() {
            super.cleanFloors()
            println("This clean carpets")
            println("This clean Hard floors")
            println("This clean Patios")
        }

        override  fun cleanRooms(){
            super.cleanRooms()
            println("This clean Toilets")
            println("This clean Studios")
            println("This clean kitchens")

        }

    })


    /*
    EXAMPLE 2 :  ◊◊◊◊◊ ITERATOR CONVENTION  https://www.baeldung.com/kotlin/operator-overloading#11-iterator-convention ◊◊◊◊◊◊
    // Everytime I call a function on it iterator, it will give me the next item in the list. It will keep iterating over books until it does not have any more
   */
    println( " *******  PRINTING BOOKS   using iterator**************")
    val booksIterator = books.iterator()
    while (booksIterator.hasNext()){
        println (booksIterator.next())
    }
    println( " *******  PRINTING BOOKS  using let **************")
    books.iterator().let { iterator ->
        while (iterator.hasNext()){
            val book = iterator.next()
            println (book)
        }

     }
    println(" *******  PRINTING BOOKS  using loop **************")
    for (book in books) println(book)

    println(" *******  PRINTING BOOKS  using loop and let **************")
    books.let {books ->
        for (book in books) println(book)
    }

    books.forEach {book ->
        println(book)
    }

    books.forEachIndexed { index, book ->
        println("$index is $book")
    }


    val myDate1 = MyDate(1999, 1, 1)
    val myDate2 = MyDate (2005,1,1)
    val results = myDate1.compareTo(myDate2)
    if(results > 0){
        println("Date 1 is greater than Date 2")
    } else {
        println("Date 2 is greater than Date 2 or the same")
    }

    println("The following date of myDate1 is  ${myDate1.followingDate()}")


}


open class CleaningServices () {

    open fun cleanFloors() {
        println("This only clean hard floors")
    }

    open fun cleanRooms() {
        println("This only clean bedrooms")
    }
}

class UsingClearServices (){

    fun useCleanServices (myObj : CleaningServices){ // An object of ClearServices is createed and passed it to useCleanServices method
            myObj.cleanFloors()
            myObj.cleanRooms()


    }
}