/*
INVOKE :
   Objects with invoke() method can be invoked as a function.
   You can add invoke extension for any class https://dzone.com/articles/learning-kotlin-invoke
 */

fun main (){


 /*
EXAMPLE 1 :  ◊◊◊◊◊ ADDING INVOKE EXAMPLE 1 ◊◊◊◊◊
 */

    val student = Student()
    println(student)

 /*
EXAMPLE 2 :  ◊◊◊◊◊ INVOKE CALLING THE SAME FUNCTION SEVERAL TIMES ◊◊◊◊◊
 */
    val car = Car()
    car()()()()()()()()()
    println("Car was called ${car.count} times")


/*
EXAMPLE 3 :  ◊◊◊◊◊ INVOKE CALLING with paramaters ◊◊◊◊◊
*/

    val word = Word()
    word("A")("M")("O")("R")
    println(word.word)


/*
EXAMPLE 4 :  ◊◊◊◊◊ INVOKE count how many times it was invoked ◊◊◊◊◊
*/

    val invokable = Person()
    invokable()()
    println("invokable was called ${invokable.numberOfInvocations} times")


}


class Student() {
    operator fun invoke(): Boolean {
        return this.passExam(10)
    }


    fun passExam(score: Int): Boolean {
        return score > 80
    }
}

class Car() {
    var count = 0
    operator  fun invoke(): Car {
        count++
        println("I was called $count")
        return this
    }
}

class Word() {
    var word = "  "
    operator  fun invoke (s : String) : Word {
        word += s
        return this

    }
}

class Person {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Person {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(person: Person) = person()()
