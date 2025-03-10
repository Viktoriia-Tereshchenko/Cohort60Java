package homework_30.paySystems;

public interface PaymentSystem {

    boolean withdrawMoney(double amount);

    boolean depositTransfer(double amount);

    double checkBalance();

    // перевод средств на другой счет
    default boolean transferMoney(PaymentSystem sender, PaymentSystem receiver, double amount, double exchange) {

        if (sender == null) {
            System.out.println("Указан некорректный отправитель!");
            return false;
        }

        if (receiver == null) {
            System.out.println("Указан некорректный получатель!");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Введена некорректная сумма!");
            return false;
        }

        // по-умолчанию 1,если перевод в одной валюте
        if (exchange <= 0) {
            System.out.println("Неправильный курс валют!");
            return false;
        }

        // выполнение перевода
        if (!sender.withdrawMoney(amount)) {
            System.out.println("Ошибка снятия средств!");
            return false;
        }

        if (!receiver.depositTransfer(amount * exchange)) {
            System.out.println("Ошибка зачисления средств!");
            // возврат средств отправителю
            sender.depositTransfer(amount * 1);
            return false;
        }

        System.out.printf("Перевод средств выполнен: отправитель (%s), получатель (%s), сумма %.2f\n",
                sender.toString(), receiver.toString(), amount);
        return true;
    }

}
