fun main(){

    // Converting a list to a mao
    val mylst = listOf(1,2,3,4)
    val listInMap = mylst.map { it * it }
    println(listInMap)

    //Creating a map
    val mymap = mapOf("bee" to 1, "ant" to 2)
    println(mymap)

    //mapIndexed function
    val numbers = setOf(99,77,66,55)
    println(numbers)
    println(numbers.map { it *  10 })
    println(numbers.mapIndexed{idx , value  -> value * idx})

    // Transforming
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap)
    println(numbersMap.mapKeys { it.key.toUpperCase() })
    println(numbersMap.mapValues { it.value + it.key.length })

    //Zipping: Zipping transformation is building pairs from elements with the same positions in both collections

    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)

    //filtering
    val sizes = listOf(3,6,7,99)
    val sizeGraterThan5 = sizes.filter { it > 5 }
    println(sizeGraterThan5)

    val mapAges = mapOf("Ana" to 10, "Luis" to 19, "Pepes" to 3)
    val over18 = mapAges.filter { (key, value) -> key.endsWith("s") && value > 18 }
    println(over18)

    //Filtering indexing
    val valNumbers = listOf("one", "two", "three", "four")

    val filteredIdx = valNumbers.filterIndexed { index, s -> (index != 0) && (s.length < 5)  }
    val filteredNot = valNumbers.filterNot { it.length <= 3 }

    println(filteredIdx)
    println(filteredNot)

    //Testing predicates
    val leters = listOf("Gato", "Perro", "Caballo", "Murcielaga")

    println(leters.any { it.endsWith("o") })
    println(leters.none { it.endsWith("a") })
    println(leters.all { it.endsWith("e") })

    println(emptyList<Int>().all { it > 5 })

    // Shop exercice
    val city1 = City ("Bogota")
    val city2 = City ("London")
    val city3 = City ("New York")
    val city4 = City ("Newcastle")
    val product1 = Product("Bread", 10.50)
    val product2 = Product("Rice", 4.23)
    val product3 = Product("potatoes", 1.23)
    val product4 = Product("brocoli", 12.60)
    val order1 = Order(listOf(product1,product3, product4), true)
    val order2 = Order(listOf(product2), true)
    val order3 = Order(listOf(product1, product2), true)
    val order4 = Order(listOf(product3, product4), true)

    val customer1 = Customer("Maria A", city1, listOf(order1, order2, order3))
    val customer2 = Customer("Ben E", city1, listOf(order1))
    val customer3 = Customer("Santi", city3, listOf(order1, order4))
    val customer4 = Customer("Eduardo", city4, listOf(order1, order4, order3))
    val shop = Shop("Roxipan", listOf(customer2,customer3, customer4, customer1))
    println(shop.getCustomerCitiesExample())
    val city = City("Bogota")
    println(shop.getCustomersFromExample( city))



}

// Find all the different cities the customers are from
fun Shop.getCustomerCitiesExample(): Set<City> = (this.customers.map{it.city}).toSet()


// Find the customers living in a given city
fun Shop.getCustomersFromExample(city: City): List<Customer> = this.customers.filter { it.city == city }
