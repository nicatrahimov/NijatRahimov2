package az.codersazerbaijan.prac6iyun.Task1;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws CardNumberLengthMustBe16 {
        Optional<User> optional = Optional.of(new User());
        User u = new User();
        u.name = "Nicat";
        User u2 = new User();
        u2.name = "Murad";

        Card card1 = new Card();
        card1.setCardNumber("1234567890123456");
        Card card2 = new Card();
        card2.setCardNumber("0987654321098765");
        card1.expiredDate = LocalDate.of(2025, 3, 15);
        card2.expiredDate = LocalDate.of(2024, 5, 9);
        card1.balance=400;
        card2.balance=590;
        System.out.println(card1.balance);
        System.out.println(card2.balance);
        transferMoney(card1,card2,300);
        System.out.println(card1.balance);
        System.out.println(card2.balance);
    }

    public static void transferMoney(Card senderCard, Card receiverCard, Integer amount) {
        if (checkExpireDate(senderCard.expiredDate) && checkExpireDate((receiverCard.expiredDate))) {
            Optional<Integer> opt = Optional.ofNullable(senderCard.balance);
            Optional<Integer> opt1 = Optional.ofNullable(receiverCard.balance);
            if (opt.isPresent() && opt1.isPresent()) {
                senderCard.balance -= amount;
                receiverCard.balance += amount;
            }else throw new RuntimeException("Declare an object");
        }
    }
    public static boolean checkExpireDate(LocalDate localDate){
        if (localDate.getYear()>LocalDate.now().getYear()){
            return true;
        } else if (localDate.getYear()==LocalDate.now().getYear()) {
            if (localDate.getMonth().ordinal()>LocalDate.now().getMonth().ordinal()){
                return true;
            } else if (localDate.getMonth().ordinal()==LocalDate.now().getMonth().ordinal()) {
                if (localDate.getDayOfMonth()>LocalDate.now().getDayOfMonth()){
                    return true;
                }
            }else return false;
        }else return false;
        return false;
    }
}
