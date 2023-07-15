package az.codersazerbaijan.prac14iyul;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestCard {

    public static void main(String[] args) {

        List<Card>cards = new ArrayList<>();
            Card card1 = new Card("Nicat","1",100, LocalDate.of(2002,12,13));
            Card card2 = new Card("Fariz","2",100, LocalDate.of(2023,1,9));
            Card card3 = new Card("Murad","1",100, LocalDate.of(2000,12,23));
            Card card4 = new Card("Kamran","1",100, LocalDate.of(2012,3,6));
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);

       List<Card> list =  cards.stream().peek(c-> {Thread thread = new Thread(c);
           thread.start();
       }).toList();
        for (Card card:
             list) {
            System.out.println(card.getBalance());
        }

cards.stream().forEach(c-> System.out.println(c.getHolderName()+" "+c.getBalance()));
    }
}
