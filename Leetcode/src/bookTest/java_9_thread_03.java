/**
 * 为了测试Thread 和 Runnable 之间的区别
 */
package bookTest;

public class java_9_thread_03 {
    public static void main(String[] args){
        /*MyThread_01 mt1 = new MyThread_01();
        MyThread_01 mt2 = new MyThread_01();
        MyThread_01 mt3 = new MyThread_01();

        mt1.start();
        mt2.start();
        mt3.start();
        */

        MyThread_02 mt4 = new MyThread_02();
        new Thread(mt4).start();
        new Thread(mt4).start();
        new Thread(mt4).start();
    }

}

class MyThread_01 extends Thread{
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0;i < 100;i++){
            if (ticket > 0){
                System.out.println("买票：ticket = " + ticket--);
            }
        }
    }
}

class MyThread_02 implements Runnable{
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0;i < 100;i++){
            if (ticket > 0){
                System.out.println("买票：ticket = " + ticket--);
            }
        }
    }
}