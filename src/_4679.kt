fun main() {

    val firstInput = readLine()!!.toInt()
    val secondInput = readLine()!!.toInt()
    val range = firstInput..secondInput
    for (currentNumber in range) {
        print("\n")
        if (currentNumber % 3 == 0 && currentNumber % 5 != 0) {
            print("Fizz")
        } else if (currentNumber % 5 == 0 && currentNumber % 3 != 0) {
            print("Buzz")
        } else if (currentNumber % 5 == 0 && currentNumber % 3 == 0) {
            print("FizzBuzz")
        } else {
            print(currentNumber)
        }
    }

}