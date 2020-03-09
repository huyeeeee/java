package bookTest;

public class java_9_thread_01 extends Thread{
    private String name;
    public java_9_thread_01(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println(name + ", run, i=" + i);
        }
    }

    public static void main(String[] args){
        java_9_thread_01 j1 = new java_9_thread_01("thread A");
        java_9_thread_01 j2 = new java_9_thread_01("thread B");
        j1.start();
//        j1.start();
        j2.start();
    }
}
