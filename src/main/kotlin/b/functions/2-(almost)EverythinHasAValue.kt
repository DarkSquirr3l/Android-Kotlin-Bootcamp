package b.functions

import kotlin.random.Random

fun main() {
    val isUnit = println("This is an expression")
    println("Step")
    println(isUnit)
    print("\n")

    println("If else exampl")
    val temperature = Random.nextInt(-50, 75)
    val isHot = if (temperature > 35) true else false
    println(isHot)

    val message = "The water temperature is ${ if (temperature > 40) "too hot" else "OK"}"
    println(message)

    //loops are the exception to everything has a value
}