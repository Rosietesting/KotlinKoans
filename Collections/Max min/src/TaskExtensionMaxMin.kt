fun main () {

    val numbers = listOf(45,7,1,0,45,65,2,3)

    println("Count value ${numbers.count()}")
    println("Max value ${numbers.max()}")
    println("Min value ${numbers.min()}")
    println("Average value ${numbers.average()}")
    println("Sum value ${numbers.sum()}")
    println("Min value ${numbers.minBy { it % 3 }}")

    val strings = listOf("one", "two", "three", "four")
    val longestString = strings.maxWith(compareBy { it.length })
    println("logetString word id  " + longestString)


    val numbersSum = listOf(5, 42, 10, 4)
    println("List sum is " + numbersSum.sumBy { it * 1 })
    println(numbersSum.sumByDouble { it.toDouble()})


    val vals = listOf(5, 2, 10, 4)
    val sum = vals.reduce { sum, element -> sum + element }
    println("Sum is " + sum)


    //Shop
    // checkAllCustomersAreFromCity returns true if all customers are from a given city
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
    //return the customer who has placed the most amount of orders in this shop
    val order = shop.customers.maxBy { it.orders.size }
    //return the most expensive product that has been ordered by the given customer
    //val expensiveProduct  = shop.customers.filter { it.orders }

    val  prodiuct = customer1.orders
            .flatMap(Order::products)
            .maxBy(Product::price)
    val f1 = customer1.orders
    val fr  = customer1.orders
            .flatMap(Order::products)
    val f3= customer1.orders
            .flatMap(Order::products)
            .maxBy(Product::price)

    //callable reference
    println("Callable reference")
    ExampleDataClass::class.java.methods.forEach(::println)
}

data class ExampleDataClass(
        val name: String, var enabled: Boolean)

