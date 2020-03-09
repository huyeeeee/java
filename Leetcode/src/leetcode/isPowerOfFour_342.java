package leetcode;

public class isPowerOfFour_342 {
    public static boolean isPowerOfFour(int n){
        boolean b1 = true;
        if (n >= 1) {
            while (n != 1) {
                if (n % 4 != 0) {
                    b1 = false;
                    break;
                }
                n /= 4;
            }
        }
        else{
            b1 = false;
        }
        return b1;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfFour(1024));
    }
}

