package leetcode;

/**
 * 寻找字串在父串中的位置
 * leetcode 28
 */
public class strStr_28 {
    public static int strStr(String haystack,String needle){
        return haystack.indexOf(needle);
    }

    public static void main(String[] args){
        System.out.println(strStr("helollo","l00l"));
    }
}
