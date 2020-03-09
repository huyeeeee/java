package leetcode;

import java.util.ArrayList;
import java.util.List;

public class generate_118 {
	public List<List<Integer>> generate(int rowNumber){
		List<List<Integer>> temp = new ArrayList<>();
		for (int i = 0;i < rowNumber;i++){
			List<Integer> list = new ArrayList<>();
			for (int j = 0;j < i+1;j++){
				if (j == 0 || j == i){
					list.add(1);
				}
				else {
					list.add(temp.get(i-1).get(j-1)+temp.get(i-1).get(j));
				}
			}
			temp.add(list);
		}
		return temp;
	}

	public static void main(String[] args){
		generate_118 g = new generate_118();
		List<List<Integer>> l = g.generate(10);
		for (int i = 0;i < l.size();i++){
			System.out.println(l.get(i));
		}
	}
}
