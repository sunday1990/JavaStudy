import java.lang.Thread;
import java.lang.Runnable;
public class ThreadJoin {
	public static void main(String[] args) {
		final Thread t1 = new Thread(){
			public void run(){
				for (int i = 0;i<50 ;i++ ) {
					System.out.println(getName()+".aaaaaaaa");
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
				for (int i = 0;i<50 ;i++ ) {
					if (i == 2) {
						try{

							t1.join();
							// t1.join(30);//插队，加入
							Thread.sleep(10);//加入，有固定的时间，过了固定时间，继续交替执行
						}catch(InterruptedException e){
							e.printStackTrace();
						}

					}
					System.out.println(getName()+"...bbbb");
				}
			}
		};

		t1.start();
		t2.start();

	}
}


/*
* join(),当前线程暂停，等待指定的线程执行结束后，当前线程再继续执行
* join(int),可以等待指定的毫秒之后继续执行

没有掌握
*/