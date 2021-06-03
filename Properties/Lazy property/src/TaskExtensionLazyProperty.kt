
import java.util.concurrent.atomic.AtomicInteger

fun main () {
    /*
    Lazy property : The initialization sequence runs when the object
    is accessed in the code, not at its declaration.
    Which also means that if it is never used, it is never initialized
    Advantages
    -not running unnecessary code
     - a smaller memory footprint
      - and faster execution.
     */

    val numberOfInitializations: AtomicInteger = AtomicInteger()
    val lazyValue: ClassWithHeavyInitialization by lazy {
        numberOfInitializations.incrementAndGet()
        ClassWithHeavyInitialization()
    }
    // when
    println(lazyValue)
    println(lazyValue)

    // then
    if(numberOfInitializations.get() == 1)  print("Equal")
    //assertEquals(numberOfInitializations.get(), 1)

    val lazy = Lazy(initializer = { 1 })


}

class ClassWithHeavyInitialization ()

class Lazy(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}