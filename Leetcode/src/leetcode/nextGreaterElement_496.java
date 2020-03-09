package leetcode;

public class nextGreaterElement_496 {
	public int[] nextGreaterElement(int[] nums1,int[] nums2){
		int[] result = new int[nums1.length];
		boolean temp = true;
		for (int i = 0;i < result.length;i++)
			result[i] = -1;
		int k = nums2.length;
		for (int i = 0;i < nums1.length;i++){
			for (int j = 0;j < nums2.length;j++){
				if (nums1[i] == nums2[j]){
					k = j;
				}
				for (;k < nums2.length;k++){
					if (nums2[j] < nums2[k]){
						result[i] = nums2[k];
						temp = false;
						break;
					}
				}
				if (!temp){
					k = nums2.length;
					temp = true;
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args){
		nextGreaterElement_496 n = new nextGreaterElement_496();
		int[] n1 = new int[]{4,1,2};
		int[] n2 = new int[]{1,3,4,2};
		int[] a = n.nextGreaterElement(n1,n2);
		for (int i = 0;i < a.length;i++){
			System.out.println(a[i]);
		}
	}
}
