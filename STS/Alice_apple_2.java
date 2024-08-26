import java.util.*;

public class Alice_apple_2 {

    public static int findMinPerimeter(int X) {
        int k = 0;
        while (true) {
            int totalApples = 0;
            for (int i = -k; i <= k; i++) {
                for (int j = -k; j <= k; j++) {
                    totalApples += Math.abs(i) + Math.abs(j);
                }
            }
            if (totalApples >= X) {
                return 8 * k; // Perimeter of the square plot
            }
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // Sample input
        int minPerimeter = findMinPerimeter(X);
        System.out.println(minPerimeter); // Sample output
        sc.close();
    }
}

