fun main(){


//====================  FizzBuzz Part  ==================================

    print("Enter a number: ")
    val num = readln().toIntOrNull()?:100
    for(i in 1..num){
        println(fizzBuzz(i))
    }

//====================  Largest Number part  ============================

    val list : List<Int> = listOf(10,13,9,4,6,21,18,36,11,3)
    println("The List is $list")
    println("The Largest number is ${findLargestNumber1(list)}")

}
fun fizzBuzz(x: Int) : String {
    when {
        x % 3 == 0 && x % 5 == 0 -> return "FizzBuzz"
        x % 3 == 0 -> return "Fizz"
        x % 5 == 0 -> return "Buzz"
        else -> return x.toString()
    }
}
fun findLargestNumber1(list: List<Int>) : Int{
    var max = list[0]
    for (i in list){
        if (i > max ){
            max = i
        }
    }
    return max
}
fun findLargestNumber2(list: List<Int>) : Int{
    return list.max()
}
