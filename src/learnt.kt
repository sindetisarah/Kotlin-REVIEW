import java.util.*

fun main() {
promptDetails()
    println(vowelsCount("saraipapai"))
    println(vowelsCount("sheriahouse"))


//    initialising an instance of an object to mimic the actual
    var sarah=(Student("Sarah","Nashivai","Lovelace","Mwezi","Kotlin",19))

    println(sarah.alterAge(23))

    println(sarah.fullName("sarah"))

    primitive()

    primitive2()

}

fun promptDetails() {
//    Created a function to allow user prompt input using the inbuilt function readLine()
    println("Enter your full name: ")
    val fullName = readLine()!!

//    Converted the input which is a String to an integer
    println("Enter Your age: ")
    var age = readLine()!!.toInt()

    println("Enter your phone number: ")
    var number = readLine()!!

    println("Enter your email : ")
    var email = readLine()!!

    println("Enter your location: ")
    var location = readLine()!!

//Final message to the user
    println("Hello $fullName, @$email from $location welcome to Google ")
}
fun vowelsCount(str:String):Int {
//    set the value of count to zero in a memory location called vowelsCount
    var vowelsCount = 0;
//    initialised for loop to iterate through the any given string
    for (x in str) {
//        initialised if else statement to increment my value count based on the condition aeiou vowels
        if (x == 'a') {
            vowelsCount++;
        } else if (x == 'e') {
            vowelsCount++;

        } else if (x == 'i') {
            vowelsCount++;
        } else if (x == 'o') {
            vowelsCount++;
        } else if (x == 'u') {
            vowelsCount++;
        }

    }
    return vowelsCount;

}
//created a class Student which is just a template
class Student(var firstName:String,var secondName:String,var Class:String,var room:String,var course:String,var age:Int)
{
    fun fullName(thirdName:String):String{
        val name="$firstName $secondName $thirdName"
        return name
    }
    fun alterAge(age:Int):Int {
       var age=age+1
        return age

    }
}
        

//primitive kotlin arrays with size#do not break them
fun primitive() {
    var arr = IntArray(3){11}
    println("${arr[0]} ${arr[1]} ${arr[2]}")
}
fun primitive2(){
    var arr = IntArray(2){11}
    println("${arr[0]} ${arr[1]} ")
}






