
fun printMessageWithPrefix(message: String, prefix: String = "INFO" ) {
    println("[$prefix]  $message")
}

fun sum(x1: Int, x2: Int): Int {
    return x1 + x2
}

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printMessageWithPrefix("hello")
    println(sum(1, 2))

    // infix functions
//    infix fun Int.times(str: String) = str.repeat(this)
//    println(2 times "Bye ")

    // operator functions
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "Bye ")

    log("apple", "banana", "strawberry")



}