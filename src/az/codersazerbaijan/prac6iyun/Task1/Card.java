package az.codersazerbaijan.prac6iyun.Task1;

import java.time.LocalDate;

public class Card {
    User u;
    private String cardNumber;
    Integer balance;
    LocalDate expiredDate;


    public void setU(User u) {
        this.u = u;
    }

    public void setCardNumber(String cardNumber) throws CardNumberLengthMustBe16 {
        if (cardNumber.length()==16){
            this.cardNumber=cardNumber;
        }else throw new CardNumberLengthMustBe16();
    }
    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }
}
