import java.util.*;
public class InputCard{
	public static void main(String[] args) {
		System.out.println("请输入4位会员卡号");	
		//创建Scanner对象
		Scanner input = new Scanner(System.in);
		//获取键盘输入的数据
		int now = input.nextInt();		
		System.out.println("会员卡号是"+now);
		//定义整形变量
		int qianwei;
		int baiwei;
		int shiwei;
		int gewei;
		int count;

		qianwei = now/1000;
		baiwei = (now%1000)/100;
		shiwei = (now - qianwei * 1000- baiwei*100)/10;
		gewei = now%10;
		
		System.out.println("千位数："+qianwei+", 百位数:"+baiwei+" 十位数："+shiwei+"，个位数:"+gewei);
		
		count = qianwei+baiwei+shiwei+gewei;

		System.out.println("会员卡号"+now+"各位之和："+count);

		if (count>20) {
			System.out.println("会员卡号"+now+"的会员，您中奖了，奖品是MP3");
		}else{
			System.out.println("会员卡号"+now+"的会员，很遗憾，您未能中奖");
		}
		
	}
}