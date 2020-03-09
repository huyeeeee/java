package bookTest;

public class java_9_thread_06 {
    public static void main(String[] args){
        MyThread2 mt = new MyThread2();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread2 implements Runnable{
    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0;i <100;i++){
            this.sale();
        }
    }

    public synchronized void sale(){
        if (ticket > 0){
            try {
                Thread.sleep(300);
            }catch (InterruptedException e1){
                e1.printStackTrace();
            }
            System.out.println("ticket:"+ticket--);
        }
    }
}
