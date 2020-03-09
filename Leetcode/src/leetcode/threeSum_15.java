package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class threeSum_15 {
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> temp = new ArrayList<>();
		Arrays.sort(nums);
		for (int i : nums)
			System.out.print(i+"\t");
		System.out.println();
		int a,b,c;
		boolean sign = true;
		for (int i = 0;i < nums.length-2;i++){
			List<Integer> l = new ArrayList<>();
			int left = i+1;
			int right = nums.length-1;
			a = nums[i];
			b = nums[left];
			c = nums[right];
			while (true){
				if (left >= right) {
					sign = false;
					break;
				}
				if (a+b+c == 0){
					l.add(a);
					l.add(b);
					l.add(c);
					Collections.sort(l);
					if (!temp.contains(l))
						temp.add(l);
					b = nums[++left];
					continue;
				}
				else if (a+b+c > 0){
					c = nums[--right];
				}
				else if (a+b+c < 0) {
					b = nums[++left];
				}
				System.out.println("i="+i+" a="+a+" b="+b+" c="+c+" left="+left+" right="+right);

			}
			if (!sign){
				sign = true;
				continue;
			}


		}
		return temp;
	}

	public static void main(String[] args){
		int nums[] = new int[]{-2,0,1,1,2};
		List<List<Integer>> l = new threeSum_15().threeSum(nums);
		for (int i = 0;i < l.size();i++){
			System.out.println(l.get(i));
		}
	}
}
