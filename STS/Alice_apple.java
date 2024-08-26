import java.util.Scanner;

public class Alice_apple {

    static int minApples(int m, int k, int n, int s, int w, int e) {
        if (m <= s * k){
            return m;}
        else if (m <= s * k + w + e){
            return s*k + (m-s*k);}
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int s = sc.nextInt();
        int w = sc.nextInt();
        int e = sc.nextInt();
        int ans = minApples(m, k, n, s, w, e);
        System.out.println(ans);
        sc.close();
    }
}
