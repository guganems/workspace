package binarySearch;

import cardObjects.Card;

public class Search {
    public static void main(String[] args) {
        Card[] cards = new Card[52];

        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
//                System.out.println(index);
                cards[index] = new Card(rank, suit);
                index++;
            }
        }

        Card card = new Card(11, 0);
        System.out.println(binarySearch(cards, card));
    }
    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length-1;
        while (low <= high) {
            System.out.println(low + ", " + high);
            int mid = (low + high) / 2;
            int comp = cards[mid].compareTo(target);

            if (comp == 0) {
                return mid;
            } else if (comp < 0) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return 0;
    }
}
