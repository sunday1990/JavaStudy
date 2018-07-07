import java.lang.Thread;
import java.lang.Runnable;
public class ThreadSynchronized{
	public static void main(String[] args) {
		Printer p = new Printer();
		Thread t1 = new Thread(){
			public void run(){
				for (int i = 0;i<10 ;i++) {
					p.print1();
				}				
			}
		};

		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0;i<10 ;i++) {
					p.print2();
				}				
			}
		};
		t1.start();
		t2.start();
	}
}

class Printer{
	Demo d = new Demo();
	public static void print1(){
		synchronized (Printer.class){
			System.out.println("我");
			System.out.println("叫");
			System.out.println("刘");
			System.out.println("小");
			System.out.println("燕");			
		}
	}

	public static void print2(){
		synchronized (Printer.class){
			System.out.println("我");
			System.out.println("叫");
			System.out.println("张");
			System.out.println("大");
			System.out.println("超");			
		}
	}

}

class Demo{
	public Demo(){

	}
}





/*
* 什么情况下需要同步
	** 当多线程并发，有多段代码同时执行时，我们希望某一段代码执行的过程CPU不要切换到其他线程工作，这就需要同步
	** 如果两段代码是同步的，那么同一时间只能执行一段，在一旦代码没有之行结束前，不会执行另外一段代码
* 同步代码块
	**使用synchronized关键字加上一个锁对象，来定义一段代码，叫做同步代码块
	**多个同步代码块如果使用相同的锁对象，那么他们就是同步的
//锁对象可以是任意对象,但是被锁的代码需要保证是同一把锁,不能用匿名对象
*/