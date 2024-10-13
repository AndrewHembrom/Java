import java.util.*;
public class Max_product_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int prefix = 1;

        int ans = 1;
        for(int i=0; i<n; i++) {
            if(prefix == 0) {
                prefix = 1;
            }

            prefix *= arr[i];

            ans = Math.max(ans, prefix);
        }
        System.out.println(ans);
        sc.close();
    }
}