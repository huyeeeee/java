import java.util.*;
public class Collatz {
    /**
     *
     * @param num is the specified number that user give
     * @return the information as a string include number,max number,the length of the
     * max number, and its time
     */
    public static String collatz(long num){
        long maxNum = -1;
        long maxLength = -1;
        long start,end,speedTime;
        start = System.currentTimeMillis();
        for (long i = 1;i <= num;i++){
            long temp = i;
            long length = 1;
            while (temp != 1){
                length++;
                if (temp % 2 == 0){
                    temp /= 2;
                }
                else {
                    temp = temp * 3 + 1;
                }
            }
            if (length > maxLength){
                maxLength = length;
                maxNum = i;
            }
        }
        end = System.currentTimeMillis();
        speedTime = end - start;
        String result = num + " " + maxNum + " " + maxLength + " " + speedTime;
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long p;
        while ((p = in.nextLong()) > 0){
            System.out.println(collatz(p));
        }
    }
}
