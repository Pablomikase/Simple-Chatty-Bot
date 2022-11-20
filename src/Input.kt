import java.lang.Math.*
import java.util.Scanner

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val firstPair = readLine()!!.toInt()
    val secondPair = readLine()!!.toInt()
    val thirdPair = readLine()!!.toInt()
    val fourthPair = readLine()!!.toInt()
    val fifthPair = readLine()!!.toInt()

    val firstRange = firstPair .. secondPair
    val secondRange = thirdPair .. fourthPair

    if (fifthPair in firstRange || fifthPair in secondRange){
        println(true)
    }else{
        println(false)
    }
}