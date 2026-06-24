// Import Scanner class
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            isPrime = false;
        } else {

            // Check divisibility
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}