package cardObjects;

public class Card {
    private int rank;
    private int suit;

    public Card (int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        return ranks[this.rank] + " of " + suits[this.suit];
    }
}
