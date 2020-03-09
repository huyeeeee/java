package bookTest;

public class java_4_1 {
    public static void main(String[] args){
        System.out.println("Start");
        int a = 10;
        int b = 0;
        int[] c = {1,2,3};
        assert c.length == 1;
        try {
            int temp = a/b;
            System.out.println("two numbers cal");
        }catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println("exception : " + e);
        }
        finally {
            System.out.println("End");
        }
    }
}
