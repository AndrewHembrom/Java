import java.util.*;

public class Simple_Sieve {
    // Searches for Prime Numbers in a given limit

    // Algorithm
    // 1. Take a list of numbers from 2 to n
    // 2. Select the smallest no. on the list. Initially let x =2, then we traverse through the list and mark all the multiples of x.
    // 3. After step 2 we move x to the next smallest unmarked number which is 3, we then again traverse through the list and mark the multiples of x.
    // 4. Repeat this until we reach x = sqrt(n).
    // 5. All the unmarked numbers in the list are the prime numbers.

    // Complexity
    // Time Complexity - O(Nlog(logN))
    // Space Complexity - O(N)

    // Implementation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean[] primeNums = new boolean[num];
        for (int i = 0; i < num; i++) {
            primeNums[i] = true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (primeNums[i] == true) {
                for (int j = (i * i); j < num; j = j + i) {
                    primeNums[j] = false;
                }
            }
        }

        // Prime nums
        System.out.println(" ");
        System.out.println("List of Prime Nums upto " + num + " are: ");
        System.out.print("[ ");
        int count = 0;
        for (int i = 2; i < primeNums.length; i++) {
            if (primeNums[i] == true) {
                count++;
                System.out.print( i + " ");
            }
        }
        System.out.println("] ");

        // Count
        System.out.println(" ");
        System.out.println("No. of Prime Nums upto " + num + " are: " + count + ".");
        
        // Sum 
        System.out.println(" ");
        int sum = 0;
        for (int i = 2; i < primeNums.length; i++) {
            if (primeNums[i] == true) {
                sum += i;
            }
        }
        System.out.println("Sum of Prime Nums upto " + num + " is: " + sum);
        
        // kth Position
        System.out.println(" ");
        System.out.println("Enter the position:  ");
        int k = sc.nextInt();
        int pos = 1;
        for (int i = 2; i < primeNums.length; i++) {
            if (primeNums[i] == true) {
                if (pos == k) {
                    System.out.println("The "+k+"th prime number upto "+num+" is: "+ i);
                }
                pos++;
            }
        }
        sc.close();

        // Print twin prime numbers
        System.out.println(" ");
        System.out.println("Twin Prime Numbers up to " + num + " are: ");
        for (int i = 2; i < primeNums.length - 2; i++) {
            if (primeNums[i] == true && primeNums[i + 2] == true) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
        sc.close();
    }

    
}
