package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersection_349 {
    public static int[] intersection(int[] nums1,int[] nums2){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                arrayList.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] > nums2[j]){
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
        }
        arrayList = new ArrayList<>(new HashSet<>(arrayList));
        int[] result = new int[arrayList.size()];
        for (int k = 0;k < result.length;k++){
            result[k] = arrayList.get(k);
        }
        return result;
    }

    public static void main(String[] args){
        int [] a1 = new int[]{1,2,2,3,3,3,4,5};
        int [] a2 = new int[]{3,3,3,4,5,65,5};
        int [] b = intersection(a1,a2);
        for (int b1 : b){
            System.out.println(b1);
        }
    }
}
