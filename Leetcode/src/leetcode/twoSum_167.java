package leetcode;

public class twoSum_167 {
    public int[] twoSum1(int[] numbers, int target){
        int[] indexes = new int[2];
        for (int i = 0;i < numbers.length;i++){
            for (int j = i + 1;j < numbers.length;j++){
                if (numbers[i] + numbers[j] == target){
                    indexes[0] = i + 1;
                    indexes[1] = j + 1;
                    break;
                }
            }
        }
        return indexes;
    }

    public int[] twoSum(int[] numbers, int target){
        int[] res = new int[2];
        int i = 0,j = numbers.length-1;
        int sum;
        while (i < j){
        	sum = numbers[i] + numbers[j];
        	if (sum < target){
        		i++;
			}
			else if (sum > target){
        		j--;
			}
			else {
        		res[0] = i+1;
        		res[1] = j+1;
        		break;
			}
		}
		return res;
    }

    public static void main(String[] args){
        twoSum_167 twoSum_167 = new twoSum_167();
        int[] a = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(twoSum_167.twoSum(a,target)[0] + "///" + twoSum_167.twoSum(a,target)[1]);
    }
}
