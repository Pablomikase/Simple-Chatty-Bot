fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    val definedRange = 1..1000

    for (currentNumber in definedRange) {
        val y = currentNumber * currentNumber * currentNumber * a +
                currentNumber * currentNumber * b +
                currentNumber * c +
                d
        if (y == 0) {
            println(currentNumber)
        }
    }
}