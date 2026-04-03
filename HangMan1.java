import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Codechef {

    // Function to select a random word from a predefined list
    public static String chooseWord() {
        ArrayList<String> words = new ArrayList<>();
        words.add("codechef");
        words.add("programming");
        words.add("learning");
        words.add("practice");
        words.add("contests");
        words.add("rating");

        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get player's name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ", time to play hangman!");

        // Select a random word for the game
        String word = chooseWord();
        System.out.println("Word selected for this round is '" + word + "'");

        scanner.close();
    }
}
