package az.codersazerbaijan.prac20may.TransferMoney;

import az.codersazerbaijan.prac20may.TransferMoney.Exceptions.AmountCannotLessThanZero;
import az.codersazerbaijan.prac20may.TransferMoney.Exceptions.CardNumberMustBe16Char;
import az.codersazerbaijan.prac20may.TransferMoney.Exceptions.InsufficientBalance;
import az.codersazerbaijan.prac20may.TransferMoney.Exceptions.WrongCardNumber;

import static az.codersazerbaijan.prac20may.TransferMoney.TestTransfer.users;

public class Card {
    final String cardNum;
    double balance;


    public Card(String cardNum, double balance) {
        if (cardNum.length() == 16) {
            this.cardNum = cardNum;
        } else throw new WrongCardNumber();
        if (balance < 0) {
            throw new AmountCannotLessThanZero();
        } else this.balance = balance;
    }

    public static void transfer(String senderCardNum, double amount, String receiverCardNum) {
        Card receiver = null;
        Card sender=null;
        if (amount < 0) {
            throw new AmountCannotLessThanZero();
        } else {
            if (senderCardNum.length() == 16 && receiverCardNum.length() == 16) {
                for (int i = 0; i < 2; i++) {
                    if (senderCardNum == receiverCardNum) {
                        throw new RuntimeException("Cannot transfer money with same card");
                    } else if (users[i].cardNum == senderCardNum) {
                         sender = users[i];
                        if (users[i].balance < 2) {
                            throw new InsufficientBalance();
                        }
                        }else if (users[i].cardNum == receiverCardNum) {
                        receiver = users[i];
                    }
                }
            } else throw new CardNumberMustBe16Char();
        }
        sender.balance-=(amount+1);
        receiver.balance+=amount;


    }

    @Override
    public String toString() {
        return "Card{" + "cardNum='" + cardNum + '\'' + ", balance=" + balance + '}';
    }
}
