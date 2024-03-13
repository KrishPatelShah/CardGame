import java.util.*;
public class CardPlayer extends Player
{
    private ArrayList<Card> hand = new ArrayList<Card>();
    private ArrayList<Card> takenCards;

    public CardPlayer(String name, int score, ArrayList<Card> hand)
    {
        super(name,score);
        this.hand = hand;
        takenCards = new ArrayList<Card>();
        
    }

    public ArrayList<Card> getHand()
    {
        return hand;
    }
    
    public void setHand(ArrayList<Card> hand)
    {
        this.hand = hand;
    }
    
    public void addCard(Card card){
        hand.add(card);
    }
    
    public Card playCard(int index){
        return hand.remove(index);
    }
    
    public Card chooseCard(ArrayList<Card> playedInRound, ArrayList<Card> playedInPrevious){
        Card played;
        if(hand.indexOf(new Card("2","clubs",2)) >= 0){
            played = hand.remove(hand.indexOf(new Card("2","clubs",2)));
        }
        else if(playedInPrevious.size() != 0 && playedInRound.size() == 0){
            played = hand.remove((int)(Math.random()*hand.size()));
        }
        else{
            ArrayList<Integer> sameSuitIndexes = new ArrayList<Integer>();
            ArrayList<Integer> heartIndexes = new ArrayList<Integer>();
            
            for(int i = 0; i < hand.size(); i++){
                if(playedInRound.size() > 0 && hand.get(i).getSuit().equals(playedInRound.get(0))){
                    sameSuitIndexes.add(i);
                }
                if(hand.get(i).getSuit().equals(Deck.SUITS[2])){ //"hearts"
                    heartIndexes.add(i);
                }
            }
            if(sameSuitIndexes.size()>0){
                played = hand.remove(sameSuitIndexes.get((int)(Math.random()*sameSuitIndexes.size())).intValue());
            }
            else if(heartIndexes.size()>0){
                played = hand.remove(heartIndexes.get((int)(Math.random()*heartIndexes.size())).intValue());
            }
            else{
                played = hand.remove((int)(Math.random()*hand.size()));
            }
        }
        return played;
    }
    
    public String toString(){
        Collections.sort(hand);
        return super.getName() + "(" + super.getScore() + ")" + hand.toString();
    }
}
