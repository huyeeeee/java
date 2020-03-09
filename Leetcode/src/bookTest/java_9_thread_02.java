package bookTest;

public class java_9_thread_02 implements Runnable{
    private String name;
    public java_9_thread_02(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println(name + ", run, i=" + i);
        }
    }

    public static void main(String[] args){
        java_9_thread_02 j1 = new java_9_thread_02("thread A");
        java_9_thread_02 j2 = new java_9_thread_02("thread B");
        Thread t1 = new Thread(j1);
        Thread t2 = new Thread(j2);
        t1.start();
        t2.start();
    }
}
