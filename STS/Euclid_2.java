public class Euclid_2 {
    static class Result {
        int x, y;

        Result(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int gcdExtended(int a, int b, Result result) {
        if (a == 0) {
            result.x = 0;
            result.y = 1;
            return b;
        }

        Result tempResult = new Result(1, 1);
        int gcd = gcdExtended(b % a, a, tempResult);
        result.x = tempResult.y - (b / a) * tempResult.x;
        result.y = tempResult.x;
        return gcd;
    }
    
    public static void main(String[] args) {
        int a = 10, b = 25;
        Result result = new Result(1, 1);
        int g = gcdExtended(a, b, result);
        System.out.println("GCD is:" + g);
        System.out.println(b/a);
        System.out.println("x is:" + result.x + ", y is: " + result.y);
    }
}
