//http://kotlin-quick-reference.com/101-R-getter-setter-properties.html

fun main () {

    // create an instance of Address
    var address = Address()
    // set the value
    address.name = " Ben E"
    // Get the value
    val lastName = address.name
    println(lastName)
    // Get the dob before the setter
    println(address.dob)
    // Set the dob
    address.dob = "2020-09-1977"
    val newAddress = address.dob
    // Example Property
    val propertyName = PropertyExample2()
    propertyName.propertyWithCounter = 5
    println(propertyName.counter)
    propertyName.propertyWithCounter = 89
    println(propertyName.counter)

}

//Class address
class Address () {

    var name: String = " Rosibel Ramirez"
    var street: String = " Woodlands road"
    var number: Int = 120
    var region: String = "Aylesford"
    var postcode: String = "ME206EZ"
    var state: String? = null


    //customs getters

    var dob : String = "No value"
    get() {
        println("Dob has been retrieved 'dob' ")
        return  field
    }
    set(newDob) {
        println("Dob has been updated new value $newDob")
        field = (newDob)
    }

}

// classPrpertyExample
class PropertyExample2() {
    var counter = 0
    get() {
        println("Counter has been accessed")
        //println("Counter has been accessed $counter")
        return field
    }
    var propertyWithCounter: Int? = null
        set(newCounter){
            counter ++
            field = newCounter
        }

}




