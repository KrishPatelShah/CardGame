public class Card implements Comparable<Object>
{
    private String name;
    private String suit;
    private int rank;

   
    public Card()
    {
        name = "default";
        suit = "default";
        rank = 0;
    }
    
    public Card(String name, String suit, int rank)
    {
        this.name = name;
        this.suit = suit;
        this.rank = rank;
    }
     
    public String getName(){
        return name;
    }
    
    public String getSuit(){
        return suit;
    }
    
    public int getRank(){
        return rank;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSuit(String suit){
        this.suit = suit;
    }
    
    public void setRank(int rank){
        this.rank = rank;
    }
    
    public boolean equals(Object obj){
        Card second = (Card) obj;
        if(getName().equals(second.getName()) 
        && getSuit().equals(second.getSuit()) && getRank() == second.getRank())
            return true;
        return false;
    }
    
    public int compareTo(Object obj){
        Card second = (Card) obj;
        String ranking = "diamonds" + "hearts" + "spades" + "clubs";
        if(ranking.indexOf(getSuit()) > ranking.indexOf(second.getSuit()))
            return 1;
        else if(ranking.indexOf(getSuit()) < ranking.indexOf(second.getSuit()))
            return -1;
        else{
        if(getRank() > second.getRank())
            return 1;
        else if(getRank() < second.getRank())
            return -1;}
        return 0;
    }
    
    public String toString(){
        return suit.substring(0,1) + name + "(" + rank + ")";
    }
}
