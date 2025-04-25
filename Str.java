import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = new String(scanner.nextLine());
        System.out.print("Enter second string: ");
        String str2 = new String(scanner.nextLine());
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Length of String 1: " + str1.length());
        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);
        if (str1.length() > 1) {
            System.out.println("Character at index 1 of String 1: " + str1.charAt(1));
        } else {
            System.out.println("String 1 is too short to extract character at index 1.");
        }
        System.out.println("String 1 equals String 2? " + str1.equals(str2));
        System.out.print("Enter a substring to search in combined string: ");
        String sub = scanner.nextLine();
        System.out.println("Contains substring? " + combined.contains(sub));
        System.out.println("Index of substring: " + combined.indexOf(sub));
        System.out.print("Enter a word in the combined string to replace: ");
        String toReplace = scanner.nextLine();
        System.out.print("Enter the new word: ");
        String replacement = scanner.nextLine();
        String modified = combined.replace(toReplace, replacement);
        System.out.println("Modified String: " + modified);
        System.out.print("Enter an integer to convert to String: ");
        int number = scanner.nextInt();
        String numberStr = String.valueOf(number);
        System.out.println("Converted integer to String: " + numberStr);
        scanner.close();
    }
}

