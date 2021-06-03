import kotlin.reflect.KProperty
//Delegates
fun main () {

   var example = Example()
    //example.myLazyValue = "initial value"
    //print(example.myLazyValue)
    var noLazy = NoLazy()
}
class Example {
    var myLazyValue : String by MyOwnLazy()
}

class MyOwnLazy {

    private var calculatedValue: String? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        if (calculatedValue == null) {
            calculatedValue = calculateValue()
        }
        return calculatedValue!!
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        calculatedValue = value
    }

    private fun calculateValue(): String {
        return "neWval"
    }
}

class NoLazy () {
    val name = String
}