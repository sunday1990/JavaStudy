
import java.util.*;
public class UserInitial{

	public static String name;
	
	public static int age;

	public static String flag;

	public static Scanner scan;

	public static void main(String[] args) {
		name = "";
		age = 0;	
		scan = new Scanner(System.in);
		
		while(!name.equals("n")){
		
			System.out.println("请输入姓名:");			
			
			name = scan.next();

			if (name.equals("n")) {
				break;
			}

			System.out.println("请输入年龄:");

			age = scan.nextInt();

			User user = new User(name,age);

			if (user.age >= 20) {
				System.out.println(user.name + "的年龄为： "+user.age+ ",门票价格为：20元");
			}else{
				System.out.println(user.name + "的年龄为："+user.age+",门票免费");
			}
		}
		System.out.println("退出程序");
	}
}