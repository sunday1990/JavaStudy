import java.util.*;
public class ErrorTest{

	public static void main(String[] args) throws Exception{
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入被除数");
			int num1 = scan.nextInt();

			System.out.println("请输入除数");
			int num2 = scan.nextInt();

			System.out.println(num1+"/"+num2+"="+num1/num2);
			System.out.println("感谢使用本程序");
		}catch(Exception e){
			System.out.println("出现错误：被除数和除数必须是整数 ");
			e.printStackTrace();
			// return;//有没有return都会执行finally，只有一种情况会不执行，那就是退出了Java虚拟机
			// System.exit(1);
		}finally{
			System.out.println("最后的一句话，不论异常与否，都会执行这句话，退出虚拟机的情况除外");
		}
	}
}


/*
Java中如何进行异常处//有没有return都会执行finally理
try-catch-finally
	*try:执行可能会产生异常的代码
	*catch:捕获异常
	*finally无论是否发生异常，代码总能执行，在catch中return也无效
throw
	*手动抛出异常
throws
	*生命方法可能要抛出的各种异常
*/