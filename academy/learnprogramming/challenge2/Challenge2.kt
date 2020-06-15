package academy.learnprogramming.challenge2

fun main(args: Array<String>) {
    // 1. Declare a non-nullable float variable two ways, and assign it the value of -3847.384
    val f1 = -3847.384f
    val f2: Double = -3847.384
    val f3: Float = f2.toFloat()

    // 2. Now change both of those variable declarations into nullable variables
    val f4: Float? = -3847.384f
    val f5: Float? = f2.toFloat()

    // 3. Now declare an array of type non-nullable Short. Make it size 5, and assign it the values
    // 1, 2, 3, 4, 5
    val shortArray = shortArrayOf(1, 2, 3, 4, 5)

    // 4. Now declare an array of nullable Ints and initialize it with the values 5, 10, 15, 20, 25, 30 ... 200
    val intArray = Array(40) {i -> (i + 1) * 5}
    println(intArray)

    // 5. You have toi call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could pass to this method
    // and fill it with the values 'a', 'b', and 'c'
    val javaArray = charArrayOf('a', 'b', 'c')

    // 6. Given the following code
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable, and assign it x.toLowerCase() when x
    // isn't null, and the string "I give up!" when x is null
    val t1: String? = x?.toLowerCase() ?: "I give up!"
    println(t1)

    // 7. Now use the let function to (a) lowercase the string, and then (b) replace "am" with
    // "am not in the result.
    println(t1?.let{ modify(it) })

}

fun modify(input: String?) : String? {
    return input?.toLowerCase()?.replace("am", "am not")
}