public class Palidrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abab"));
        System.out.println(isPalindrome("ababababababbaba"));
        System.out.println(isPalindrome("asdfghhgfdsa"));
    }
    public static boolean isPalindrome(String word) {
        char[] r = word.toCharArray();
        for (int i = 0; i <r.length/2 ; i++) {
            if (r[i]!=r[r.length-(i+1)]){
                return false;
            }
        }
        return true;
    }
}
