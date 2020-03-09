import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
/**
 * 三个售票员，30张票
 * 企业级代码
 * 高内聚低耦合前提下：
 * 线程	操作		资源类
 */

class Ticket{
	private int number = 30;
	Lock lock = new ReentrantLock();

	public void sale()
	{
		lock.lock();
		try {
			if (number > 0){
				System.out.println(Thread.currentThread().getName()+"卖出第："+(number--)+"还剩："+number);
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
public class jucDemo01 {
	public static void main(String[] args){

		Ticket t = new Ticket();

		new Thread(()->{for (int i = 0;i < 40;i++) t.sale();},"A").start();
		new Thread(()->{for (int i = 0;i < 40;i++) t.sale();},"C").start();
		new Thread(()->{for (int i = 0;i < 40;i++) t.sale();},"B").start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0;i < 40;i++){
//					t.sale();
//				}
//			}
//		}, "A").start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0;i < 40;i++){
//					t.sale();
//				}
//			}
//		}, "B").start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0;i < 40;i++){
//					t.sale();
//				}
//			}
//		}, "C").start();


	}
}
