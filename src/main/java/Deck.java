//Deck Class 
// Mayurun
//Mr.Kalishz 
import java.util.*;
class Deck {
    private List<Card> cards;

    // Constructor with array of cards
    public Deck(Card[] cardsArray) {
        this.cards = new ArrayList<>();
        if (cardsArray != null) {
      for (Card card : cardsArray) {
    if (card != null) this.cards.add(card);
    
}
    }
    }

    // Default constructor 13x4=52 (no joker)
    public Deck() {
        this.cards = new ArrayList<>();
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {                     //enhanced for loop
            for (int i = 0; i < names.length; i++) {
                cards.add(new Card(names[i], suit, i + 1));
    }
    }
    }

    public int size() {
        return cards.size();
    }

    public Card draw() {
        if (cards.isEmpty()) return null;
        return cards.remove( cards.size()- 1 );

    }

    
    public void suffle() {
        Random rand = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);                //suffle using fisher gates stytle
            //swaps cards
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public void addCard(Card card) {
        if (card != null) {
            cards.add(card);
        }
    }

    public void reshuffle(Card[] newCards) {
        if (newCards != null) {
     for (Card card : newCards) {
           if (card != null) cards.add(card);
            }
            suffle(); 
        }
    }
}