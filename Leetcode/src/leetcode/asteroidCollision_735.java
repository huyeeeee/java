package leetcode;

import java.util.Stack;

public class asteroidCollision_735 {
	public int[] asteroidCollision(int[] asteroids){
		//you are not expected to understand this method
		Stack<Integer> s = new Stack<>();
		int[] res = new int[asteroids.length];
		int count = 0;
		for (int i = 0;i < asteroids.length;i++){
			if (asteroids[i] > 0){
				s.push(asteroids[i]);
			}
			else {
				if (s.size() == 0){
					res[count++] = asteroids[i];
				}
				else {
					while (s.size() != 0){
						int a = s.peek();
						if (a + asteroids[i] == 0){
							s.pop();
							break;
						}
						else if (a + asteroids[i] > 0){
							break;
						}
						else {
							s.pop();
							if (s.size() == 0){
								res[count++] = asteroids[i];
							}
						}
					}
				}
			}
		}
		int c = count + s.size();
		while (s.size() != 0){
			res[count+s.size()-1] = s.pop();
		}

		int[] r = new int[c];
		for (int i = 0;i < c;i++){
			r[i] = res[i];
		}
		return r;
	}
	public static void main(String[] args){
		int[] a = new int[]{-2,-2,1,-2};
		int[] res = new asteroidCollision_735().asteroidCollision(a);
		for (int i : res){
			System.out.print(i + "\t");
		}
	}
}
