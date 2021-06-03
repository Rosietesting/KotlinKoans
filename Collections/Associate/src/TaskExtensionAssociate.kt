fun main () {
    /*
    associateWith() creates a Map in which the elements of the original collection are keys,
    and values are produced from them by the given transformation function.
     */

    val number1 = listOf("one", "two", "three", "four")
    println(number1.associateWith { it.length })


    /*
    associateBy() creates a Map in which the elements of the original collection
    are the values, and keys are produced from them by the given transformation function.
     */
    val number2 = listOf("one", "two", "three", "four")
    println(number2.associateBy { it.first().toUpperCase()})

    val numbers3 = listOf("one", "two", "three", "four")
    // Calling associatedBy in a transformation function
    println(numbers3.associateBy(keySelector = { it.first().toUpperCase() },
        valueTransform = { it.length }))
    /*
    Each count
     */
    val numbers4 = listOf("one", "two", "three", "four", "five", "six")
    println(numbers4.groupingBy { it.first() }.eachCount())

    /*

    fold()
    This function helps to accumulate value starting with initial value,
    then apply operation from left to right to current accumulator value and each element.
     */
    val numbers5 = listOf("one", "two", "three", "four", "five", "six")
    //println(numbers5.groupingBy { it.first() }.fold(0){ total, item -> total + item})

    println(listOf(1, 2, 3, 4, 5).fold(0) { total, item -> total + item })

    println(listOf(1, 2, 3, 4, 5).fold(1) { mul, item -> mul * item })

    //Associated
    val names = listOf("Grace Hopper", "Jacob Bernoulli", "Johann Bernoulli")

    val byLastName = names.associate { it.split(" ")
            .let { (firstName, lastName) -> lastName to firstName } }
    println(byLastName)



    //Shop
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

    // This build a map from the customer name to the customer

    shop.customers.associateBy { it.name }
    shop.customers.associateBy(Customer::name)
    shop.customers.associateWith { it.city }
    shop.customers.associateWith{ Customer::city }
    shop.customers.associateBy {Customer::name}







}
