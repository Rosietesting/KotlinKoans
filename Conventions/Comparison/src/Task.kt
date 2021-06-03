
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override  fun compareTo(other : MyDate) : Int  =  when {
       year != other.year -> year - other.year
       month != other.month -> month - other.month
       else -> other.dayOfMonth
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
