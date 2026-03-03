import java.util.Scanner;

public class gratestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Initialize greatestFactor
        int greatestFactor = 1;

        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i; // assign i as greatest factor
                break;              // exit loop once found
            }
        }

        // Display result
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        sc.close();
    }
}