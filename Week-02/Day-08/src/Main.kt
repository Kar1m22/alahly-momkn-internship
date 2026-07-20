
sealed class PaymentResult{
    data class Success(val amount: Double): PaymentResult()
    data class Failure(val errorMessage: String): PaymentResult()
    object Pending: PaymentResult()
}
fun checkPaymentResult(paymentResult: PaymentResult) {
     val msg = when (paymentResult) {
         is PaymentResult.Success -> ("Successful payment, Total : ${paymentResult.amount}$")
         is PaymentResult.Failure -> ("Failed payment, error : ${paymentResult.errorMessage}")
         PaymentResult.Pending -> ("Pending transaction ")
     }
    println(msg)
}
enum class PaymentMethod(val displayName: String, val requiresInternet: Boolean) {
    CASH("Cash", false),
    CARD("Card", true),
    WALLET("Wallet", true),
    BANK_TRANSFER("Bank Transfer", true)
}

// EL function Useless Bs 34an el Task requires using when to Display info
fun paymentMethodInfo(paymentMethod: PaymentMethod): String {
    return when (paymentMethod) {
        PaymentMethod.CASH -> "Payment Name : ${paymentMethod.displayName}, Need Internet : ${paymentMethod.requiresInternet}"
        PaymentMethod.CARD -> "Payment Name : ${paymentMethod.displayName}, Need Internet : ${paymentMethod.requiresInternet}"
        PaymentMethod.WALLET -> "Payment Name : ${paymentMethod.displayName}, Need Internet : ${paymentMethod.requiresInternet}"
        PaymentMethod.BANK_TRANSFER -> "Bank Payment Name : ${paymentMethod.displayName}, Need Internet : ${paymentMethod.requiresInternet}"
    }
}
fun main(){

    println("--- Testing Payment Results (Sealed Class) ---")
    val payment = PaymentResult.Success(500.0)
    checkPaymentResult(payment)
    val payment2 = PaymentResult.Failure("your balance is not enough for this operation")
    checkPaymentResult(payment2)

    println("\n--- Testing Payment Methods (Enum Class) ---")
    val method1 = PaymentMethod.CASH
    println(paymentMethodInfo(method1))
    val method2 = PaymentMethod.CARD
    println(paymentMethodInfo(method2))
}