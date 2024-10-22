import java.util.Scanner;

public class Palindrome_Checker {
    public static String reverseString(String  input) {

            StringBuilder reversed = new StringBuilder(input);
            return
                    reversed.reverse().toString();
        }
        //method to check if the string is palindrome
        public static boolean isPalindrome (String input){
            String reversed = reverseString(input);
            return
                    input.equalsIgnoreCase(reversed);
        }

        public static void main (String[]args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a string: ");
            String input = scanner.nextLine();
            if (isPalindrome(input)) {
                System.out.println("the String is a palindrome.");

            } else {
                System.out.println("the String is not a palindrome.");
            }
        }
    }

