import java.util.Scanner;
//This program gets input for a 4-digit number and checks if it is odd, a palindrome, and if it is a perfect square.
public class Main {
    public static void main(String[] args) {
        int fourDigitNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four digit integer >> ");
        fourDigitNumber = scanner.nextInt();
        if(fourDigitNumber > 9999) {
            System.out.println("NUMBER IS GREATER THAN FOUR DIGITS!!");
        } else {
            FourDigitInteger inte = new FourDigitInteger(fourDigitNumber);
            System.out.println("Is " + fourDigitNumber + " odd?: " + inte.isOdd());
            System.out.println("Is " + fourDigitNumber + " palindrome?: " + inte.isPalindrome());
            System.out.println("Is " + fourDigitNumber + " perfect square?: " + inte.isPerfectSquare());
        }
    }
}