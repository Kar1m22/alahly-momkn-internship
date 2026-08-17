fun main(){
    val n = readln().toInt()
    var counter = 0
    for (i in 1..n) {
        val views = readln().split(" ").map { it.toInt() }
        if (views.sum() >= 2) {
            counter++
        }
    }
    println(counter)    
}