package bookTest;

public class java_10_03 {
    public static <T> T[] fun1(T...arg){
        return arg;
    }

    public static <T> void fun2(T param[]){
        for (T t : param)
            System.out.print(t + "、");
        System.out.println();
    }

    public static void main(String[] args){
        Integer i[] = fun1(1,2,3,4,5,6);
        fun2(i);
    }
}
