package leetcode;

public class isPowerOfThree_326 {
    public static boolean isPowerOfTwo(int n){
        boolean b1 = true;
        if (n >= 1) {
            while (n != 1) {
                if (n % 3 != 0) {
                    b1 = false;
                    break;
                }
                n /= 3;
            }
        }
        else{
            b1 = false;
        }
        return b1;
    }
    public static void main(String[] args){
        int a = 3;
        System.out.println(isPowerOfTwo(1));
    }
}
