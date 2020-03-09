package bookTest;

public class java_11_01 {
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        System.out.println("max memory: " + rt.maxMemory());
        System.out.println("free memory: " + rt.freeMemory());
        //rt.gc();
        String a = "this is a Problem1!";
//        System.out.println(a);
        for (int i = 0;i < 10000;i++){
            a += i;
        }
        try {
            rt.exec("javac java_10_03.java && java java_10_03");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(rt.freeMemory());
        rt.gc();
        System.out.println(rt.freeMemory());
    }
}
