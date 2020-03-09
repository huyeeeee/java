package niuke;

public class twoDimensionArraySearch {
    public static boolean Find(int target, int [][] array) {
        if (array.length == 0 || array[0].length == 0)
            return false;
        for (int i = 0;i < array.length;i++){
            if (target <= array[i][array[0].length - 1]){
                for (int j = 0;j < array[0].length;j++){
                    if (target == array[i][j])
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int array[][] = new int[][]{{1,2,8,9},{4,7,10,13}};
        int target = 7;
        System.out.println(Find(7,array));
//        System.out.println(array.length);
    }
}
