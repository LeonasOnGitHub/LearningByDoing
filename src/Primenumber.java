public class Primenumber {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(10));
        System.out.println(isPrime(11));
        System.out.println(isPrime(89));
    }

    public static Boolean isPrime(Integer n) {
        boolean isPrime = true;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
