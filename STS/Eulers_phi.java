public class Eulers_phi{
    // gives the no. of co prime numbers between 1 to n

    // Complexity
    // Time Complexity - O(NlogN)

    // Solution 1 - Iterates through all numbers from 1 to n-1
    // static int gcd(int a, int b) {
    //     if (a == 0) {
    //         return b;
    //     }
    //     return gcd(b % a, a);
    // }

    // static int phi(int n) {
    //     int result = 1;
    //     for (int i = 2; i < n; i++) {
    //         if (gcd(i, n) == 1) {
    //             result++;
    //         }
    //     }
    //     return result;
    // }

    // public static void main(String[] args) {
    //     int n = 43;
    //     System.out.println(phi(n));
    // }

    // Solution 2 - 
    // static int phi(int n) {
    //     float result = n;
    //     for (int p = 2; p * p <= n; ++p) {
    //         if (n % p == 0) {
    //             while (n % p == 0)
    //                 n /= p;
    //             result *= (1.0 - (1.0 / (float) p));
    //         }
    //     }
    //     if (n > 1) {
    //         result -= result / n;
    //     }
    //     return (int) result;
    // }

    // public static void main(String[] args) {
    //     int n = 43;
    //     System.out.println(phi(n));
    // }

    //Solution 3
    static int phi(int n){
        int result = n;
        System.out.println(Math.sqrt(n));
        for (int p = 2; p <= Math.sqrt(n); p++){ 
            if (n % p == 0){
                while (n % p == 0) {
                    n /= p;
                }               
                result -= result / p;
            }
        }
        if (n > 1)
            result -= result / n;
        return result;
    }
    public static void main (String[] args){
        int n=42;
        System.out.println(phi(n));
    }
}