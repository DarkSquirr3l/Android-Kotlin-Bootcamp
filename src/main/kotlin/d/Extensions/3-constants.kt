package d.Extensions

const val rocks = 3
// The value for const val is determined at compile time,
// whereas the value for val is determined during program execution,
// which means, val can be assigned by a function at run time.

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

// Kotlin does not have a concept of class level constants.
// To define constants inside a class, you have to wrap them into companion objects declared with the companion keyword.
// The companion object is basically a singleton object within the class.