import java.util.Scanner;
import java.util.Random;

class Codechef {
    // Global strings to be used to randomly generate password components
    private static final String STRING_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String STRING_NUM = "0123456789";
    private static final String STRING_SPECIAL = "~!@#$%^&*()";

    // Function to generate the password
    public static String generatePassword(int length) {
        // Ensure that the password length is at least 8 characters
        if (length != 8) {
            System.out.println("Password length should be at equal to 8 characters.");
            return "";
        }

        StringBuilder password = new StringBuilder();
        
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Creating the first 6 characters of 'password' as a combination of alphabets
        for (int i = 0; i < 6; i++) {
            password.append(STRING_CHAR.charAt(random.nextInt(STRING_CHAR.length())));
        }

        // The 7th character should be a number
        password.append(STRING_NUM.charAt(random.nextInt(STRING_NUM.length())));

        // The 8th character should be a special character
        password.append(STRING_SPECIAL.charAt(random.nextInt(STRING_SPECIAL.length())));

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;

        // Asking user for password length
        System.out.print("Enter desired password length: ");
        length = scanner.nextInt();

        // Generate password
        String generatedPassword = generatePassword(length);

        // Output the generated password if it's valid
        if (!generatedPassword.isEmpty()) {
            System.out.println("\nGenerated Password: " + generatedPassword);
        }
    }
}
