package homework_30.paySystems;

public class BankAccount implements PaymentSystem{

    private final long accountNumber; // или лучше long
    private double balance;
    private final String currency;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.currency = "EUR";
    }

    // снятие со счета
    @Override
    public boolean withdrawMoney(double amount) {

        if (amount <= 0) {
            System.out.println("Введена некорректная сумма!");
            return false;
        }

        if (amount > balance) {
            System.out.println("На счету недостаточно средств!");
            return false;
        }

        System.out.printf("Со счета %d снята сумма %.2f %s\n", accountNumber, amount, currency);
        balance -= amount;
        return true;
    }

    // поступление денег на счет
    @Override
    public boolean depositTransfer(double amount) {

        if (amount <= 0) {
            System.out.println("Введена некорректная сумма!");
            return false;
        }

        System.out.printf("На счет %d поступила сумма %.2f %s\n", accountNumber, amount, currency);
        balance += amount;
        return true;
    }

    // остаток на счете
    @Override
    public double checkBalance() {
        System.out.printf("Сумма на счете %d: %.2f %s\n", accountNumber, balance, currency);
        return balance;
    }

    @Override
    public String toString() {
        return String.format("BankAccount{accountNumber=%d ; currency=%s}", accountNumber, currency);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }
}
