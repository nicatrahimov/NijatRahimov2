package az.codersazerbaijan.prac15iyul;

public class BankHesabi {
    private double hesapBakiyesi;

    public BankHesabi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public synchronized void paraCek(double amount) {
        if (amount <= hesapBakiyesi) {
            hesapBakiyesi -= amount;
            System.out.println(Thread.currentThread().getName() + " tarafından " + amount + " TL çekildi. Yeni bakiye: " + hesapBakiyesi);
        } else {
            System.out.println(Thread.currentThread().getName() + " tarafından " + amount + " TL çekme işlemi reddedildi. Yetersiz bakiye: " + hesapBakiyesi);
        }
    }

    public synchronized void paraYatir(double miktar) {
        hesapBakiyesi += miktar;
        System.out.println(Thread.currentThread().getName() + " tarafından " + miktar + " TL yatırıldı. Yeni bakiye: " + hesapBakiyesi);
    }

    public static void main(String[] args) {
        BankHesabi bankaHesabi = new BankHesabi(1000);

        Thread thread1 = new Thread(() -> {
            bankaHesabi.paraCek(500);
        });

        Thread thread2 = new Thread(() -> {
            bankaHesabi.paraCek(750);
        });

        Thread thread3 = new Thread(() -> {
            bankaHesabi.paraYatir(300);
        });

        thread1.start();
        thread2.start();
        thread3.start();
}
}