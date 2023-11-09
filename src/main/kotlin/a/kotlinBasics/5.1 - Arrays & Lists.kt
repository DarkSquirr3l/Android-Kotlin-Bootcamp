package a.kotlinBasics

fun main () {
    val fishes = listOf("salmon", "trout", "mackerel")
    println(fishes)

    val masFishes = mutableListOf("tuna", "shark", "swordfish")
    println(masFishes.remove("shark")) //remove() returns true
    println(masFishes)

    var fish = listOf("sardine", 5, true)
    println(fish)

    //whilst there are mutable list, there are no mutable arrays

    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))

    val mixture = arrayOf("fish", 2)
    println(mixture)

    val numbers = intArrayOf(1,2,3) //using an array of primitive type avoids the overhead of boxing
    println(numbers)

    val numbers3 = intArrayOf(4,5,6) //two arrays can be combined with the + operator
    val foo2 = numbers3 + numbers
    println(foo2[5])

    //you can have arrays and lists nested within each other
    //if you print a list it will print out the items in the list,
    // if you print an array kotlin will print the address instead of the contents
    //you need to use the array utility to print it

    println("Printing array with println then printing array with array util")
    println(numbers)
    println(numbers.contentToString())

    val array = Array (5) { it * 2 } // it refers to the array index, starting with 0
    println(java.util.Arrays.toString(array))
    println(array.contentToString())

}