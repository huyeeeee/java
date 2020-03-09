import java.util.Scanner;

public class Exercise7 {
    /**
     * print the moves of the hanoi tower problem
     * @param n
     * @return
     */
    public static long solve(int n){
        return solve(n,n,0,0);
    }

    /**
     * print the moves of the hanoi tower problem
     * @param n
     * @param start
     * @param temp
     * @param end
     * @return
     */
    public static long solve(int n, int start, int temp, int end){
        if (n == 1){
            return 1;
        }
        return solve(n-1,start,end,temp) +
                solve(1,start,temp,end) +
                solve(n-1,end,temp,start);
    }

    public static void main(String[] args){
        long moves;
        long startTime,endTime,executionTime;

        System.out.println("input a number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(solve(n));

        //execution time test
        System.out.println("your test data as follow: ");
        for (int i = 8;i < 33;i += 4){
            startTime = System.currentTimeMillis();
            moves = solve(i);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.printf("%d\t%d\t%d\n",i,moves,executionTime);
        }

    }
}
