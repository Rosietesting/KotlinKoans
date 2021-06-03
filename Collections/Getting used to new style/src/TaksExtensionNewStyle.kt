fun main () {


    val myList = listOf("aro", "boca", "cama", "zorro", "Pato", "lora", "tot")

    // Short version of the code
    println((myList.groupBy { it.length }).values.maxBy {it.size})


    // Long version of the same code with the getMaxList function :(
    println(getMaxList(myList))

}

fun getMaxList(collection: Collection<String>) : Collection<String>? {

    val groupsByLength = mutableMapOf<Int, MutableList<String>>()

    for (s in collection) {
        var strings: MutableList<String>? = groupsByLength[s.length]
        if (strings == null) {
            strings = mutableListOf()
            groupsByLength[s.length] = strings
        }
        strings.add(s)
        //println("Strings" + strings)
        //println("groupsByLength" + groupsByLength)
    }

   // this creates a map with
    // key = group by  lenght
    // values = lis of the values that has the given lenght

    var maximumSizeOfGroup = 0
    for (group in groupsByLength.values) {
        if (group.size > maximumSizeOfGroup) {
            maximumSizeOfGroup = group.size
        }
        //println("maximumSizeOfGroup " + maximumSizeOfGroup)
    }


    for (group in groupsByLength.values) {
        if (group.size == maximumSizeOfGroup) {
            //println("group" + group)
            return group
        }

    }
    return null
}