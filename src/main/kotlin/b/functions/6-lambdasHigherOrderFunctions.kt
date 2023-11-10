package b.functions

/* Lambdas
   In addition to traditional named functions, Kotlin supports lambdas.
   A lambda is an expression that makes a function.
   But instead of declaring a named function, you declare a function that has no name.
   Part of what makes this useful is that the lambda expression can now be passed as data.
   In other languages, lambdas are called anonymous functions, function literals, or similar names.
*/

/* Higher-order functions
 * You can create a higher-order function by passing a lambda to another function.
 * In the previous task, you created a higher-order function called filter.
 * You passed the following lambda expression to filter as the condition to check: {it[0] == 'p'}
 * Similarly, map is a higher-order function, and the lambda you passed to it was the transformation to apply.
 */

fun main() {
    println("Lambda function")
    var dirtyLevel = 20
    val waterFilters = { dirty : Int -> dirty / 2}
    /*
     * This is a lambda expression assigned to a val named waterFilter.
     * The type of waterFilter is inferred by the Kotlin compiler based on the lambda's signature.
     * In this case, the compiler will infer that waterFilter
     * is of type (Int) -> Int because it takes an Int parameter and returns an Int value.
     */

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    /*
     * This line explicitly declares waterFilter as a variable of the function type (Int) -> Int,
     * which means it is a function that takes an Int parameter and returns an Int.
     * The lambda { dirty -> dirty / 2 } is then assigned to waterFilter.
     * The type declaration makes it clear to the reader and the compiler what type waterFilter is,
     * and the lambda's parameter type does not need to be explicitly stated because it can be inferred from the context.
     */

    println(waterFilter(dirtyLevel))
    println("\n")

    // A higher order function, where one function takes another as an argument

    // in this case a lambda function is pass
    val waterFilterer: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilterer))

    // however you can pass a regular function using the syntax below

    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))

    /* Note: Kotlin prefers that any parameter that takes a function is the last parameter.
     * When working with higher-order functions, Kotlin has a special syntax, called the last parameter call syntax,
     * which lets you make the code even more concise. In this case, you can pass a lambda for the function parameter,
     * but you don't need to put the lambda inside the parentheses.
     */
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}