
fun main(){
    print("Please enter your score: ")
    val score : Int = readln().toIntOrNull() ?: -1 //input Just Integers

    when(score){
        in 90..100 -> println("Your grade is A ")
        in 80..89 -> println("Your grade is B ")
        in 70..79 -> println("Your grade is C ")
        in 60..69 -> println("Your grade is D ")
        in 0..59 -> println("Your grade is F ")
        else -> println("Invalid input ")
    }
}