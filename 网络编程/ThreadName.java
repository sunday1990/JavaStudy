import java.lang.Thread;
import java.lang.Runnable;

public class ThreadName{
	static int method = 2;
	public static void main(String[] args) {
		if (method == 1) {
			//设置名字的第一种方式，通过构造函数，传入名字
			new Thread("xxxx"){
				public void run(){
					for(int i = 0; i < 1000; i++) {
	           			 System.out.println(this.getName() + "....aaaaaaaaaaaaaaaaaaaaaaa");
	        		}
				}
			}.start();
		}else if(method == 2){
			//设置名字的第二种方式，通过setName（String）方法
			Thread t1 = new Thread(){
				public void run(){
					 for(int i = 0; i < 1000; i++) {
          				  System.out.println(this.getName() + "....aaaaaaaaaaaaaaaaaaaaaaa");
      				  }
				}
			};
			t1.setName("芙蓉姐姐");
			t1.start();
		}			

	}
}



/*
线程：设置名字与获取名字

	* 1、通过getName()方法获取线程对象的名字
	* 2、设置名字
		**通过构造函数可以传入string类型的名字
		**通过setName(String)方法可以设置线程对象的名字

*/