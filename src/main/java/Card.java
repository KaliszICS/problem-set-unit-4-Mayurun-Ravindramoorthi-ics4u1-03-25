import java.util.*;
//Mayurun
//Mr.Kalishz 
//Card Class 

public class Card {
public final String name; 

private final String suit; 

public final int value;    

    public Card(String name, String suit, int value) {
    this.name = name;

    this.suit = suit;
    this.value = value;
    }

    public String getName() 
    {

     return this.name;
    }

    public String getSuit() 
    {
    return this.suit;
    }

    public int getValue() {
     return this.value;
    }

    public String toString() {

    return (this.name + " of " + this.suit);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Card) {
         
            Card other = (Card) obj;
         
     return (this.name.equals(other.name) && this.suit.equals(other.suit) && this.value == other.value);
        }
    return false;
}
}


