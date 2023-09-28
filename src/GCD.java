public class GCD {
    public static void main(String[] args) {

    }
    public Integer gcd(Integer p, Integer q) {
        for (int i = p/2; i > 0; i--) {
            if (p%i==0 && q%i==0){
                return i;
            }
        }
        return 1;
    }
}
