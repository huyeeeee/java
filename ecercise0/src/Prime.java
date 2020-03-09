import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long p;
        while ((p = in.nextLong()) > 0){
            long start,end,spendTime;
            start = System.currentTimeMillis();
            end = System.currentTimeMillis();
            spendTime = end - start;
            System.out.println(p +" "+ nthPrime(p) + " " + spendTime);
        }
    }

    /**
     * By using this method, It will return the p-th prime
     * @param p means the p-th prime
     * @return the p-th prime from 0
     */
    public static long nthPrime(long p){
        long i = 2,j = 1;
        while (true){
            j = j + 1;
            if (j > i/j){
                p--;
                if (p == 0)
                    break;
                j = 1;
            }
            if (i % j == 0){
                i++;
                j = 1;
            }
        }
        return i;
    }
}
