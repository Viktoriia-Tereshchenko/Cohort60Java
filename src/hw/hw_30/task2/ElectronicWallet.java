package hw.hw_30.task2;

public class ElectronicWallet extends BankAccount {

    public ElectronicWallet(String title) {
        super(title);
        currency = "BTC";
        typeAccount = "CryptoWallet";
    }

    @Override
    public double getCourseToEur() {
        // Какой-то сложный механизм, получает текущий курс с сервера банка
        // или с биржи
        return 80_000;
    }


}
