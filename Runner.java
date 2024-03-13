import java.util.*;
public class Runner
{
    public static void main(String[] args){
        // Card hello1 = new Card("2","clubs",2);
        // Card hello2 = new Card("2","hearts",2);
        // Card hello3 = new Card("2","spades",2);
        // Card hello4 = new Card("6","clubs",6);
        // Card hello5 = new Card("10","spades",10);
        // Card hello6 = new Card("10","spades",10);
        
        // System.out.println(hello1.compareTo(hello1));
        // System.out.println(hello1.compareTo(hello2));
        // System.out.println(hello1.compareTo(hello3));
        // System.out.println(hello1.compareTo(hello4));
        // System.out.println(hello1.compareTo(hello5));
        // System.out.println(hello1.compareTo(hello6));
        
        // System.out.println(hello5.equals(hello6));
        // System.out.println(hello5.equals(hello4));
        // System.out.println(hello5);
        
        // Deck deck = new Deck();
        // System.out.println(deck);
        // deck.shuffle();
        // System.out.println(deck);
        
        // for(int i = 0; i < 1000; i++){
            // Deck deck1 = new Deck();
            // System.out.println(deck1);
            // deck1.shuffle();
            // System.out.println(deck1);
        // }
        ArrayList<Card> hand = new ArrayList<Card>();
        ArrayList<Card> round = new ArrayList<Card>();
        
        ArrayList<Card> game = new ArrayList<Card>();
        
        hand.add(new Card("3","diamonds",3));
        hand.add(new Card("A","hearts",14));
        hand.add(new Card("6","spades",6));
        hand.add(new Card("7","spades",7));
        hand.add(new Card("2","clubs",2));
        hand.add(new Card("3","clubs",3));
        CardPlayer kara = new CardPlayer("Kara Jones",0,hand);
        System.out.println(kara);
        kara.playCard(5);
        kara.updateScore(27);
        System.out.println(kara);
        System.out.println(kara.chooseCard(round,game));
        System.out.println(kara);
        round.add(new Card("10","spades",10));
        System.out.println(kara.chooseCard(round,game));
        System.out.println(kara);
        round.set(0,new Card("9","clubs",9));
        System.out.println(kara.chooseCard(round,game));
        System.out.println(kara);
        round.remove(0);
        System.out.println(kara.chooseCard(round,game));
        System.out.println(kara);
        
        }
}
