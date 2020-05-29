package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 *
 * @author Romeo Al Bishara created on May 28, 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        Random random = new Random();             // creats a random object
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            c.setValue(random.nextInt(13) + 1);      // sets the value to random int 1-13
            c.setSuit(Card.SUITS[random.nextInt(4)]);// sets the suit to randomly 
            
            magicHand[i] = c; // add the object to the array
            
            /* to print the magic hand for testing
            System.out.println(c.getValue() + " " + c.getSuit());
           */
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[3]);
       
        boolean isMagic = false; // boolean check control
        for (Card card : magicHand) {  // loop to find the matching card
            if (luckyCard.getSuit().equals(card.getSuit()) && luckyCard.getValue() == card.getValue()) {
                isMagic = true;
                break;
            }
            isMagic = false; // false if can't find the card
        }
        
        String checkCard = isMagic ? "You are a *** WINNER! ***" : "Not a winnig card, try again!";
        System.out.println(checkCard);

    }

}
