//Q.3.: Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

//Code:

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        String lowercaseInput = s.toLowerCase();

        Set<Character> uniqueLetters = new HashSet<>();

        for (char c : lowercaseInput.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }

        return uniqueLetters.size() == 26;
    }
}


