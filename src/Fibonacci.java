public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(0));
        System.out.println(fiboRec(8));
    }

    public static Integer fibonacci(Integer n) {
        if (n == 0) {
            return 0;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < result.length; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    public static Integer fiboRec(int n){
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
