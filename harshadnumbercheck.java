import java.util.Scanner;

public class harshadnumbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int temp = number; // copy of number for digit extraction
        int sum = 0;

        // Calculate sum of digits using while loop
        while (temp > 0) {
            int digit = temp % 10;   // extract last digit
            sum += digit;            // add digit to sum
            temp /= 10;              // remove last digit
        }

        // Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        sc.close();
    }
}