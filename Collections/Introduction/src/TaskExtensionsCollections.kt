/*
https://github.com/goldmansachs/gs-collections-kata Collections exercices to do :)
 */
fun main(args: Array<String>) {


    val myList1 = listOf("a", "b", "c")
    val myList2 = listOf("d", "e", "f")
    val myListIntegers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 20)
    val myListNull = listOf(1, null, 2, null, 3)

// adding to lists
    val mylyst3 = myList1 + myList2

// removing list2
    val mylist4 = myList1 - myList2

// slicing values on a list
    val sliceVal = mylyst3.slice(3..4)

//removing nulls from a list
    myListNull.filterNotNull()

// Filtering from a list
    val newList = myListIntegers.filter { it > 8 }

// droping items
    val theLista = listOf("one", "two", "three", "four")
    val resultList = theLista.drop(2)

//Grouping elements
    val listToGroup = listOf<Int>(1, 2, 3, 4, 5, 6)
    val resultListGroup = listToGroup.groupBy { it % 3 }

//Mapping
    val mapList = listOf(1, 2, 3, 4, 5, 6)
    val resMap = mapList.map { it * it }

//FlatMap to flatten nested collections.
// Here, we are converting Strings to List<String>
// and avoiding ending up with List<List<String>>:
    val theList2 = listOf("John", "Tom")
    val resultList2 = theList2.flatMap { it.toLowerCase().toList() }
// Fold reduce operation
    val theList3 = listOf(1, 2, 3, 4, 5, 6)
    val finalResult3 = theList3.fold(0, { acc, i -> acc + (i * i) })
//Chunking
    val theList4 = listOf(1, 2, 3, 4, 5)
    val chunked = theList4.chunked(2)
//Windowing
    val theList5 = (1..6).toList()
    val windowed = theList5.windowed(3)
// Providers
    val branchesList1 = listOf<String>("Ditton", "Miadstone", "London")
    val branchesList2 = listOf<String>("York", "Edinburg", "Inverness")

    val provider1 = Provider("Tesco",branchesList1)
    val provider2 = Provider("Asda",branchesList1)
    val provider3 = Provider("Synsburys",branchesList2)


    val  listProviders = listOf<Provider>(provider1, provider2, provider3)

    val supermarket = Supermarket("Shampoo",listProviders)
    val mySet : Set<Provider> = supermarket.getListOfProviders()

}


data class Provider(val name: String, val branches: List<String>)

data class Supermarket (var product : String , var providers: List<Provider>)

fun Supermarket.getListOfProviders() : Set<Provider> = this.providers.toSet()











