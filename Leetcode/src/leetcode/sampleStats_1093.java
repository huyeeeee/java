package leetcode;

public class sampleStats_1093 {
	public double[] sampleStats(int[] count){
		double[] result = new double[5];
		int avg_1 = 0,avg_2 = 0,mid_1 = 0,many_max = -1;
		for (int i = 0;i < count.length;i++){
			if (count[i] != 0){//min
				result[0] = i;
				break;
			}
		}
		for (int i = count.length-1;i > 0;i--){
			if (count[i] != 0){//max
				result[1] = i;
				break;
			}
		}
		for (int i = 0;i < count.length;i++){
			avg_1 += (i * count[i]);
			avg_2 += count[i];
			if (many_max < count[i]){
				many_max = count[i];
				result[4] = i;
			}
		}
		result[2] = (double) avg_1 / (double)avg_2;
		return result;
	}
}
