public class testDeck
{
    public static void main(String[] args){
        for(int j = 0; j < 100; j++){ 
            Deck deck = new Deck();
        // System.out.println(deck);
        // deck.shuffle();
        // System.out.println(deck);
        
        // for(int i = 0; i < 4; i++){
            // for(int j = 0; j < 13; j++){
                // System.out.print(deck.dealTopCard());
            // }
            // System.out.println(" " + deck);
        // }
        
        int rand = (int)(Math.random()*52);
        int location = (int)(Math.random()*52);
        Card randCard = deck.getCard(rand);
        int count = 0;                           
        for(int i = 0; i < 52000; i++){
            deck.shuffle();
            //System.out.println(deck);
                if(deck.getCard(location).equals(randCard)){
                    count++;}
        }
        System.out.println("Random Checking Card Location " + rand 
        + " Random Checking Card " + randCard +
        " Random Checking Location " + location + "count " + count);
        }
    }
}
