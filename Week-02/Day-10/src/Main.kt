// Extensions on String
fun String.removeSpaces(): String {
    return this.replace(" ", "")
}


// Generic Result<T>
sealed class Result<out     T> {
    data class Success<T>(val value: T) : Result<T>()
    data class Error(val message: String) : Result<Nothing>()
}


// Custom Exception
class InvalidAgeException(message: String) : Exception(message)

fun checkAge(age: Int): String {
    return try {
        if (age < 18) {
            throw InvalidAgeException("Exception :  Age must be between 0 and 18")
        }
        "age is $age"
    }catch (e: InvalidAgeException) {
        e.message.toString()
    }
}

fun main() {
    val name = "Kareem Ehab"
    println(name + " ----> " + name.removeSpaces())

    println("=========================================")

    val result1 = Result.Success(5)
    val result2 = Result.Error("Error Message")
    println(result1.value)
    println(result2.message)

    println("=========================================")

    println(checkAge(20))
    println(checkAge(10))

}
