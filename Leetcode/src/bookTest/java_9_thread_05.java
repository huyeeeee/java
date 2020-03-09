package bookTest;

public class java_9_thread_05 {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyThread1(),"a");
        Thread t2 = new Thread(new MyThread1(),"b");
        Thread t3 = new Thread(new MyThread1(),"c");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 5;i++){
            try{
                Thread.sleep(500);
            }catch (InterruptedException e1){}
            System.out.println(Thread.currentThread().getName()
                 + "run, i = " + i);

        }
    }
}
