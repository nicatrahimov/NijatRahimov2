package az.codersazerbaijan.prac15iyul;

public class Test {
    public static void main(String[] args) {
        Card card1 = new Card("1",1500.00);


        Thread thread1 = new Thread(() -> {
            BankAccount.moneyWithdraw(200.0,card1);
        });

        Thread thread2 = new Thread(() -> {
            BankAccount.moneyWithdraw(200.0,card1);
        });

        Thread thread3 = new Thread(() -> {
            BankAccount.moneyInvest(200.0,card1);
        });
        thread1.start();
        thread2.start();
        thread3.start();

//       Runnable task1 = ()-> BankAccount.moneyInvest(1.0,card1);
//       Runnable task2 = ()-> BankAccount.moneyInvest(1.0,card1);
//       Runnable task3 = ()-> BankAccount.moneyInvest(1.0,card1);
//       Runnable task4 = ()-> BankAccount.moneyWithdraw(200.0,card1);
//       task1.run();
//       task2.run();
//       task3.run();
//       task4.run();



    }
}
