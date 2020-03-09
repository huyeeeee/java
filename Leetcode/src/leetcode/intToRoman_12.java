package leetcode;

public class intToRoman_12 {
    public String intToRoman(int num){
        /**
         * I == 1
         * V == 5
         * X == 10
         * L == 50
         * C == 100
         * D == 500
         * M == 1000
         */
        String s = "";
        if (num >= 1000){
            for (int i = 0;i < num/1000;i++){
                s += "I";
            }
            s += "M";
            num = num % 1000;
        }
        if (num >= 500){
            s += "D";
            num = num - 500;
        }
        return s;
    }
}
