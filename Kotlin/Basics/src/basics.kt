import kotlin.math.*

const val PIValue=3.14//it is more like static final in java
    // it should be declared before the main function

fun main(){
                        // DIFFERENCE BTW var AND val
    var varname="Razor"
    println(varname)
    varname="Razor Mouse"   //var can be modified "mutable"
    val valname="Rog" //"Read only" //val cannot be modified its is more like a "finale" keyword on it
    //valname="Rog Keyboard" // This line will give !error!
    println(varname)
    println(valname)
                                //"MATH PACKAGE"
    println(PI)//from math package
    var a=10
    var b=22
    println(max(a,b)) //max function is present inside the math
    println(sqrt(10.0))
    println(round(sqrt((10.0))))

                            //"TYPECASTING"
    var x="10"
    var y=10
    println(y+x.toInt())//changes x into int
    println(x+y.toString())

}
//In Kotlin == and .isequals() are providing same functionality
//In Kotlin === is used to compare the memory location of two strings