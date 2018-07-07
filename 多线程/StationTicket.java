import java.lang.Thread;
import java.lang.Runnable;

public class StationTicket{
	public static void main(String[] args) {
		/*
			100张票，4个窗口卖完
		*/
		TicketsSeller t1 = new TicketsSeller();

		TicketsSeller t2 = new TicketsSeller();

		TicketsSeller t3 = new TicketsSeller();

		TicketsSeller t4 = new TicketsSeller();

		t1.setName("窗口1");

		t2.setName("窗口2");

		t3.setName("窗口3");

		t4.setName("窗口4");

		t1.start();

		t2.start();

		t3.start();

		t4.start();

	}
}

class TicketsSeller extends Thread{
	private static int tickets = 100;
	static Object obj = new Object();
	public TicketsSeller(){
		super();
	}


	public TicketsSeller(String name){
		super(name);
	}

	public void run(){
		while(true){
			synchronized(obj){
				if (tickets <= 0) {
					break;
				}
				try{
					System.out.println(getName()+"号窗口正在卖票");
					Thread.sleep(100);//线程睡0.1秒，模拟耗时操作
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(getName()+"...这是第"+tickets--+"号票");
			}
		}
	}
}


/*
多线程并发操作同一数据时, 就有可能出现线程安全问题
使用同步技术可以解决这种问题, 把操作数据的码进行同步, 不要多个线程一起操作

但是会变慢，有木有！

*/
