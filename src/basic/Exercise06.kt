package basic

fun main() {
    print("Enter a number: ")
    val num: Int = readln().toInt()
    if (num % 2 == 0) {
        println("Even")
    } else {
        print("Odd")
    }
}