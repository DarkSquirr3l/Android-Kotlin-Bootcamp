package c.OOP

// Abstract classes are always open; you don't need to mark them with open.
// Properties and methods of an abstract class are non-abstract unless you
// explicitly mark them with the abstract keyword. That means subclasses can use them as given.
// If properties or methods are abstract, the subclasses must implement them.

abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

class Shark: AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

// View this page for an explainer on when to use interfaces vs abstract
// https://developer.android.com/codelabs/kotlin-bootcamp-classes#6