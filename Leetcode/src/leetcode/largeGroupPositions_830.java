package leetcode;

import java.util.ArrayList;
import java.util.List;

public class largeGroupPositions_830 {
	public List<List<Integer>> largeGroupPositions(String S){
		List<List<Integer>> res = new ArrayList<>();
		char[] temp = S.toCharArray();
		int start = 0;
		int end = 0;
		ArrayList<Integer> arrayList;
		for (int i = 1;i < temp.length;i++){
			if (temp[i-1] != temp[i]){
				start = i;
				end = i;
			}
			else {
				end ++;
			}
			if (end-start >= 2){
				if (i < temp.length-1 && temp[i] == temp[i+1])
					continue;
				arrayList = new ArrayList<>();
				arrayList.add(start);
				arrayList.add(end);
				res.add(arrayList);
			}
		}
		return res;
	}

	public static void main(String[] args){
		System.out.println(new largeGroupPositions_830().largeGroupPositions("abbxxxxzzy"));
	}
}
