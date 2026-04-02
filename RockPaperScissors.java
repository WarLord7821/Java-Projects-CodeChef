import java.util.Scanner;
import java.util.Random;

public class Codechef {
    static int you_score = 0;
    static int computer_score = 0;

    // Function to convert a string to lowercase
    public static String toLower(String str) {
        return str.toLowerCase();
    }

    // Function to get the user's choice (rock, paper, or scissors)
    public static String get_user_choice(String user_choice) {
        user_choice = toLower(user_choice);
        if (user_choice.equals("rock") || user_choice.equals("paper") || user_choice.equals("scissors")) {
            return user_choice;
        }
        return "Invalid choice! Please enter 'rock', 'paper', or 'scissors'.\n";
    }

    public static String random_choice(int rand_num) {
        if (rand_num == 0) {
            return "rock";
        } else if (rand_num == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Function to generate the computer's choice (rock, paper, or scissors)
    public static String get_computer_choice() {
        Random rand = new Random();
        int rand_num = rand.nextInt(3);
        return random_choice(rand_num);
    }

    // Function to determine the winner of the round and return the result as a string
    public static String determine_winner(String user_choice, String computer_choice) {
        if (user_choice.equals(computer_choice)) {
            return "It's a tie!";
        } else if ((user_choice.equals("rock") && computer_choice.equals("scissors")) ||
                   (user_choice.equals("paper") && computer_choice.equals("rock")) ||
                   (user_choice.equals("scissors") && computer_choice.equals("paper"))) {
            you_score++;
            return "Congratulations! You win this round!";
        } else {
            computer_score++;
            return "Computer wins this round!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("This game is the best of 3!");
        System.out.println();

        int n = 0;
        while (n < 3) {
            System.out.println("Round: " + (n + 1));

            while (true) {
                System.out.print("Enter your choice (rock, paper, or scissors): ");
                String input = scanner.nextLine();

                String user_choice = get_user_choice(input);

                if (user_choice.equals("Invalid choice! Please enter 'rock', 'paper', or 'scissors'.\n")) {
                    System.out.println(user_choice);
                } else {
                    String computer_choice = get_computer_choice();
                    System.out.println("You chose: " + user_choice);
                    System.out.println("Computer chose: " + computer_choice);

                    // Get the winner result as a string
                    String result = determine_winner(user_choice, computer_choice);
                    System.out.println(result);

                    n++;
                    break;
                }
            }
        }

        scanner.close();
    }
}
