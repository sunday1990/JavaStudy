import java.lang.Thread;
import java.lang.Runnable;

public class ThreadGuard{
	public static void main(String[] args) {
		Thread	t1 = new Thread(){
			public void run(){
				for (int i = 0;i<50 ;i++ ) {
					System.out.println(getName()+"...aaaaaaa");
					try{
						Thread.sleep(10);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}				
			}
		};

		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0;i<5 ;i++ ) {
					System.out.println(getName()+".....bbbbbbb");
					try{
						Thread.sleep(10);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		//将t1设置为守护线程
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}
}

/*
设置一个线程为守护线程，该线程不会单独执行，当其他非守护线程都执行结束后，自动退出

执行结果为：
Thread-0...aaaaaaa
Thread-1.....bbbbbbb
Thread-0...aaaaaaa
Thread-1.....bbbbbbb
Thread-0...aaaaaaa
Thread-1.....bbbbbbb
Thread-1.....bbbbbbb
Thread-0...aaaaaaa
Thread-1.....bbbbbbb
Thread-0...aaaaaaa
Thread-0...aaaaaaa

*/