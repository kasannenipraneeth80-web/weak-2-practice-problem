import java.util.Scanner;

public class factorsusingwhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int counter = 1; // start from 1

            System.out.println("Factors of " + number + " are:");
            // Run while loop until counter is less than or equal to number
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter); // print factor
                }
                counter++; // increment counter
            }
        }

        sc.close();
    }
}