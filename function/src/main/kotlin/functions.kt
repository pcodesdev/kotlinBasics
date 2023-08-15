//Main fuction
fun main() {
//    calling a function from another function
    val greetings1 = birthdayGreeting(age=10)

    val greetings2 = birthdayGreeting("Ann", 7)
    println(greetings1)
    println(greetings2)
}

//Unit is used to return an empty function
//fun birthdayGreetings():Unit{
//    println("Happy Birthday, Rover!")
//    println("You are now 5 years old!")
//}

//function that returns a string
//function with multiple parameters
//fun birthdayGreeting(name: String, age: Int): String {
//
//    val nameGreeting  = "Happy Birthday, $name!"
//    val ageGreeting = "You are now $age years old!"
//
//    return "$nameGreeting\n$ageGreeting"
//}

//default arguments
fun birthdayGreeting(name: String = "Rover", age: Int): String {

    val nameGreeting  = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"

    return "$nameGreeting\n$ageGreeting"
}