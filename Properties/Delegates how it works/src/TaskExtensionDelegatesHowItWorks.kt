import java.util.*

fun main () {
    val myDate = MyDate(1977, 9, 25)
    val dateInMil = myDate.toMillis()
    println("Date in milliseconds $dateInMil")
    println("Date from mili to date" +  dateInMil.toDate())
}

