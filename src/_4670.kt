fun main(){

    val firstPair = readLine()!!.toInt()
    if (firstPair !in 1 .. 10){
        println(true)
    }else{
        println(false)
    }

}