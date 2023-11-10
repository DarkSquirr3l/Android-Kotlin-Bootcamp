package b.functions

fun main () {
    swim() // uses default speed
    swim("slow") // positional argument
    swim(speed="turtle-like") // named parameter
    println("I need to change the water = ${shouldChangeWater("Monday")}")

    // compact functions
    fun isTooHot(temperature : Int) = temperature > 30
    fun isDirty(dirty : Int) = dirty > 30
    fun isSunday(day : String) = day == "Sunday"
}

fun swim(speed : String = "fast") { // default parameter - can be a function
    println("Swimming $speed")
}

fun shouldChangeWater(day : String, temperature : Int = 20, dirty : Int = 20) : Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}