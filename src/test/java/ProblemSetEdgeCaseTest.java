import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
//import java.util.*;

public class ProblemSetEdgeCaseTest {

    @Test
    public void testCardEqualsNullAndDifferentType() {
        Card card = new Card("Ace", "Spades", 1);
        assertNotEquals(null, card); // Should not equal null
        assertNotEquals("NotACard", card); // Should not equal a different type
    }

    @Test
    public void testDeckWithNullArray() {
        Deck deck = new Deck((Card[]) null);
        assertEquals(0, deck.size());
    }

    @Test
    public void testDeckWithSomeNullCards() {
        Card[] cards = { new Card("2", "Hearts", 2), null, new Card("3", "Spades", 3) };
        Deck deck = new Deck(cards);
        assertEquals(2, deck.size());
    }

    @Test
    public void testDrawFromEmptyDeck() {
        Deck deck = new Deck(new Card[0]);
        assertNull(deck.draw());
    }

  

    @Test
    public void testDuplicateCardsInDeck() {
        Card card = new Card("King", "Spades", 13);
        Deck deck = new Deck(new Card[]{card, card});
        assertEquals(2, deck.size());
        assertNotNull(deck.draw());
        assertNotNull(deck.draw());
        assertNull(deck.draw());
    }
}
