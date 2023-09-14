import java.util.Scanner;

public class RPSLO {
    int rock = 0, paper = 1, scissors = 2, lizzard = 3, spock = 4;
    // Rock = 0, Paper = 1, Scissors = 2, Lizzard = 3, Spock = 4
    // Scissors cut Paper
    // Paper covers Rock
    // Rock crushes Lizard
    // Lizard poisons Spock
    // Spock smashes Scissors
    // Scissors decapitate Lizard
    // Lizard eats Paper
    // Paper disproves Spock
    // Spock vaporizes Rock
    // Rock crushes Scissors

    public static void main(String[] args) {
        System.out.println("Enter your play: R, P, S, L, O");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        calculateWinner(userInput);
    }

    public static void calculateWinner(String x) {
        double rando = Math.random() * 5;
        int randomNum = ((int) Math.floor(rando));
        String compPlay = "Error!";
        if (randomNum == 0)
            compPlay = "R";

        if (randomNum == 1)
            compPlay = "P";
        if (randomNum == 2)
            compPlay = "S";
        if (randomNum == 3)
            compPlay = "L";
        if (randomNum == 4)
            compPlay = "O";

        System.out.println("Computer play is " + compPlay);
        switch (x) {
            case "r":
            case "R":
                if (randomNum == 3 || randomNum == 2)
                    System.out.println("You win!");
                else if (randomNum == 1 || randomNum == 4)
                    System.out.println("Computer wins!");
                else
                    System.out.println("It is a tie!");
                break;
            case "p":
            case "P":
                if (randomNum == 0 || randomNum == 4)
                    System.out.println("You win!");
                else if (randomNum == 2 || randomNum == 3)
                    System.out.println("Computer wins!");
                else
                    System.out.println("It is a tie!");
                break;
            case "s":
            case "S":
                if (randomNum == 1 || randomNum == 3)
                    System.out.println("You win!");
                else if (randomNum == 4 || randomNum == 0)
                    System.out.println("Computer wins!");
                else
                    System.out.println("It is a tie!");
                break;
            case "l":
            case "L":
                if (randomNum == 4 || randomNum == 1)
                    System.out.println("You win!");
                else if (randomNum == 0 || randomNum == 2)
                    System.out.println("Computer wins!");
                else
                    System.out.println("It is a tie!");
                break;
            case "o":
            case "O":
                if (randomNum == 2 || randomNum == 0)
                    System.out.println("You win!");
                else if (randomNum == 1 || randomNum == 3)
                    System.out.println("Computer wins!");
                else
                    System.out.println("It is a tie!");
                break;
            default:
                System.out.println("Invalid input (valid inputs: R, P, S, L, O)");
        }
    }
}