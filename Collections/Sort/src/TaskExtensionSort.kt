fun main(){




    //Natural order
    val numbers = listOf("one", "two", "three")
    println("Sorted descending: ${numbers.sortedDescending()}")
    println("Sorted ascending: ${numbers.sorted()}")

    //Custom orders
    val numbers2 = listOf("one", "two", "three", "Four")
    val sortedNumbers = numbers2.sortedBy { it.length }
    println("Sorted by length ascending: $sortedNumbers")
    val sortedByLast = numbers2.sortedByDescending { it.last() }
    println("Sorted by the last letter descending: $sortedByLast")
    val numbers3 = listOf("one", "two", "three", "four")
    println("random order" + numbers3.shuffled())

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

    val customerListNoOrder = shop.getCustomer()
    println("Ordering the Shop")
    println("No order" + customerListNoOrder)
    val customerListOrdererd= shop.getCustomersSortedByOrdersExtension()
    println("Ordered" + customerListOrdererd)

}

fun Shop.getCustomersSortedByOrdersExtension(): List<Customer> {

  return this.customers.sortedByDescending  { it.orders.size }


}

fun Shop.getCustomer(): List<Customer> {

    return this.customers


}