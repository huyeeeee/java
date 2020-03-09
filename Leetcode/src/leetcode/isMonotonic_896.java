package leetcode;

public class isMonotonic_896 {
    public boolean isMonotonic(int[] A){
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < A.length-1;i++){
            if (A[i] > A[i+1]){
                if (sb.indexOf("1") == -1)
                    sb.append("1");
            }
            else if (A[i] < A[i+1]){
                if (sb.indexOf("2") == -1)
                    sb.append("2");
            }
            else if (A[i] == A[i+1]){
                if (sb.indexOf("0") == -1)
                    sb.append("0");
            }
        }
        if (sb.length() == 1 || sb.length() == 0)
            return true;
        if (sb.length()==3)
            return false;
        if (sb.toString().charAt(0) == '0' || sb.toString().charAt(1) == '0')
            return true;
        return false;
    }

    public static void main(String[] args){
        isMonotonic_896 im = new isMonotonic_896();
        int[] a = new int[]{4};
        System.out.println(im.isMonotonic(a));
    }
}
