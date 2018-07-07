import java.lang.Thread;
import java.lang.Runnable;

public class AbstractInnerThread{
	static int method = 1;
	public static void main(String[] args) {
		for(int i = 0; i < 50; i++) {
            System.out.println("bb");
        }	
        /*一、继承Thread类*/


		//1、new类（）{}继承这个类
		//2、重写run方法
		//3、将要执行的代码，写在run方法里	
		if (method == 0) {
		   new Thread(){
				public void run(){
					for (int i = 0; i<300; i++ ) {
						System.out.println("aaaaaaaaaa");
					}
				}
			}.start();
		}else{
	  	   /*二、实现runnable接口*/
	  	   //1、new 接口（）{}，实现这个接口
	  	   //2、重写run方法
	  	   //3、将要执行的代码，写在run方法中

	        new Thread(new Runnable(){
	        	public void run(){
	        		for (int i = 0; i<300; i++ ) {
						System.out.println("aaaaaaaaaa");
					}
	        	}
	        }).start();
		}
	}	
}