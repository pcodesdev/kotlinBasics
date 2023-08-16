12. Solution code
    Print messages
    The solution uses the println() function to print the messages on each line.


fun main() {
println("Use the val keyword when the value doesn't change.")
println("Use the var keyword when the value can change.")
println("When you define a function, you define the parameters that can be passed to it.")
println("When you call a function, you pass arguments for the parameters.")
}
Fix compile error
The code contained two compilation errors:

The string should end with a double quotation mark rather than a single quotation mark.
The function argument should end with a parenthesis rather than a curly bracket.

fun main() {
println("New chat message from a friend")
}
String templates
The compilation errors are the result from the assignment of the discountPercentage and offer read-only variables to new values; this assignment isn't allowed.


fun main() {
val discountPercentage = 20
val item = "Google Chromecast"
val offer = "Sale  - Up to $discountPercentage% discount off $item! Hurry Up!"

    println(offer)
}
As an alternative solution, you could declare the discountPercentage integer and offer string with the var keyword. However, their values are immutable in the context of the program, so you can stick with the val keyword.

String concatenation
Step 1
The program prints this output:


The total party size is: 2030
This was a trick question. When the + operator is used on String values, it produces a concatenated string. The integers are wrapped in double quotation marks, so they're treated as strings instead of integers, hence the output of 2030.

Step 2
You could remove the double quotation marks around the numberOfAdults and numberOfKids variables to convert them to Int variables.


fun main() {
val numberOfAdults = 20
val numberOfKids = 30
val total = numberOfAdults + numberOfKids
println("The total party size is: $total")
}
If you remember, the Kotlin compiler can infer the type of variables based on the values assigned to them. In this case, the compiler infers that the numberOfAdults and numberOfKids variables are Int types.

Message formatting
The program prints this output:


Congratulations for your bonus! You will receive a total of 5000 + 1000 (additional bonus).
"$baseSalary + $bonusAmount" uses the template expressions syntax. In template expressions, the code is evaluated first and then the result is concatenated in a string.

In the question, the $baseSalary variable is evaluated to a 5000 value and the $bonusAmount variable is evaluated to a 1000 value. Then, the result is concatenated to produce "5000 + 1000" and assigned to the result variable.

Implement basic math operations
Step 1
Define an immutable result variable with the val keyword and then assign the result of the addition operation to it:


fun main() {
val firstNumber = 10
val secondNumber = 5

    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}
Step 2
Create an add() function that accepts a firstNumber parameter and secondNumber parameter, both of Int type, and returns an Int value.
Enter the code for the addition operation inside the add() function body and then use the return keyword to return the result of the operation.

fun add(firstNumber: Int, secondNumber: Int): Int {
return firstNumber + secondNumber
}
Step 3
Define a subtract() function that accepts a firstNumber parameter and secondNumber parameter, both of Int type, and returns an Int value.
Enter the code for the subtraction operation inside the subtract() function body and then use the return keyword to return the result of the operation.

fun subtract(firstNumber: Int, secondNumber: Int): Int {
return firstNumber - secondNumber
}
Modify the main() function to use the new subtract() function. An example solution could look like this:

fun main() {
val firstNumber = 10
val secondNumber = 5
val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
return firstNumber - secondNumber
}
Default parameters
Step 1
Create a displayAlertMessage() function that accepts an operatingSystem parameter and emailId parameter, both of String type, and returns a String value.
In the function body, use a template expression to update the message and return it.

fun displayAlertMessage(operatingSystem: String, emailId: String): String {
return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}
Step 2
Assign an "Unknown OS" value to the operatingSystem parameter.

fun displayAlertMessage(
operatingSystem: String = "Unknown OS",
emailId: String
): String {
return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}
Pedometer
Function names and variable names should follow the camel case convention.

If the names contain multiple words, lowercase the first letter of the first word, capitalize the first letter of subsequent words, and remove any spaces between the words.

Example function names include:

calculateTip
displayMessage
takePhoto
Example variable names include:

numberOfEmails
cityName
bookPublicationDate
To learn more about names, see Naming rules.

Avoid using a Kotlin keyword as a function name because those words are already assigned specific meanings in the Kotlin language.

Your solution code should look something like this code snippet:


fun main() {
val steps = 4000
val caloriesBurned = pedometerStepsToCalories(steps);
println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
val caloriesBurnedForEachStep = 0.04
val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
return totalCaloriesBurned
}
Compare two numbers
Create a compareTime() function that accepts a timeSpentToday parameter and a timeSpentYesterday parameter, both of Int type, and returns a Boolean value.
The solution relies on the > comparison operator. The operator evaluates to a Boolean value, so the compareTime() function simply returns the result of timeSpentToday > timeSpentYesterday.

For example, if you pass a 300 argument to the timeSpentToday parameter and a 250 argument to the timeSpentYesterday parameter, the function body evaluates to 300 > 250, which returns a true value because 300 is greater than 250.


fun main() {
println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
return timeSpentToday > timeSpentYesterday
}

Have I spent more time using my phone today: true
Have I spent more time using my phone today: false
Have I spent more time using my phone today: false
Move duplicate code into a function
Create a function that prints out the weather details for the city of Ankara after the main() function.
For the function name, you can use printWeatherForCity() or something similar.

Call the function from the main() function.
The program should print the weather details for Ankara.


fun main() {
printWeatherForCity()
}

fun printWeatherForCity() {
println("City: Ankara")
println("Low temperature: 27, High temperature: 31")
println("Chance of rain: 82%")
println()
}
Now you can create another function that's more flexible so that it can print weather details for other cities.

Replace the Ankara-specific parts of the println() statements with variables.
Remember to use camel case convention for the variable names and the $ symbol before the variable so that the value of the variable gets used instead of the variable name. These are string templates which you learned about in an earlier codelab.


fun printWeatherForCity() {
println("City: $cityName")
println("Low temperature: $lowTemp, High temperature: $highTemp")
println("Chance of rain: $chanceOfRain%")
println()
}
Change the function definition so that those variables are parameters that must be passed into the function when it's called and specify the data type for each parameter.
The cityName parameter is of String type, while the lowTemp, highTemp, and chanceOfRain parameters are of Int type.

There's no return value needed in the function definition because the messages are printed to the output.


fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
println("City: $cityName")
println("Low temperature: $lowTemp, High temperature: $highTemp")
println("Chance of rain: $chanceOfRain%")
println()
}
Update the main() function to call the printWeatherForCity() function and pass in the weather details for Ankara.
The city name is "Ankara", the low temperature is 27, the high temperature is 31, and the chance of rain is 82.


fun main() {
printWeatherForCity("Ankara", 27, 31, 82)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
println("City: $cityName")
println("Low temperature: $lowTemp, High temperature: $highTemp")
println("Chance of rain: $chanceOfRain%")
println()
}
Run the program to verify that the output shows the weather details for Ankara.
Call the printWeatherForCity() function with the weather details for the other cities.

fun main() {
printWeatherForCity("Ankara", 27, 31, 82)
printWeatherForCity("Tokyo", 32, 36, 10)
printWeatherForCity("Cape Town", 59, 64, 2)
printWeatherForCity("Guatemala City", 50, 55, 7)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
println("City: $cityName")
println("Low temperature: $lowTemp, High temperature: $highTemp")
println("Chance of rain: $chanceOfRain%")
println()
}
Run the program.
It should print the same output as the original program, but now your code is more concise and doesn't contain unnecessary repetition! All the code for printing weather details of a city is centralized in a single place: the printWeatherForCity() function. If you ever want to change how weather details are displayed, you can change them in a single place that applies to all the cities.