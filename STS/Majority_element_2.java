import java.util.*;

public class Majority_element_2 {
    public static int findMajorityElement(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > A.length / 2) {
                return key;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
        int result = findMajorityElement(arr);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("null");
        }
    }
}


