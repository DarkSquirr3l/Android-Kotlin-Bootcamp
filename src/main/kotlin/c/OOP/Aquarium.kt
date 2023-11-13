package c.OOP

import kotlin.math.PI

// by default, classes cannot be subclassed.
// Similarly, properties and member variables cannot be overridden by subclasses
// (though they can be accessed).

//You must mark a class as open to allow it to be subclassed.
// Similarly, you must mark properties and member variables as open,
// in order to override them in the subclass. The open keyword is required,
// to prevent accidentally leaking implementation details as part of the class's interface.

open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {  //constructor
    // var values underlined as Kotlin prefers immutable val where possible
    //getter and setters automatically set by Kotlin
    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * height * length / 1000} l")
    }

    //init blocks executed in the order in which they appear, they're all executed when the constructor is called

    constructor(numberOfFish: Int) : this () { //secondary constructor, must call primary constructor first
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm")

        println("Volume: $volume l Water: $water l (${water /volume*100.0}% full)") // calls the getter below
    }

    open var volume: Int
        get() = width * height * length / 1000  // explicit property getter
        set(value) {
            height = (value * 1000) / (width * length) // If you want a property that your code can read or write,
                                                       // but outside code can only read, you can leave the property
                                                       // and its getter as public and declare the setter private
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9
}

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {

    override var volume: Int
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water: Double = volume * 0.8

    override val shape = "cylinder"

}