package interview;

public class findNumberIn2DArray_interview_04 {
	public boolean findNumberIn2DArray(int[][] matrix,int target){
		/**for (int i = 0;i < matrix.length;i++){
			for (int j = 0;j < matrix[0].length;j++){
				if (matrix[i][j] == target){
					return true;
				}
			}
		}
		return false;*/
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int row = 0,column = matrix[0].length - 1;
		while (row < matrix.length && column >= 0){
			if (matrix[row][column] == target){
				return true;
			}
			else if (matrix[row][column] > target){
				column--;
			}
			else if (matrix[row][column] < target){
				row++;
			}
		}
		return false;
	}
}
