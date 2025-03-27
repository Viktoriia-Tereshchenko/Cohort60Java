package hw.hw_30.task2;

/*
Task 2 Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).

Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте

Убедитесь, что каждый класс корректно выполняет каждую из операций.

 */

public class BankApp {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount("AlphaBank");

        System.out.println(bank);

        bank.withdrawMoney(500);

        bank.depositTransfer(10000);
        System.out.println(bank);

        System.out.println("\n ================");

        ElectronicWallet wallet = new ElectronicWallet("Binance");

        System.out.println(wallet);

        wallet.withdrawMoney(100);

        wallet.depositTransfer(0.1);
        System.out.println(wallet);
        wallet.depositTransfer(0.2);
        System.out.println(wallet);

        System.out.println("\n ===============");

        BankAccount bank2 = new BankAccount("EuroBank");

        bank.transferMoney(5000, bank2);

        System.out.println("\n============");

        bank2.transferMoney(4500, wallet);


    }
}

















