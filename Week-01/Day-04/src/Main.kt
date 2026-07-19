fun main(){

//====================  FizzBuzz Part  ==================================

    print("Enter a number: ")
    var num = readln().toIntOrNull()?:100
    if(num < 1){
        println("Invalid input! Running FizzBuzz with default value: 100 ")
        num = 100
    }
    for (i in 1..num) {
        println(fizzBuzz(i))
    }

//====================  Largest Number part  ============================
    val list1 = mutableListOf<Int>()
    println("Enter numbers of your list and type 'exit' when you done :")
    while (true) {
        val input = readln()
        if (input == "exit")
            break
        val number = input.toIntOrNull()
        if (number != null) {
            list1.add(number)
        } else {
            println("Invalid input! Please enter a valid integer or 'e' to finish.")
        }
    }

        if(findLargestNumber(list1) == null){
            println("You entered an empty list")
        }else {
            println("The List is $list1")
            println("The Largest number is ${findLargestNumber(list1)}")
        }
}


fun fizzBuzz(x: Int) : String {
   return when {
        x % 3 == 0 && x % 5 == 0 ->  "FizzBuzz"
        x % 3 == 0 ->  "Fizz"
        x % 5 == 0 ->  "Buzz"
        else ->  x.toString()
    }
}


fun findLargestNumber(list: List<Int>?) : Int?{
    if(list.isNullOrEmpty()) {
        return null
    }
    return list.max()
}
