class BankAccount(var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount <= balance){
            balance -= amount
        } else {
            println("try again!")
        }
    }

}