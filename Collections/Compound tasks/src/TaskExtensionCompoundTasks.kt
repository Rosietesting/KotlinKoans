fun main () {

    //SHOP SET UP
    val city1 = City ("Bogota")
    val city2 = City ("London")
    val product1 = Product("Bread", 10.50)
    val product2 = Product("Rice", 4.23)
    val product3 = Product("potatoes", 1.23)
    val product4 = Product("brocoli", 12.60)
    val product5 = Product("masa de arepas", 50.09)
    val order1 = Order(listOf(product1,product3, product4), true)
    val order2 = Order(listOf(product2), true)
    val order3 = Order(listOf(product1, product2), true)
    val order4 = Order(listOf(product3, product4), true)

    val customer1 = Customer("Maria A", city1, listOf(order1, order2, order3))
    val customer2 = Customer("Ben E", city2, listOf(order1))
    val customer3 = Customer("Santi", city2, listOf(order1, order4))
    val shop = Shop("Roxipan", listOf(customer2,customer3, customer1))
   //This returns the  most expensive Product among all the delivered
    // products ordered by  customer1
    ((customer1.orders
            .filter { it.isDelivered })
            .flatMap { it.products })
            .maxBy { it.price }



     // count the amount of times a product was ordered


    println(((shop.customers.flatMap { it.orders }).flatMap { it.products })
            .count { it.name == product1.name })


}





