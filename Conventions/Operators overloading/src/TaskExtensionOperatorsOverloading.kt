fun main() {

    /*
    EXAMPLE 1 :  ◊◊◊◊◊ using TimeIntervals ir returns a new date after adding time ◊◊◊◊◊
    If i enter my birthday date I can add  year, weeks and days to it.
    */
    val BenBirthday = MyDate(1980, 8, 5)
    val addYear = TimeInterval.YEAR
    val addWeek = TimeInterval.WEEK
    val addDay = TimeInterval.DAY
    println("Ben's birthday is " + BenBirthday)
    val newDate1 = BenBirthday.addTimeIntervals(addYear, 2)
    val newDate2 = newDate1.addTimeIntervals(addWeek, 4)
    val newDate3 = newDate2.addTimeIntervals(addDay, 5)
    println("new Birhday is " + newDate3)


    /*
    EXAMPLE 2 :  ◊◊◊◊◊ Add to points using the plus operators overloading ◊◊◊◊◊
    */

    val point1 = Point(1, 2)
    val point2 = Point(3, 4)
    println("The new values are " + point1.plus(point2))

    /*
    EXAMPLE 3 :  ◊◊◊◊◊ Add two dates  using the plus  operators overloading ◊◊◊◊◊
    */

    val date1 = RRSDatesPlus(2000, 2, 2)
    val date2 = RRSDatesPlus(1000, 1, 1)
    val date3 = println("The new date is  " + date1.plus(date2))

    /*
    EXAMPLE 4 :  ◊◊◊◊◊ Add two dates  using the plus  operators overloading ◊◊◊◊◊
    */
    // 1977 9 25 + year *2 +  weeks *3 +   days*4 ====  my  birthday plus 2 yearsm  3  weeks and 4 days

    val dateresult = MyDate(2000, 1, 1)
    val timeInterval1 = TimeInterval.DAY
    val final = dateresult.plus(timeInterval1)


}




data class Point (val x : Int, val y :Int)

operator fun Point.plus(other : Point) = Point(x + other.x,y + other.y)


data class RRSDatesPlus(val year : Int, val month: Int, val day : Int )

operator fun RRSDatesPlus.plus(other : RRSDatesPlus) = RRSDatesPlus(year + other.year, month + other.month, day + other.day)




