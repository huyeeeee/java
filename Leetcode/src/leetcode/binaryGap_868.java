package leetcode;

import java.util.ArrayList;

public class binaryGap_868 {
	public int binaryGap(int N){
		//you are not expected to understand this code
		int count = 0;
		String[] str = Integer.toBinaryString(N).split("");
		ArrayList<String> strs = new ArrayList<>();
		for (String s : str){
			strs.add(s);
		}
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0;i < strs.size();i++){
			if (strs.get(i).equals("1"))
				temp.add(i);
		}
		if (temp.size() <= 1){
			return 0;
		}
		for (int i = 0;i < temp.size()-1;i++){
			temp.set(i,temp.get(i+1)-temp.get(i));
		}
		for (int i = 0;i < temp.size()-1;i++){
			if (count < temp.get(i))
				count = temp.get(i);
		}

		return count;
	}
	public static void main(String[] args){
		System.out.println(new binaryGap_868().binaryGap(8));
	}
}
