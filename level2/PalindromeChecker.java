import java.util.Scanner;

public class PalindromeChecker {
    private String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        StringBuilder cleanedText = new StringBuilder();

        
        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedText.append(Character.toLowerCase(c));
            }
        }

        int start = 0, end = cleanedText.length() - 1;

        // Check if the text reads the same forwards and backwards
        while (start < end) {
            if (cleanedText.charAt(start) != cleanedText.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text to check for palindrome:");
        String userInput = input.nextLine();

        // Create an instance of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker(userInput);

        // Display the result
        checker.displayResult();

        input.close();
    }
}
