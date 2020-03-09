package leetcode;

public class detectCapitalUse_520 {
    public static boolean detectCapitalUse(String word){
        boolean dc = true;
        char[] cWord = word.toCharArray();
        if (cWord.length == 1)
            return dc;
        else if (cWord.length == 2){
            if (cWord[0] >= 'a' && cWord[0] <= 'z'
                    && cWord[1] >= 'A' && cWord[1] <= 'Z')
                return false;
        }
        else {
            if (cWord[0] >= 'a' && cWord[0] <= 'z'){
                for (int i = 1;i < cWord.length;i++){
                    if (cWord[i] > 122 || cWord[i] < 97){
                        dc = false;
                        break;
                    }
                }
            }
            else if (cWord[0] >= 'A' && cWord[0] <= 'Z'){
                if (cWord[1] >= 'a' && cWord[1] <= 'z'){
                    for (int i = 2;i < cWord.length;i++){
                        if (cWord[i] > 'z' || cWord[i] < 'a'){
                            dc = false;
                            break;
                        }
                    }
                }
                else if (cWord[1] >= 'A' && cWord[1] <= 'Z'){
                    for (int i = 2;i < cWord.length;i++){
                        if (cWord[i] > 'Z' || cWord[i] < 'A'){
                            dc = false;
                            break;
                        }
                    }
                }
            }
        }
        return dc;
    }

    public static void main(String[] args){
        String word = "A";
        System.out.println(detectCapitalUse(word));
    }
}
