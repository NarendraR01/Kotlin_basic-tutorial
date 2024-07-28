fun main() {
    //To create arrays
    var arr = arrayOf("Raja", "Ram", "Ramu", "Raj")
    var arr1 = arrayOf<Int>(1, 2, 2, 3, 4)//<Int> a=only allows integer in the array

    println(arr1[0])
    println(arr1.contentToString())


    println(arr[1])
    arr[1] = "Rose"
    println(arr[1])
    println(arr.contentToString())//contentToString is used to print the array properly
    println(arr.size)
    // print(arr)//without the contentToString() method


    //"for Loop"

    for (i in 1..5) {
        print(i)
    }
    println()
    for (i in 1..10 step 2) print(i) //for increment the value step is used
    println()
    for (i in 5 downTo 1) print(i) //dowTo is used while using the numbers in reverse
    println()

    //"forEach loop

    arr.forEach { print("$it ") } //here it is a placeholder
}
