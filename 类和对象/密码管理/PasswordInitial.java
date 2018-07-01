import java.util.*;

public class PasswordInitial{

	public static Scanner scan;
	public static Password user;
	public static String userName;
	public static String userPwd;
	public static void main(String[] args) {
		user = new Password("ccSunday","java");
		scan = new Scanner(System.in);
		userName = "";
		userPwd = "";

		while(!(user.userName.equals(userName) && user.userPwd.equals(userPwd))){
				System.out.println("请输入用户名：");
				userName = scan.next();
				if (userName.equals("n")) {
					break;	
				}				
				System.out.println("请输入密码：");
				userPwd = scan.next();

				if (user.userName.equals(userName) && user.userPwd.equals(userPwd)) {
					System.out.println("请输入新密码");
					userPwd = scan.next();
					user.userPwd = userPwd;
					System.out.println("修改密码成功，您的新密码为"+user.userPwd);
					break;
				}else{
					System.out.println("账号或密码输入错误，请重新输入");			
				}
		}
		System.out.println("退出程序");			
	}
}