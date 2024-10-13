import java.util.*;

public class Leaders_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findLeaders(arr, n);

        sc.close();
    }
    
    static void findLeaders(int arr[], int size) {
        int rightMax = arr[arr.length - 1];
        System.out.print(rightMax + " ");
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > rightMax) {
                rightMax = arr[i];
                System.out.print(rightMax + " ");
            }
        }
    }

}
