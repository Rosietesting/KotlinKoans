

fun main () {
    // This is a parametrized class . We can send sometimes Int
    val parameterizedClassWithInt = parameterizedClass<Int>(123)
    println(parameterizedClassWithInt.getValue())


    // Or sometimes Strings
    val parameterizedClassWithString = parameterizedClass<String>("My  string")
    println(parameterizedClassWithString.getValue())

    //Or ommiting the generic type <String> <Int> like this
    val parameterizedClassDouble = parameterizedClass(0.12)
    val res = parameterizedClassDouble.getValue()
    println(parameterizedClassDouble.getValue())

    val parameterizedProducer = ParameterizedProducer("string")
    val ref: ParameterizedProducer<Any> = parameterizedProducer
    // Generic function
    var res1 = receiveItemReturnList(1)
    if(res1 is List)println("Return a list")

    val rest2 = receiveItemReturnList("Book")
    if(rest2 is List)println("Return a list")

    val rest3 = receiveItemReturnString(1)
    if(rest3 == String())println("Return a String")

    val res4 = receive2Items(listOf(1,2,3), listOf("book","Note"))

}


// Generics with class
class parameterizedClass<A>(private val value: A) {

    fun getValue(): A {
        return value
    }
}
//This class produces a result of some type T.
// Sometimes; we want to assign that produced value to a reference that
// is of a supertype of the type T.
class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return value
    }
}

class ClassConsumer<in T>(private val value: T) {
    fun toString(value: T): String {
        return value.toString()
    }
}

//generic functions
fun <T> receiveItemReturnList(item : T) : List<T> {
    var res = listOf(item)
    println(res)
    return  res

}

fun <T> receiveItemReturnString (item : T) : String {
    println(item.toString())
    return (item.toString())
}

fun <T> receive2Items (item1 : T, item2: T) : List<T> {
    var res = listOf(item1, item2)
    return res
}

