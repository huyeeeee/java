public class question {
    public static void main(String[] args){
        int[][] arr = new int[2][3];
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[0].length;j++){
                arr[i][j] = i;
            }
        }
        System.out.println(arr[1][1]);
    }
}
