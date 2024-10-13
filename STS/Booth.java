import java.util.*;
public class Booth {
    public static Scanner s = new Scanner(System.in);
    public int multiply(int n1, int n2) {
        int[] m = binary(n1);
        int[] m1 = binary(-n1);
        int[] r = binary(n2);
        int[] A = new int[9];
        int[] S = new int[9];
        int[] P = new int[9];
        for (int i = 0; i < 4; i++) {
            A[i] = m[i];
            S[i] = m1[i];
            P[i + 4] = r[i];
        }
        display(A, 'A');
        display(S, 'S');
        display(P, 'P');
        System.out.println();
        for (int i = 0; i < 4; i++) {
            if (P[7] == 0 && P[8] == 1) {
                add(P, A);
            } else if (P[7] == 1 && P[8] == 0) {
                add(P, S);
            }
            rightShift(P);
            display(P, 'P');
        }
        return getDecimal(P);

    }
    public int getDecimal(int[] B) {
        int p = 0;
        int t = 1;
        for (int i = 7; i >= 0; i--, t *= 2)
            p += (B[i] * t);
        if (B[0] == 1)  // if the result is negative
            p = p - 256;
        return p;
    }
    /* Function to right shift array */
    public void rightShift(int[] A) {
        for (int i = 8; i > 0; i--) {
            A[i] = A[i - 1];
        }
        // Sign extend
        A[0] = A[1];
    }


    /* Function to add two binary arrays */
    public void add(int[] A, int[] B) {
        int carry = 0;
        for (int i = 8; i >= 0; i--) {
            int temp = A[i] + B[i] + carry;
            A[i] = temp % 2;
            carry = temp / 2;
        }
    }
    /* Function to get binary of a number */
    public int[] binary(int n) {
        int[] bin = new int[4];
        int ctr = 3;
        int num = n;
        /* for negative numbers 2's complement */
        if (n < 0)
            num = 16 + n;
        while (num != 0) {
            bin[ctr--] = num % 2;
            num /= 2;
        }
        return bin;
    }

    /* Function to print array */
    public void display(int[] P, char ch) {
        System.out.print("\n" + ch + " : ");
        for (int i = 0; i < P.length; i++) {
            if (i == 4)
                System.out.print(" ");
            if (i == 8)
                System.out.print(" ");
            System.out.print(P[i]);
        }
    }
    /* Main function */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Booth b = new Booth();
        System.out.println("Enter two integer numbers -");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int result = b.multiply(n1, n2);
        System.out.println("\n\nResult : " + n1 + " * " + n2 + " = " + result);
    }
}
