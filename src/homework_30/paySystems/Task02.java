package homework_30.paySystems;

/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.

Опционально
Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */

public class Task02 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(6565424232324354545L);
        account.depositTransfer(500);
        account.depositTransfer(0);

        account.checkBalance();
        System.out.println("\n====================");

        account.withdrawMoney(700);
        account.withdrawMoney(-100);
        account.withdrawMoney(150);
        account.checkBalance();

        System.out.println("\n====================");

        BankAccount bank1 = new BankAccount(33333);
        BankAccount bank2 = new BankAccount(55555);

        bank1.depositTransfer(700);
        bank1.transferMoney(bank1, bank2, 100, 1);
        System.out.println("\n----------------------");
        bank1.checkBalance();
        bank2.checkBalance();

        ElectronicWallet wallet1 = new ElectronicWallet(123456);
        ElectronicWallet wallet2 = new ElectronicWallet(789456);

        wallet1.depositTransfer(70);
        //System.out.println(wallet1.toString());
        wallet2.depositTransfer(15);
        wallet2.withdrawMoney(5);
        System.out.println("\n----------------------");
        wallet1.transferMoney(wallet1, wallet2, 30, 1);
        wallet1.checkBalance();
        wallet2.checkBalance();


        System.out.println("\n====================");
        bank1.checkBalance();
        wallet1.checkBalance();
        bank1.transferMoney(bank1, wallet1, 15, 1.5);
        bank1.checkBalance();
        wallet1.checkBalance();
    }
}
