package hw.hw_30.task2;

public abstract class Account implements PaymentSystem {

    private String title;
    private double balance;

    protected String currency;
    protected String typeAccount;


    public Account(String title) {
        this.title = title;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.printf("Недостаточно денег на счету для снятия %.2f %s\n", amount, currency);
            return;
        }

        balance -= amount;
        System.out.printf("%s %s. Снято со счета %.2f Euro\n", typeAccount, title, amount);

    }

    @Override
    public void depositTransfer(double amount) {
        if (amount <= 0) return;

        balance += amount;
        System.out.printf("%s %s. Зачислено на счет %.2f %s\n",typeAccount, title, amount, currency);

    }

    @Override
    public double checkBalance() {
        return balance;
    }


//    @Override
//    abstract public double getCourseToEur();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s %s. Balance: %.2f %s",
                typeAccount, getTitle(), checkBalance(), currency
        );
    }

    @Override
    public String getCurrency() {
        return currency;
    }
}
