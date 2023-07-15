package az.codersazerbaijan.prac14iyul;

import java.time.LocalDate;

public class Card implements Runnable {
   private String holderName;
   private String cardNumber;
   private int balance;
   private LocalDate expDate;

    public Card(String holderName,String  cardNumber, int balance, LocalDate expDate) {

        if (cardNumber.length()!=1){
            throw new RuntimeException("Duzgun daxil edin");
        }else this.cardNumber = cardNumber;

        if (balance>0) this.balance = balance;

        this.expDate = expDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }


    @Override
    public void run() {
   this.balance+= 1;
    }
}
