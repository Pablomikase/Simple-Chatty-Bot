@OptIn(ExperimentalUnsignedTypes::class)
fun main() {

    var inputSum = 0
    var userInput: Int = 0

    do {
        userInput = readLine()!!.toInt()
        inputSum += userInput
    }while (userInput >= 1)

    println(inputSum)

}