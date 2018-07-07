
import java.lang.Thread;
import java.lang.Runnable;

public class ThreadStudy{
	static int method = 1;
	public static void main(String[] args) {
		if (method == 0) {
			MyThread mt = new MyThread();//4、创建自定义类的对象
			mt.start();					 //5、开启线程
			for(int i = 0; i < 50; i++) {
	            System.out.println("bb");
	        }
		}else{
			MyRunnable mr = new MyRunnable();//2-4、创建自定义对象
			Thread t = new Thread(mr);//2-5、将其当作参数传递给Thread的构造函数
			t.start();				//2-6、开启线程
			for(int i = 0; i < 3000; i++) {
            	System.out.println("bb");
        	}
		}
	}
}

//继承
class MyThread extends Thread{//1、定义类继承Thread
	public void run(){		  //2、重写run方法
	for (int i = 0;i<100 ;i++ ) {//将要执行的代码，写在run方法中
			System.out.println("aaaaa");
		}
	}
}

class MyRunnable implements Runnable{//2-1、定义类实现Runnable接口
	@Override
	public void run(){				//2-2、重写run方法
		for (int i = 0;i<3000 ;i++ ) {//2-3、将要执行的方法写在run方法中
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		}
	}
}



/*
1、创建线程的两种方式：
	*继承java.lang.Thread类
	*实现java.lang。Runnable接口

2、使用现成的步骤：
	* 定义线程
	* 创建县城对象
	* 启动线程
	* 终止线程

*/

/*继承方式：自定义线程的一般步骤*/
/*
1、重写run方法,但是线程启动的时候要调用start方法，会自动调用内部的run方法
2、把新县城要做的事情写在run方法中
3、创建线程对象
4、开启新县城，内部会自动执行run方法

*/


/*接口方式：实现Runnable接口*/

/*
1、定义类实现Runnable接口
2、实现run方法
3、把新线程要做的事情写在run方法中
4、创建自定义的Runnable的子类对象
5、创建thread对象，传入runnable
6、调用start()。开启新县城

*/


/*
并行与并发：
1、关于并行：两个任务同时进行，需要多核cpu支持
2、关于并发：两个任务按流执行，但间隔较短，感觉像是同时执行
*/























