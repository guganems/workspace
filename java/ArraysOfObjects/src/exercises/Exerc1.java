package exercises;

import cardObjects.Card;

public class Exerc1 {
    public static Card[] makeDeck() {
        Card[] cards = new Card[52];

        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
//                System.out.println(index);
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        return cards;
    }
}
