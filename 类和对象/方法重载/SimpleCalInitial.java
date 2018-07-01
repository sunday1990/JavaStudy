//方法重载 ，只要参数不同，就认为是不同的函数，不论访问修饰符和返回值有没有变化，这一点跟oc runtime中的objc_msg_send()，挺像，都是运用重载，一个函数名对应多个函数
public class SimpleCalInitial{
	public static void main(String[] args) {
		SimpleCal cal = new SimpleCal();
		System.out.println("两个整数相加"+cal.add(1,2));		
		System.out.println("两个浮点数相加"+cal.add(1.8f,2.4f,2.6f));
	}
}