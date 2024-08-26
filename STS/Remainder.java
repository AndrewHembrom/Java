import java.util.*;

public class Remainder {
    static int findMinX(int num[], int rem[], int k) {
        int x = 1;
        while (true) {
            int j;
            for (j = 0; j < k; j++) {
                if (x % num[j] != rem[j]) {
                    break;
                }
            }
            if (j == k) {
                return x;
            }
            x++;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of congruence relations: ");
        int size = sc.nextInt();      
        int a[] = new int[size];
        int m[] = new int[size];

        System.out.println("Enter the values of m: ");
        for (int i = 0; i < size; i++) {
            m[i] = sc.nextInt();
        }

        System.out.println("Enter the values of a: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }


        System.out.println(" 000 ");
        System.out.println("x is " + findMinX(m, a, size));
        sc.close();
    }
}
