

fun main(args: Array<String>) {


    fun containsEven(collection: Collection<Int>): Boolean =
            collection.any { TODO() }


    // Function that takes two strings and don't return anything
    fun joinString(a: String , b: String ) {
         a+b

    }


    // Function that takes a collection of integers and returns and boolean
    fun CheckSizeGreatedThan1(collection: Collection<Int>): Boolean {
        return collection.size == 3

    }

    fun findValueGreaterThan(collection: Collection<Int>): Boolean =
           collection.find {it > 0} == 2


    fun findEvenNumber(collection: Collection<Int>): Boolean =
            collection.any {it % 2 == 0}

    val col = listOf<Int>(1,1,12)
    //containsEven1(col)
    val r = CheckSizeGreatedThan1(col)
    val d = findValueGreaterThan(col)
    val isEvenNumber = findEvenNumber(col)

    //containsEven(col)



    fun assertValueInList(mutableListOf : List<(String)>){
        //Assert("x" in mutableListOf) {"X Value not found"}

    }


    val list1 = listOf<String>("a","b")
    assertValueInList(list1)



    /*
    LAMBDA EXPRESSIONS.
    SYNTAX:
    val lambdaName : Type = { argumentList -> codeBody }
    Without the type will be
    val lambdaName = {argumentList -> codeBody }
     */


    // Calling funcions
    val intv = squareValueFunction(5)
    println("calling regular function " +  intv)


    // Lambda expression fashion examples

    //This lambda multiplies its single argument numbers by 100 then returns that value as a String.
    // It receives Input as an argument and multiplies times 100.
    // The latest value is the return. In  this case a stirng
    val multiplyValue = { input: Int ->
        val magnitude = input * 100
        magnitude.toString()
    }

    //This lambda expression   that takes  and int number and returns Int: (Int) -> Int
    val squareVal =  { number : Int ->
        // It returns the last sentence of th labda expression
        val abc = number * 100
        abc

    }
   // The final expression is the value that will be returned after a lambda is executed
    val calculateGrade = { grade : Int ->
        when(grade) {
            in 0..40 -> "Fail"
            in 41..70 -> "Pass"
            in 71..100 -> "Distinction"
            else -> false
        }
    }

     calculateGrade(99)

    // Example defining the arguments and return type explicitly
    // and may use the return statement the same as any method:
    //fun(grade: Int): String  / This explicitly says that we  receive and int and return a String
    val calculateValue = fun(grade: Int): String {
        if (grade < 0 || grade > 100) {
            return "Error"
        } else if (grade < 40) {
            return "Fail"
        } else if (grade < 70) {
            return "Pass"
        }

        return "Distinction"
    }

    // Lambda expression to use it
    // 1. Define the array
    val array = arrayOf(1, 2, 3, 4, 5, 6)
    // Longhand version read each array
    array.forEach { item -> println(item * 4) }
    // shorthand
    array.forEach { println(it * 4) }

    println("Value 14Jane is" + squareVal(5))
    //Using it in lambda expression
    // no return value
    //val nonReturn : Int -> Unit = {num  -> println(num)}
    val theList = listOf("one", "two", "three")
    assert("two" in theList)




    val stringMult = multiplyValue(33)
    println("Lenght is ${stringMult.length} and the value is ${stringMult}" )
    println("Calculation  using lambda function " + multiplyValue(55))
    val square : (Int) -> Int  = { value ->
        value * value

    }
    println(square(5))

   // Lambda  function
    val maxValue = { a: String, b: String -> a.length < b.length  }
    println("maxValue is" + maxValue)
    // Regular function
    println(compareFucntion("rosi", "pe"))

}
    // Regular  function  that multiply two values and returns an integer
    fun squareValueFunction(value: Int) : Int =  value * value

    // Regular function fashion example 2
    fun compareFucntion(a: String, b: String): Boolean = a.length < b.length