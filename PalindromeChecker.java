import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase for consistent checking
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanInput).reverse().toString();

        if (cleanInput.equals(reversed)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }

        sc.close();
    }
}
