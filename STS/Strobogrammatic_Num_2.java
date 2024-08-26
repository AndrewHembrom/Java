import java.util.*;

public class Strobogrammatic_Num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.nextLine();
        if (isStrobogrammatic(num)) {
            System.out.println(num + " is a Strobogrammatic Number");
        } else {
            System.out.println(num + " is not a Strobogrammatic Number");
        }

        sc.close();
    }

    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> strobogrammaticDictionary = new HashMap<>();
        strobogrammaticDictionary.put('0', '0');
        strobogrammaticDictionary.put('1', '1');
        strobogrammaticDictionary.put('6', '9');
        strobogrammaticDictionary.put('8', '8');
        strobogrammaticDictionary.put('9', '6');

        int n = num.length();
        for (int i = 0, j = (n - 1); i <= j; i++, j--) {
            char digit_left = num.charAt(i);
            char digit_right = num.charAt(j);
            char mapping = strobogrammaticDictionary.getOrDefault(digit_left, '-');

            if (mapping == '-' || mapping != digit_right) {
                return false;
            }
        }
        return true;
    }
}
