package basic

fun main() {
    print("Enter 1st number: ")
    val num1: Int = readln().toInt();
    print("Enter 2nd number: ")
    val num2: Int = readln().toInt();
    print("Enter 3rd number: ")
    val num3: Int = readln().toInt();

    val min = minOf(num1, num2, num3)
    val max = maxOf(num1, num2, num3)

    println("Min = $min")
    println("Max = $max")

}