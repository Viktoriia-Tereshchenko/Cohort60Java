package hw_30.task2;

public abstract class OLD_ElectronicWallet implements PaymentSystem {

    private String title;
    private double balance;
    // BTC


    public OLD_ElectronicWallet(String title) {
        this.title = title;
    }

    @Override
    public void withdrawMoney(double amount) {

    }

    @Override
    public void depositTransfer(double amount) {
        if (amount < 0) return;

        balance += amount;
        System.out.printf("EWallet %s. Зачислено на счет %.2f BTC\n", title, amount);
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ElectronicWallet {" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                '}';
    }
}
