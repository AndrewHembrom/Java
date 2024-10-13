import java.util.*;

public class Max_product_2 {
    public static int maxProduxt(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
            maxSoFar = tempMax;
            result = Math.max(maxSoFar, result);
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int maxProduxt = maxProduxt(arr);
        System.out.println("Max Product: " + maxProduxt);
    }
}
