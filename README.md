# CardGame
A card game implementation in Java to practice inheritance

## Classes

### Card
Represents a playing card with the following methods and variables:
- `name`: The name of the card (e.g., "Ace", "King").
- `suit`: The suit of the card (e.g., "hearts", "diamonds").
- `rank`: The rank of the card (e.g., 2, 3, ..., 14).
- `getName()`, `getSuit()`, `getRank()`: Getters for the card attributes.
- `setName(String name)`, `setSuit(String suit)`, `setRank(int rank)`: Setters for the card attributes.
- `equals(Object obj)`: Checks if two cards are equal.
- `compareTo(Object obj)`: Compares two cards.
- `toString()`: Returns a string representation of the card.

### CardPlayer
Extends the `Player` class and represents a player in the card game with the following methods and variables:
- `hand`: The cards currently held by the player.
- `takenCards`: Cards taken by the player during the game.
- `getHand()`: Returns the player's hand.
- `setHand(ArrayList<Card> hand)`: Sets the player's hand.
- `getTakenCards()`, `setTakenCards(ArrayList<Card> takenCards)`: Getters and setters for taken cards.
- `addCard(Card card)`: Adds a card to the player's hand.
- `playCard(int index)`: Plays a card from the player's hand.

### Deck
Manages a deck of cards with the following methods and variables:
- `deck`: The list of cards in the deck.
- `initializeDeck()`: Initializes the deck with a standard set of 52 cards.
- `getDeck()`: Returns the deck.
- `setDeck(ArrayList<Card> tempDeck)`: Sets the deck.
- `getCard(int idx)`: Gets a card from the deck by index.
- `dealTopCard()`: Deals the top card from the deck.
- `completeShuffle()`: Shuffles the entire deck.
- `shuffle()`: Performs a partial shuffle.
- `toString()`: Returns a string representation of the deck.

### Player
Represents a generic player with the following methods and variables:
- `name`: The name of the player.
- `score`: The player's score.
- `getName()`, `getScore()`: Getters for player attributes.
- `setName(String name)`, `setScore(int score)`: Setters for player attributes.
- `toString()`: Returns a string representation of the player.

### Runner
Contains the `main` method to run the card game. (Refer to the example usage below)

### testDeck
A test class to check the functionality of the `Deck` class.

## Usage

1. **Initialize Deck**:
    ```java
    Deck deck = new Deck();
    deck.initializeDeck();
    ```

2. **Shuffle Deck**:
    ```java
    deck.completeShuffle();
    ```

3. **Deal a Card**:
    ```java
    Card card = deck.dealTopCard();
    ```

4. **Create a Player**:
    ```java
    ArrayList<Card> hand = new ArrayList<>();
    CardPlayer player = new CardPlayer("PlayerName", 0, hand);
    ```

## Example

Example of creating a deck, shuffling it, and dealing a card to a player:

```java
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.initializeDeck();
        deck.completeShuffle();
        
        ArrayList<Card> hand = new ArrayList<>();
        CardPlayer player = new CardPlayer("Alice", 0, hand);
        
        Card dealtCard = deck.dealTopCard();
        player.addCard(dealtCard);
        
        System.out.println("Dealt card: " + dealtCard);
        System.out.println("Player's hand: " + player.getHand());
    }
}
