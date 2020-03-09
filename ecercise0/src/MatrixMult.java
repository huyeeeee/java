import java.util.*;
public class MatrixMult {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        double num;
        while ((n = sc.nextInt()) > 0){
            num = sc.nextDouble();
            double[][] matrix1 = new double[n][n];
            for (int i = 0;i < n;i++){
                Arrays.fill(matrix1[i],num);
            }
            double[][] matrix2 = new double[n][n];
            for (int i = 0;i < n;i++){
                Arrays.fill(matrix2[i],num);
            }
            long start,end,speedTime;
            start = System.currentTimeMillis();
            double[][] resultMatrix = multiplyMatrix(matrix1,matrix2);
            end = System.currentTimeMillis();
            speedTime = end - start;
            System.out.println(n + " " + speedTime);
        }
    }

    /**
     * this method can multiply two matrix, it should check the row and column, if
     * is correct, then calculate the two matrices
     * @param m1 is the first matrix, its row*column should be m*n
     * @param m2 is the second matrix, its row*column should be n*p
     * @return the result matrix, it row*column must be m*p
     */
    public static double[][] multiplyMatrix(double[][] m1,double[][] m2){
        //judge the length is legal or not
        if (m1[0].length != m2.length)
            return null;
        double[][] result = new double[m1.length][m2[0].length];
        for (int i = 0;i < m1.length;i++){
            for (int j = 0;j < m2[0].length;j++){
                for (int k = 0;k < m1[0].length;k++){
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }
}
