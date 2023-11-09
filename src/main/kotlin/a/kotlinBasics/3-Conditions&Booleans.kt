package a.kotlinBasics

fun main() {

    val numOfFish = 50;
    val numOfPlants = 250;

    if (numOfFish > numOfPlants) {
        println("Hungry fish!")
    } else
        println("Happy fish! Glub glub...")

    if (numOfFish in 1..100) {  //range - fancy way of writing between two numbers
        println(numOfFish)
    }

    if(numOfFish == 0) {
        println("You got no fish!")
    } else if (numOfFish < 25) {
        println("You got fish.")
    } else
        println("You have an abundance of fish!")

    when (numOfFish) {                      //like a switch statement, can use ranges.
        0 -> println("You got no fish!")
        in 1..24 -> println("You got fish.")
        else -> println("You have an abundance of fish!")
    }
}



