fun main (){

    /*
    Example 1 : Flatten() : Returns a single List of all the elements of the nested collections.
     */
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(5, 6),setOf(22,11,44))
    println(numberSets)
    println(numberSets.flatten())

    /*
    Example 2 : FlatMap() : Returns a single List of all the elements of the nested collections.
    */


    val containers = listOf(
            StringContainer(listOf("one", "two", "three")),
            StringContainer(listOf("four", "five", "six")),
            StringContainer(listOf("seven", "eight"))
    )

    println(containers.flatMap { it.values })


    /*
    Example 3 : String representations
    joinToString() builds a single String from the collection elements
     based on the provided arguments.
    */

    val fruitContainer = listOf(setOf("apple", "Pear" , "Banana"), setOf("pizza", "chips", "malteada"))
    println(fruitContainer.flatten().joinToString ())
    println(fruitContainer.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))

    /*
    Example 4 : Trucante
    joinToString() builds a single String from the collection elements
     based on the provided arguments.
    */

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 10, truncated = "<...>"))

    /*
    Example 4: Transformation
    joinToString() builds a single String from the collection elements
    based on the provided arguments.
    */

    val numbers2 = listOf("one", "two", "three", "four")
    println(numbers2.joinToString { "Element: ${it.toUpperCase()}"})

    //SHOP SET UP
    val city1 = City ("Bogota")
    val city2 = City ("London")
    val product1 = Product("Bread", 10.50)
    val product2 = Product("Rice", 4.23)
    val product3 = Product("potatoes", 1.23)
    val product4 = Product("brocoli", 12.60)
    val product5 = Product("masa de arepas", 50.09)
    val order1 = Order(listOf(product1,product3, product4), false)
    val order2 = Order(listOf(product2), true)
    val order3 = Order(listOf(product1, product2), false)
    val order4 = Order(listOf(product3, product4), true)

    val customer1 = Customer("Maria A", city1, listOf(order1, order2, order3))
    val customer2 = Customer("Ben E", city2, listOf(order1))
    val customer3 = Customer("Santi", city2, listOf(order1, order4))
    val shop = Shop("Roxipan", listOf(customer2,customer3, customer1))

    // Return all products the given customer has ordered
    println(customer1.orders.flatMap { it.products })
    /*Return all products that were ordered by at least one custom
    Bread, rice, potatoes, brocoli
     */

    val allProductsordered = (shop.customers.flatMap { it.orders }).flatMap { it.products }
    println(allProductsordered.distinct())





}


data class StringContainer(val values: List<String>)