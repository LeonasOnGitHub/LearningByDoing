public class RiceBags {
    public static void main(String[] args) {
        System.out.println(packageRice(2, 2, 11));
        System.out.println(packageRice(2, 2, 15));
        System.out.println(packageRice(2, 2, 12));
    }

    public static Boolean packageRice(Integer big, Integer small, Integer goal) {
        if (big * 5 + small == goal) {
            return true;
        } else if (big == 0 && small != 0) {
            return small>=goal;
        } else if (5 < goal) {
            return packageRice(big - 1, small, goal - 5);
        }
        return false;
    }
}
