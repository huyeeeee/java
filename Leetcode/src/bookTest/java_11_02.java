package bookTest;

public class java_11_02 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0;i < 30000000;i++){
            sum += i;
        }
//        System.getProperties().list(System.out);
        System.out.println(System.getProperty("os.name"));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
