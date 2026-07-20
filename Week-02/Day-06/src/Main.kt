
data class Transaction(
    val accountNumber : Int,
    val transactionType : String,
    val amount : Double
)
class BankAccount(
    val accountNumber : Int,
    var balance : Double,
) {
    val transactions = mutableListOf<Transaction>()

    fun deposit(amount : Double) {
        balance += amount
        this.transactions.add(Transaction(accountNumber,"deposit", amount))
    }
    fun withdraw(amount : Double) {
        if (balance >= amount) {
            balance -= amount
            this.transactions.add(Transaction(accountNumber,"withdraw", amount))
        }else{
            println("Sorry your account balance is $balance")
        }
    }
    fun print() {
        println(" Account Number: $accountNumber,\n balance: $balance ,\n transactions: $transactions")
    }
}

fun main(){

    val account1 = BankAccount(1,500.0)

    account1.deposit(500.0)
    account1.withdraw(200.0)
    account1.print()


}

