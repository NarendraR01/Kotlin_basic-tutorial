fun main(){
    var a=10
    var b=2
    display()
    println(add(a,b))
    println(sub(a,b))
    println(multi(a,b))
    var (vari1,vari2) =twoValues()
    println("$vari1,$vari2")
    var(x,y,z)=threeValues()
    println("$x $y $z")
}
fun display(){  //Normal function declaration without return aka a void function
    println("Display Mathematical Operations")
}
fun add(a:Int,b:Int):Int{   //:Int outside parentheses  refers to the datatype the return is giving
    return a+b
}

fun sub(a:Int,b:Int):Int=(a-b) // Single expression function
fun multi(a:Int,b:Int)= a*b //This also works as there is a single value being returned without return statement

//function returns two values
fun twoValues():Pair<String,Int> = "Raj" to 20
                    //or
fun twoValues1():Pair<String,Int>{
    //return "Raj" to 20
                //or
    return Pair("Raj",20)
}
//function returns three values
fun threeValues():Triple<Int,Float,String> = Triple(20,23.4f,"Name")
                    //or
fun threeValues1():Triple<Int,Float,String>{
    return Triple(
        20,
        23.4f,
        "Name")
}