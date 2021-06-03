fun main (args: Array<String>){

    val versionRange = Version(1,11)..Version(16,30)
    println(Version(17, 19) in versionRange)
    println(Version(1, 20) in versionRange)

    //Contains example

    val list = listOf("a", "b")
    "a" in list  // list.contains("a")
    "a" !in list // !list.contains("a")
    val myDate =  MyDate (1977,9,25)
    val first = MyDate(1944, 3,4)
    val last = MyDate(2020,5,1)
    checkInRanges(myDate,first,last)
}

class Version(val major: Int, val minor: Int): Comparable<Version> {
    override fun compareTo(other: Version): Int  {
        if (this.major != other.major) {
            return this.major - other.major

        }
            return this.minor - other.minor
    }
}


fun checkInRanges(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
