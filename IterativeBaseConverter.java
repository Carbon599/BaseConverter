import java.util.Scanner;

public class IterativeBaseConverter {
    public static int convertToBase10(String number, int base) {
        int result = 0;
        int power = 0;

        // Iterate through each digit of the number, starting from the rightmost (least significant)
        for (int i = number.length() - 1; i >= 0; i--) {
            // Convert the character digit to its integer value
            int digit = Character.getNumericValue(number.charAt(i));
            // Multiply the digit by the corresponding power of the base and add it to the result
            result += digit * Math.pow(base, power);
            power++; // Increment the power for the next digit
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base;
        // Prompt the user to enter the number and ensure the base is between 2 and 9 (inclusive)
        do {
            System.out.print("Enter the base of the number (between 2 and 9): ");
            base = scanner.nextInt();
        } while (base < 2 || base > 9);

        // Prompt the user to enter the number
        System.out.print("Enter the number: ");
        String number = scanner.next();

        // Convert the number to base 10 and print the result
        int result = convertToBase10(number, base);
        System.out.println("Equivalent base 10 number: " + result);

        // Close the scanner
        scanner.close();
    }
}
