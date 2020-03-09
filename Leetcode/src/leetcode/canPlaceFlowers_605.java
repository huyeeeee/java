package leetcode;

public class canPlaceFlowers_605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n){
		int[] temp = new int[flowerbed.length+2];
		temp[0] = temp[temp.length-1] = 0;
		for (int i = 0;i < flowerbed.length;i++)
			temp[i+1] = flowerbed[i];
		int count = 0;
		for (int i = 1;i < temp.length-1;i++){
			if (temp[i] == 0 && temp[i-1] == 0 && temp[i+1] == 0){
				temp[i] = 1;
				count++;
			}
		}
		return count >= n;
	}
	public static void main(String[] args){
		int[] f = new int[]{0,0,1,0,0};
		int n = 2;
		System.out.println(new canPlaceFlowers_605().canPlaceFlowers(f,n));
	}
}
