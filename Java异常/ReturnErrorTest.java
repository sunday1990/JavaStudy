public class ReturnErrorTest{
	public static void main(String[] args) {
		int y = testEx();
		System.out.println(y);
	}

	public static int testEx(){
		int x = 10;
		try{
			x = 20;
			System.out.println(10/1);
			x = 30;
			return x;
		}catch(Exception e){
			e.printStackTrace();
			x = 50;
			return x;
		}finally{
			x = 100;
			System.out.println("final中的代码执行完了");
			// return x;//finally中最好不要有返回，不然会影响正常的返回数据
		}
	}
}


/*
结果为50
分析：
1、try中代码异常，进入catch,不会给x赋值30
2、catch中，打印堆栈，赋值为50，并返回
3、finally是在return后面的表达式运算后，才执行的，此时并没有返回运算后的值
，而是先把要返回的值保存起来，不论finally中的代码怎么样，
返回的值都不会改变，仍然是之前保存的值，函数返回值是在finally执行前就
确定的。
4、finally中，最好不要有return，否则程序会提前退出，返回值不是try或者catch中的返回值
5、带return的执行顺序：
	*try->catch(在执行return前执行final，但是此时虽然没有返回值，但是返回的至已经保存起来了，不论
	final代码咋样，都不会改变)，上面的执行结果为
		/**	：
		10
		final中的代码执行完了
		30
		只要在final中不return，就是正常的
		**/


// */