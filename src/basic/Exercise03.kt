package basic

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val formatted = current.format(formatter)
    println("Current Date & Time: $formatted")
}