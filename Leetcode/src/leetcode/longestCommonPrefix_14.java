package leetcode;

public class longestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        else {
            char[][] temp = new char[strs.length][];
            for (int i = 0;i < strs.length;i++){
                temp[i] = strs[i].toCharArray();
            }
            int min = 100000;
            for (int i = 0;i < strs.length;i++){
                if (min > strs[i].length())
                    min = strs[i].length();
            }
            int count = 0;
            for (int i = 0;i < min;i++){
                int sign = 1;
                for (int j = 1;j < temp.length;j++){

                    if (temp[0][i] != temp[j][i]){
                        count = i;
                        sign = 0;
                        break;
                    }
                }
                if (sign == 0){
                    break;
                }
            }
            if (count != 0)
                return strs[0].substring(0,count);
            else
                return "";
        }
    }
}
