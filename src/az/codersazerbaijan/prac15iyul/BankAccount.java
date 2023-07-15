package az.codersazerbaijan.prac15iyul;

public class BankAccount  {
synchronized public static void moneyWithdraw(Double amount,Card card){
card.balance-=amount;
      System.out.println(card.balance);
    }
synchronized public static void moneyInvest(Double amount,Card card){
        card.balance+=amount;
     System.out.println(card.balance);
    }
}
