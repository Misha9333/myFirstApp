import java.awt.Choice

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChois(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChois(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    // Выполнить цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {

        //Запросить у пользователя его выбор
        print("Please ender one of the following: Rock Paper Scissors")
        for (item in optionsParam) print("$item")
        println(".")
            //Прочитать пользовательский ввод
        val userInput = readln()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choise")
    }
    return userChoice

}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //Определите результат
    if (userChoice == gameChoice)  result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"
    //Вывести результат
    println("You chose $userChoice. I chose $gameChoice. $result")
}
