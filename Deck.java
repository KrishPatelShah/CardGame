import java.util.*;
public class Deck
{
    private ArrayList<Card> deck;
    public static final String[] NAMES = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
    public static final String[] SUITS = {"clubs", "spades", "hearts", "diamonds"};
    public static final int[] RANKS = {2,3,4,5,6,7,8,9,10,11,12,13,14}; 

    public Deck()
    {
        deck = new ArrayList<Card>();
        initializeDeck();
    }
 
    public ArrayList<Card> getDeck()
    {
        return deck;
    }
    
    public void setDeck(ArrayList<Card> tempDeck)
    {
        deck = tempDeck;
    }
    
    public void initializeDeck(){
        //deck = new ArrayList<Card>();
        for(int i = 0; i < SUITS.length; i++){
            for(int j = 0; j < NAMES.length; j++){
                deck.add(new Card(NAMES[j],SUITS[i],RANKS[j]));
            }
        }
    }
    
    public Card getCard(int idx){
        //System.out.println(deck);
        return deck.get(idx);
    }
    
    public Card dealTopCard(){
        return deck.remove(0);
    }
    
    public void completeShuffle(){
        ArrayList<Card> tempDeck = new ArrayList<Card>();
        int size = deck.size();
        for(int i = 0; i < size; i++){
            tempDeck.add(deck.remove((int)(Math.random() * deck.size())));
        }
        deck = tempDeck;
    }
    
    public void shuffle(){
        int numOfCards = (int)(Math.random() * 9) + 2;
        int insertionIndex = (int)(Math.random() * (51 - numOfCards+1)+1);  
        ArrayList<Card> tempDeck = new ArrayList<Card>();
        for(int i = 0; i < numOfCards; i++){
            tempDeck.add(deck.remove(0));
        }
        //System.out.println(tempDeck);
        for(int i = 0; i < numOfCards; i++){
            deck.add(insertionIndex+i,tempDeck.get(i));
        }
    }
    
    public String toString(){
        if(deck.size() <= 0 || deck == null){
            return "No cards in the deck";
        }
        String temp = "";
        for(int i = 0; i<deck.size(); i++){
            temp+=deck.get(i).toString() + " ";
        }
        return temp;
    
    }
}
