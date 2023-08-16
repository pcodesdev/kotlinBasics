//Main Function
fun main(){
    messages()
    compError()
    stringTemp()
    partyAttendance()
    salary()
    mathOperations()
    defParameter()
    pedometer()
    compare()
    weather()
}

//01 Print messages
fun messages(){
    println("Use the val keyword when the value doesn't change. ")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

//02 fix compiler error
////Initial code
//fun compError() {
//    println("New chat message from a friend'}
//}
//Rectified code
fun compError() {
    println("New chat message from a friend")
}

//03 String Template
fun stringTemp() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

//04 String Concatenation
fun partyAttendance() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

//05 Message Formatting
fun salary() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary with a bonus of $bonusAmount .")
}

//06 Implementing basic mathematic operations
fun add(a: Int, b: Int):Int{
 return a + b;
}

fun subtract(a: Int, b: Int) : Int{
    return a - b;
}
fun mathOperations() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result=add(firstNumber ,secondNumber)
    val anotherResult=add(firstNumber, thirdNumber)
    val division=subtract(firstNumber, secondNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $division")
}

//07 Default Parameter
fun defParameter() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
    println(displayAlertMessage(emailId="pere@gmail.com"))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(os : String = "Unknown OS", emailId : String) : String{
    return "There's a new sign-in request on $os for your Google Account $emailId."
}

//08 Pedometer
fun pedometer() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    return numberOfSteps * caloriesBurnedForEachStep
}

//09 compare 2 numbers
fun compare(){
    val timeSpentYesterday = 120
    val timeSpentToday = 80

    println(timeSpentToday > timeSpentYesterday)
    println(timeSpentToday < timeSpentYesterday)
}

//10 code cleaning
fun weather() {

    val result=weatherDetails("Nairobi", 27, 32, 67)
    val result1=weatherDetails("Tokyo", 32, 36, 10)
//    println("City: Ankara")
//    println("Low temperature: 27, High temperature: 31")
//    println("Chance of rain: 82%")
//    println()
//
//    println("City: Tokyo")
//    println("Low temperature: 32, High temperature: 36")
//    println("Chance of rain: 10%")
//    println()
//
//    println("City: Cape Town")
//    println("Low temperature: 59, High temperature: 64")
//    println("Chance of rain: 2%")
//    println()
//
//    println("City: Guatemala City")
//    println("Low temperature: 50, High temperature: 55")
//    println("Chance of rain: 7%")
    println(result)
    println(result1)
}

fun weatherDetails(city : String, lowTemperature : Int, highTempetature: Int, rainingChance : Int) : String{
    return "City: $city \nLow temperature: $lowTemperature, High temperature: $highTempetature \nChance of rain: $rainingChance%"
}