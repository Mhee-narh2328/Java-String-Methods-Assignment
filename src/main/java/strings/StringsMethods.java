package strings;

import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Asking user to input a text
        System.out.println("Input a text:");
        String text = scanner.next();

        // coverts to uppercase;
        String textUpperCase = text.toUpperCase();
        System.out.println("The uppercase of " + text + " is " + textUpperCase);

        // Reverse name
        StringBuilder sb = new StringBuilder(text);
        String reversedText = sb.reverse().toString();
        System.out.println("The reverse of " + text + " is " + reversedText);

        //Counting the number of vowels in a String
        int vowelCount = 0;

        String textLowerCase = text.toLowerCase();

        for (int i = 0; i < textLowerCase.length(); i++){
            char ch = textLowerCase.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount ++;
            }
        }
        System.out.println("The amount of vowels contained in " + text + " is "+ vowelCount);

        //Checking if the input is a palindrome
        if (text.equals(reversedText)){
            System.out.println("It is a palindrome because " + text + " is the same as " + reversedText);
        }else {
            System.out.println("It is not a palindrome because " + text + " is not the same as " + reversedText);
        }
    }
}
