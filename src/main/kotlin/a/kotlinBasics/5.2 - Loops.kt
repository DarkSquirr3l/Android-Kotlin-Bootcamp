package a.kotlinBasics

fun main() {

    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        println(element + " ")
    }

    //elements and indexes can be looped through at the same time
    for ((index, element) in school.withIndex()) {
        print("Item at $index is $element\n")
    }

    //using step and downTo
    println("Looping using step and downTo\n")
    for (i in 1..5) print(i)
    print("\n")
    for (i in 5 downTo 1) print(i)
    print("\n")
    for (i in 3..6 step 2) print(i)
    print("\n")
    for (i in 'd'..'g') print (i)
    print("\n")

    //while and do while loops
    println("while and do while loops")
    var bubbles = 0

    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    // repeat is new and unique to java
    repeat(2) {
        println("A fish is swimming")
    }

}