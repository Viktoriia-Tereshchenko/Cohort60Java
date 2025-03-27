package hw.hw_30.task2;

public class BankAccount extends Account{


    public BankAccount(String title) {
        super(title);
        currency = "EUR";
        typeAccount = "Bank";
    }

    // Вывод денег - сумма которую переводим - всегда в валюте нашего
    // Проверяем валюту счета получателя. Высчитываем курс пересчета
    // отправляем получателю сумму к валюте счета получателя.
    @Override
    public void transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > checkBalance()) {
            System.out.printf("Недостаточно средств! Transfer %.2f | balance: %.2f\n", amountEur, checkBalance());
            return;
        }

        if (recipient.getCurrency().equals("EUR")) {
            // перевод на евровый счет (конвертация не нужна)
            withdrawMoney(amountEur);
            recipient.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR завершен \n",
                    getTitle(), recipient.getTitle(), amountEur);
            return; // true
        }

        if (recipient.getCurrency().equals("BTC")) {
            // Конвертировать EUR в BTC

            double amountBtc = amountEur / recipient.getCourseToEur();

            withdrawMoney(amountEur);
            recipient.depositTransfer(amountBtc);

            System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR -> %.5f %s завершен \n",
                    getTitle(), recipient.getTitle(), amountEur, amountBtc, recipient.getCurrency());
            return; // true
        }

        // return false;

    }

    @Override
    public double getCourseToEur() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("%s %s. Balance: %.2f %s",
                typeAccount, getTitle(), checkBalance(), currency
                );
    }
}
