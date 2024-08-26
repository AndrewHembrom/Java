import java.util.*;

public class Segmented_Sieve {
    // Segmented version of Sieve of Eratosthenes, it isa  way to find all the prime numbers within a range rather than all prime numbers upto a certain number.
    // The basic idea is to divide the the range into segments and then apply Sieve of Eratosthenes to each segment

    // Algorthim
    // 1. Create a list of numbers and mark them as Prime.
    // 2. let genList = Generate all prime nos from 2 to sqrt(upper bound of range).
    // 3. let x in genList, traverse the list of numbers and unmark all the multiples of x.
    // 4. All the rest marked numbers are prime numbers.

    // Complexity
    // Space Complexity - O(sqrt(N))

    // Advantages


    // Implementation

    // Simple Sieve function
    static int N = 100000;
    static boolean[] arr = new boolean[N + 1];
    
    // Simple Sieve from 2 to 100000
    static void SimpleSieve() {
        for (int i = 2; i <= N; i++) {
            arr[i] = true;
        }
        for (int i = 2; i < Math.sqrt(N); i++) {
            if (arr[i] == true) {
                for (int j = (i * i); j <= N; j = j + i) {
                    arr[j] = false;
                }
            }
        }
    }

    // Generate Function - Prime Numbers from 1 to sqrt(n)
    static ArrayList<Integer> generatePrimes(int n) {
        ArrayList<Integer> genPrime = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == true) {
                genPrime.add(i);
            }
        }
        return genPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower Bound");
        int low = sc.nextInt();
        System.out.println("Enter the High Bound");
        int high = sc.nextInt();
        
        SimpleSieve();
        ArrayList<Integer> genPrime = generatePrimes(high);

        boolean[] temp = new boolean[high - low + 1];
        for (int i = 0; i < (high - low + 1); i++) {
            temp[i] = true;
        }

        for (int prime : genPrime) {
            int firstMultiple = (low / prime) * prime;
            if (firstMultiple < low) {
                firstMultiple += prime;
            }
            int start = Math.max(firstMultiple, prime * prime);

            for (int j = start; j <= high; j += prime) {
                temp[j - low] = false;
            }
        }

        for (int i = low; i <= high; i++) {
            if (temp[i - low] == true) {
                if (i == 1) {
                    System.out.print("");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println(" ");

        sc.close();
    }
    
}
