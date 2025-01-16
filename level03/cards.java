
import java.util.Random;

public class cards {

    // Define the suits and ranks of a deck of cards
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Calculate the number of cards in the deck
    private static final int numOfCards = suits.length * ranks.length;

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        // Create an array to store the deck of cards
        String[] deck = new String[numOfCards];

        // Initialize the deck with suits and ranks
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Iterate over the deck and swap each card with a random card
        for (int i = 0; i < deck.length; i++) {
            // Generate a random card number between i and n
            int randomCardNumber = i + (int) (random.nextDouble() * (deck.length - i));

            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute the deck of n cards to x number of players
    public static String[][] distributeDeck(String[] deck, int numPlayers) {
        // Check if the n cards can be distributed to x players
        if (deck.length % numPlayers != 0) {
            System.out.println("Cannot distribute the deck evenly among the players.");
            return null;
        }

        // Create a 2D array to store the players and their cards
        String[][] players = new String[numPlayers][deck.length / numPlayers];

        // Distribute the deck among the players
        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < deck.length / numPlayers; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayers(String[][] players) {
        // Print the players and their cards
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck of cards
        deck = shuffleDeck(deck);

        // Distribute the deck among 4 players
        String[][] players = distributeDeck(deck, 4);

        // Print the players and their cards
        printPlayers(players);
    }
}