// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.

/*
Option 2:
    return customer
            .orders
            .filter(Order::isDelivered)
            .flatMap(Order::products)
            .maxBy(Product::price)
 */
fun findMostExpensiveProductBy(customer: Customer): Product? =
  ((customer.orders
          .filter { it.isDelivered })
          .flatMap { it.products })
          .maxBy { it.price }



// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
/*
Option 2:
 return customers
            .flatMap(Customer::getOrderedProducts)
            .count { it == product }
 */

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int =
    customers.flatMap { it.orders }.flatMap { it.products }
            .count { it.name == product.name }


fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap { it.products }
