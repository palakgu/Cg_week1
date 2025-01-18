public class NumberGuessingGame {
   
    private int min;
   
    private int max;
   
    private int attempts;

    
    public NumberGuessingGame(int min, int max) {
        this.min = min;
        this.max = max;
        
        this.attempts = 0;
    }

    
    public int generateGuess() {
        
        return (int) (Math.random() * (max - min + 1)) + min;
    }


    public String getUserFeedback(int guess) {
        System.out.println("Is your number " + guess + "? (h/l/c)");
       
        return System.console().readLine();
    }
    public void play() {
        int guess;
        String feedback; 
        do {
           
            guess = generateGuess();
           
            feedback = getUserFeedback(guess);
            
            attempts++;
           
            if (feedback.equals("h")) {
                
                max = guess - 1;
            } else if (feedback.equals("l")) {
               
                min = guess + 1;
            }
        } while (!feedback.equals("c")); // Continue until the correct guess
       
        System.out.println("Yay! I guessed your number in " + attempts + " attempts.");
    }

       public static void main(String[] args) {
                NumberGuessingGame game = new NumberGuessingGame(1, 100);
                game.play();
    }
}