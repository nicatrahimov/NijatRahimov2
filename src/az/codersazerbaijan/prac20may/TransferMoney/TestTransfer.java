package az.codersazerbaijan.prac20may.TransferMoney;

public class TestTransfer {
     public static Card[]users=new Card[2];

    public static void main(String[] args) {
        users[0] = new Card("1234567890123456",100);
        users[1] = new Card("0987654321098765",15);

        for (int i = 0; i < 2; i++) {
            System.out.println(users[i].toString());
        }

        Card.transfer("1234567890123456",15,"0987654321098765");

        for (int i = 0; i < 2; i++) {
            System.out.println(users[i].toString());
        }

    }
}
