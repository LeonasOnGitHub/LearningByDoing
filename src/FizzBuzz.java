public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(reFizzBuzz(9));
        System.out.println(reFizzBuzz(25));
        System.out.println(reFizzBuzz(15));
        System.out.println(reFizzBuzz(8));
    }

    public static String reFizzBuzz(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result += i;
        }
        return result;
    }

}
