package a.kotlinBasics

fun main () {

    var fishFoodTreats = 6

    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    // can be written as...

    fishFoodTreats = fishFoodTreats?.dec() ?:0   //Elvis operator - https://kotlinlang.org/docs/null-safety.html#elvis-operator
    println(fishFoodTreats)

    // It's shorthand for "if fishFoodTreats is not null, decrement and use it; otherwise use the value after the ?:,
    // which is 0." If fishFoodTreats is null, evaluation is stopped, and the dec() method is not called.

}