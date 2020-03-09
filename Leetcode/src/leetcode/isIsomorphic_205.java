package leetcode;

import java.util.HashMap;
import java.util.Map;

public class isIsomorphic_205 {
	public boolean isIsomorphic(String s,String t){
		String[] s1 = s.split("");
		String[] s2 = t.split("");
		Map<String,String> result = new HashMap<>();
		for (int i = 0;i < s1.length;i++){
			if (result.containsKey(s1[i]) && !s2[i].equals(result.get(s1[i]))){
				return false;
			}
			if (!result.containsKey(s1[i])){
				result.put(s1[i],s2[i]);
			}
		}
		Map<String,String> res = new HashMap<>();
		for (int i = 0;i < s1.length;i++){
			if (res.containsKey(s2[i]) && !s1[i].equals(res.get(s2[i]))){
				return false;
			}
			if (!res.containsKey(s2[i])){
				res.put(s2[i],s1[i]);
			}
		}
		return true;
	}

	public static void main(String[] args){
		String s = "aba";
		String t = "baa";
		System.out.println(new isIsomorphic_205().isIsomorphic(s,t));
	}
}
