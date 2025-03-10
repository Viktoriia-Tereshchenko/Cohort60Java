package homework_30.paySystems;

public class ElectronicWallet implements PaymentSystem{

    private final int walletNumber;
    private String email;
    private double balance;
    private final String currency;

    public ElectronicWallet(int walletNumber) {
        this.walletNumber = walletNumber;
        this.currency = "USD";
    }

    public ElectronicWallet(int walletNumber, String email, String currency) {
        this.walletNumber = walletNumber;
        this.email = email;
        this.currency = currency;
    }

    @Override
    public boolean withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Введена некорректная сумма!");
            return false;
        }

        if (amount > balance) {
            System.out.println("В кошельке недостаточно средств!");
            return false;
        }

        System.out.printf("Из кошелька %d выведена сумма %.2f %s\n", walletNumber, amount, currency);
        balance -= amount;
        return true;
    }


    @Override
    public boolean depositTransfer(double amount) {
        if (amount <= 0) {
            System.out.println("Введена некорректная сумма!");
            return false;
        }

        System.out.printf("В кошелек %d поступила сумма %.2f %s\n", walletNumber, amount, currency);
        balance += amount;
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.printf("Сумма в кошельке %d: %.2f %s\n", walletNumber, balance, currency);
        return balance;
    }

    @Override
    public String toString() {
        return String.format("ElectronicWallet{{walletNumber=%d ; currency=%s}", walletNumber, currency);
    }


    public int getWalletNumber() {
        return walletNumber;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }
}
