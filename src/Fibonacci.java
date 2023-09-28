public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(0));
        System.out.println(fiboRec(8));
        System.out.println(evenFibonacciSum(450));
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

    public static Integer fiboRec(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static Integer evenFibonacciSum(Integer n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int[] fibArray = new int[n + 5];
        fibArray[0] = 0;
        fibArray[1] = 1;
        int result = 0;
        int fib = 0;
        for (int i = 2; fib <= n; i++) {
            fib = fibArray[i - 1] + fibArray[i - 2];
            fibArray[i] = fib;
            if (fib > n) {
                break;
            }
            if (fib % 2 == 0) {
                result += fib;
            }
        }
        return result;
    }
}
