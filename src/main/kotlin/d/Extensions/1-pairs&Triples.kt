package d.Extensions

fun main() {
    val equipment = "fish net" to "catching fish" //pair - the 'to' creates a pair
    println("${equipment.first} used for ${equipment.second}")

    val numbers = Triple(6, 9, 42) //triple
    println("to string: ${numbers.toString()}")
    println("to list: ${numbers.toList()}")

    val equipment2 = ("fish net" to "catching fish") to "equipment" //pair in a pair
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

    // Destructure a pair and triple
    val equipment3 = "fish net" to "catching fish"
    val (tool, use) = equipment3
    println("$tool is used for $use")

    val numbers1 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers1
    println("$n1 $n2 $n3")
}