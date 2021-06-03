const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString= """
    #question = "$question"
    #answer = $answer""".trimIndent()


val tripleQuotedStringMarging = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")




val receipt = """Item 1: $1.00
Item 2: $0.50"""

val receipt2 = """Item 1: $5.00
                >Item 2: $5.50""".trimMargin(">")

val receipt3 = """Item 1: $1.00\nItem 2: $0.50"""

val receipt4 = """Item 4: $1.00${"\n"}Item 5: $0.50"""

val s = "Hello, world!\n"




val d = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()


val price = """
${'$'}9.99
"""


val withoutIndent =
        """
            ABC
            123
            456
        """.trimIndent()

fun main() {
    println(tripleQuotedString)
    println(receipt)
    println(receipt2)
    println(receipt3)
    println(receipt4)
    println(s)
    println(d)
    println(price)
    println(withoutIndent)
    println(tripleQuotedString)
    println(tripleQuotedStringMarging)

}