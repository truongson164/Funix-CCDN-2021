import java.util.Scanner;

public class LuckyNumber {

//    Check number you guess
    public static void checkAction(int gNumber, int lNumber, int g) {
            if (gNumber < lNumber) {
                System.out.println("It's lower");
            } else if (gNumber > lNumber) {
                System.out.println("It's higher");
            } else {
                System.out.println("You got it right in " + g +" guesses");
            }
    }

//    Total result
    public static void printResult(int totalGames, int totalGuesses, int bestGame) {
        float guessesPerGame = (float)totalGuesses / totalGames;
        System.out.println("Overall result:\n" +
                "Total games    = " + totalGames + "\n" +
                "Total guesses  = " + totalGuesses + "\n" +
                "Guesses/Game   = " + guessesPerGame + "\n" +
                "Best game      = " + bestGame);
    }
//     Main games
    public static void main(String[] args) {
        int totalGames = 0;
        int totalGuesses = 0;
        int bestGame = 0;
        String s1 = "yes";

        while (s1.equalsIgnoreCase("yes") || s1.equalsIgnoreCase("Y") ) {

//                    Khai bao bien

            Scanner sc = new Scanner(System.in);
            int guesses = 0;
            boolean finish = false;
            int guessNumber = 0;

//            Choose maximum number and guess until you finish
            while (!finish) {
                System.out.print("Choose maximum number: ");
                int max = sc.nextInt();
                int luckyNumber = (int)(Math.random() * (max -1)) + 1;


                while (guessNumber != luckyNumber) {
                    System.out.print("Your guess: ");
                    guessNumber =  sc.nextInt();
                    guesses++;

                    totalGuesses++;
                    checkAction(guessNumber, luckyNumber, guesses);
                }

                finish = true;
                totalGames++;
            }
            if (totalGames < 2) {
                bestGame = guesses;
            }
            if (guesses < bestGame)
            bestGame = guesses;

//            Play again or not
            System.out.print("Do you want to play again?");
            s1 = sc.next();
        }
        printResult(totalGames, totalGuesses, bestGame);
    }
}
