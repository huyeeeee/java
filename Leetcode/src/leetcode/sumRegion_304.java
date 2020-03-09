package leetcode;

import com.sun.org.apache.regexp.internal.RE;

public class sumRegion_304 {
	private int[][] matrix;
	private int[][] d;
	public sumRegion_304(int[][] matrix){
		this.matrix = matrix;
		if (matrix.length != 0){
			d = new int[matrix.length][matrix[0].length];
			for (int i = 0;i < matrix.length;i++){
				for (int j = 0;j < matrix[0].length;j++){
					d[i][j] = dp(i,j);
				}
			}
		}
	}
	public int sumRegion(int row1, int col1, int row2, int col2) {
			if (matrix.length == 0)
				return 0;
		return d[row2][col2] - d[row2][col1-1] - d[row1-1][col2] + d[row1-1][col1-1];
	}
	private int dp(int row,int col){
		int count = 0;
		for (int i = 0;i <= row;i++){
			for (int j = 0;j <= col;j++){
				count += matrix[i][j];
			}
		}
		return count;
	}
	public static void main(String[] args){
		int[][] a = new int[][]{
				{-1}
		};
		sumRegion_304 s = new sumRegion_304(a);
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0;i < a.length;i++){
			for (int j = 0;j < a[0].length;j++){
				b[i][j] = s.dp(i,j);
				System.out.print(s.dp(i,j)+" ");
			}
			System.out.println();
		}
		System.out.println(s.sumRegion(0,0,0,0));

	}
}
