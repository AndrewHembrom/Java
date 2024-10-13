import java.util.*;
public class Karatsuba {
    private static int karatsuba(int x, int y) {
        if (x<10 || y<10) {
            return x*y;
        }
        int m = Math.max(getNumDigits(x), getNumDigits(y));
        int halfM = m/2;
        int powerOf10 = (int)Math.pow(10, halfM);
        int a = x/powerOf10;
        int b = x%powerOf10;
        int c = y/powerOf10;
        int d = y%powerOf10;
        int ac = karatsuba(a,c);
        int bd = karatsuba(b,d);
        int abcd = karatsuba(a+b, c+d);
        int result = ac*(int)Math.pow(10, 2*halfM) + (abcd-ac-bd)*powerOf10 + bd;
        return result;
    }
    private static int getNumDigits(int x) {
        if(x==0) {
            return 1;
        }
        int count = 0;
        while (x>0) {
            count++;
            x/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teo integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int product = karatsuba(x,y);
        System.out.println(product);
        sc.close();
    }
}