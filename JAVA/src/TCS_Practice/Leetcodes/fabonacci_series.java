package TCS_Practice.Leetcodes;
import java.util.Scanner;

public class fabonacci_series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            // Edge case: If N is 0 or negative, nothing to print
            if (n <= 0) {
                sc.close();
                return;
            }

            long first = 0;
            long second = 1;

            // Print the sequence space-separated on a single line
            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    System.out.print(first); // No trailing space for the last element
                } else {
                    System.out.print(first + " ");
                }

                // Calculate the next term in the sequence
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println(); // Clean line break at the end
        }
        sc.close();
    }
}