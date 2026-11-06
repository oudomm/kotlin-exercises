package basic

fun main() {
    print("Enter a number: ")
    val num: Int = readln().toInt()
    var factorial = num
    for (i in num  downTo 2) {
        factorial *= (i - 1)
    }
    print("Factorial = $factorial")
}