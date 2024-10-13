public class Block_swap_2 {
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        if (d == 0)
            return;
        swap(arr, 0, d - 1);
        swap(arr, d, n - 1);
        swap(arr, 0, n - 1);
    }

    public static void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rotations = 2;
        rotateArray(arr, rotations);
        System.out.println("Rotated array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// import java.util.*;
// public class BlockSwapAlgorithm {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int k = 3;
//         int r = arr.length%k;
//         int [] temp = new int[arr.length];
//         for(int i=0; i<arr.length; i++) {
//             temp[(i+k)% arr.length] = arr[i];
//         }
//         System.out.println(Arrays.toString(temp));
//     }
// }
