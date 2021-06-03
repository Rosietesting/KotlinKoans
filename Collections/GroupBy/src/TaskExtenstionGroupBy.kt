fun main () {

    /*
    Example 1 : groupBy() takes a lambda function and returns a Map
    In this map, each key is the lambda result and the corresponding value
     is the List of elements on which this result is returned
     */
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.first().toUpperCase() })

    /*
    Example 2 Group by with transformation
     */
    println(numbers.groupBy(keySelector = { it.first() },
            valueTransform = { it.toUpperCase() }))

    /*
     Example 3 Grouping by : Group elements and then apply an operation to all groups
      at one time
     */

    val number = listOf("one", "two", "three", "four", "five", "six")
    println(number.groupingBy { it.first() }.eachCount())

    val words = listOf("bezkoder", "zkoder", "kotlin", "programmingz", "bezcoder", "professional", "zcoder")
    val byLength = words.groupBy { it.length }
    val byLength2 = words.groupBy { it.length }
            .filter {(key, value) -> key == 8 }









    val city1 = City ("Bogota")
    val city2 = City ("London")
    val product1 = Product("Bread", 10.50)
    val product2 = Product("Rice", 4.23)
    val product3 = Product("potatoes", 1.23)
    val product4 = Product("brocoli", 12.60)
    val order1 = Order(listOf(product1,product3, product4), true)
    val order2 = Order(listOf(product2), true)
    val order3 = Order(listOf(product1, product2), true)
    val order4 = Order(listOf(product3, product4), true)

    val customer1 = Customer("Maria A", city1, listOf(order1, order2, order3))
    val customer2 = Customer("Ben E", city2, listOf(order1))
    val customer3 = Customer("Santi", city2, listOf(order1, order4))
    val shop = Shop("Roxipan", listOf(customer2,customer3, customer1))
    shop.groupCustomersByAGivenCity(city1)




}

fun Shop.groupCustomersByAGivenCity(city : City): Map<City, List<Customer>> =
        this.customers.groupBy { it.city }
                .filter { (key,value) -> key == city}
