import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        String redoGame;
        String playerOne;
        String playerTwo;
        String rock = "r";
        String paper = "p";
        String scissors = "s";
        boolean validValue = false;

        do {
            do { //Player A input
                System.out.println("Player 1 please enter your move (R, P, S):");
                playerOne = scan.nextLine();
                if (playerOne.equalsIgnoreCase("R") || playerOne.equalsIgnoreCase("P") || playerOne.equalsIgnoreCase("S")) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again. \n"); //I like to make a new line after errors to improve readability
                }
            } while (!validValue);
            validValue = false; //resetting to be reused

            do { //Player B input
                System.out.println("Player 2 please enter your move (R, P, S):");
                playerTwo = scan.nextLine();
                if (playerTwo.equalsIgnoreCase("R") || playerTwo.equalsIgnoreCase("P") || playerTwo.equalsIgnoreCase("S")) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again. \n"); //I like to make a new line after errors to improve readability
                }
            } while (!validValue);
            validValue = false; //resetting to be reused

            //determines the winner
            if (playerOne.equalsIgnoreCase(rock) && playerTwo.equalsIgnoreCase(rock)) {
                System.out.println("It's a tie!");
            } else if (playerOne.equalsIgnoreCase(rock) && playerTwo.equalsIgnoreCase(paper)) {
                System.out.println("Paper covers Rock, Player 2 wins!");
            } else if (playerOne.equalsIgnoreCase(rock) && playerTwo.equalsIgnoreCase(scissors)) {
                System.out.println("Rock breaks Scissors, Player 1 wins!");
            } else if (playerOne.equalsIgnoreCase(paper) && playerTwo.equalsIgnoreCase(rock)) {
                System.out.println("Paper covers Rock, Player 1 wins!");
            } else if (playerOne.equalsIgnoreCase(paper) && playerTwo.equalsIgnoreCase(paper)) {
                System.out.println("It's a tie!");
            } else if (playerOne.equalsIgnoreCase(paper) && playerTwo.equalsIgnoreCase(scissors)) {
                System.out.println("Scissors cuts Paper, Player 2 wins");
            } else if (playerOne.equalsIgnoreCase(scissors) && playerTwo.equalsIgnoreCase(rock)) {
                System.out.println("Rock breaks Scissors, Player 2 wins!");
            } else if (playerOne.equalsIgnoreCase(scissors) && playerTwo.equalsIgnoreCase(paper)) {
                System.out.println("Scissors cuts Paper, Player 1 wins!");
            } else if (playerOne.equalsIgnoreCase(scissors) && playerTwo.equalsIgnoreCase(scissors)) {
                System.out.println("It's a tie!");
            }

            System.out.println("Do you want to play again (Y/N)?");
            redoGame = scan.nextLine();
        } while (redoGame.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!");
    }
}
