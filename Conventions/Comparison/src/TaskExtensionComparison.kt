
import jdk.nashorn.api.scripting.ScriptUtils.convert
import java.math.BigDecimal
import java.math.BigInteger
import java.util.*

/*

THE OPERATOR KEYBOARD
String and numeric types in Java can use the + operator for concatenation and addition,
respectively. No other Java type can reuse this operator for its own benefit


UNARY OPEARATIONS  : Are those that work on just one operand.
For example, -a, a++ or !a are unary operations.
 */

fun main (args : Array <String>){

/*
EXAMPLE 1 :  ◊◊◊◊◊ OVERLAODING WITH  OPERATOR KEYWORD ◊◊◊◊◊◊
*/
    val p1 = Point (100,2)
    val p2 = Point (3,400)
    val p3 = 5
    println("adding" + p1 + p2)
    println("take away ${p1 - p2}")
    val new = p1 - p2
    println("multiply" +p1 * p2)
    println("Negacion" + -p1)
    var p5 = Point(4, 2)
    println("Increment ${++p5}")
    var p6 = Point(8, 12)
    println ("not ${!p6}")
    var peterAge =  Age(50, 90)
    var MariaAge = Age(100,1)
    if (peterAge > MariaAge) println("Peter is older than Maria")

    var date1 = MyDates(2010,9,25)
    var date2 = MyDates(2010,9,13)
    testDates(date1 , date2 )

/*
EXAMPLE 1 :  ◊◊◊◊◊ OVERLAODING FOR UNARY OPERATIONS◊◊◊◊◊◊
*/


}

//OVERLOADING OPERATORS
data class Point (val x : Int, val y :Int)

operator fun Point.plus(other : Point) = Point(x + other.x,y + other.x)

operator fun Point.minus(other : Point) = Point (x - other.x , y - other.y)

operator fun Point.times(other : Point) = Point (x * other.x , y * other.y)

operator fun Point.unaryMinus() = Point (-x,  -y)

operator fun Point.inc() = Point (x+1, y+1)

operator fun Point.not() = Point (x,y)


//COMPARE TO ages

class Age (val age1: Int, val age2: Int) : Comparable<Age> {
    override fun compareTo(other: Age): Int =
            (age1).compareTo(other.age2)
//COMPARE TO DATES

}
data class MyDates(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDates> {
        override fun compareTo(other: MyDates) = when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
    }

    fun testDates(date1: MyDates, date2: MyDates) {
        // this code should compile:
        println("Results is  ${date1 < date2}  Date 1 is less than date 2")
    }






