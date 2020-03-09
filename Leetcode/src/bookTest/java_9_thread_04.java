package bookTest;

public class java_9_thread_04 {
    public static void main(String[] args){
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        Thread t1 = new Thread(m1);
        t1.start();
        System.out.println(t1.isAlive());
        System.out.println(t1.getPriority());
        t1.setName("thread 1");
        System.out.println(t1.getPriority());
        t1.setPriority(2);
        t1.yield();
        System.out.println(t1.isInterrupted());


    }

}
class MyThread implements Runnable{
    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0;i < 100;i++){
            if (ticket > 0)
                System.out.println(ticket-- + "tickets have sold out");
        }
    }
}