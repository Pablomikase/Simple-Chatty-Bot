fun main() {

    val firstNumner = readLine()!!.toInt()
    val secondNumner = readLine()!!.toInt()

    var result:Long = 1

    for (currentNumber in firstNumner until secondNumner){
        result *= currentNumber
    }
    println(result)




}