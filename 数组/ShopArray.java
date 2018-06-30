import java.util.*;

public class ShopArray{

	static float[] amount;
	static int index;
	static Scanner input;

	public static void main(String[] args) {
		//初始化数据
		amount = new float[5];
		index = 0;
		input = new Scanner(System.in);		
		//提示
		ShopArray.tip();
		//插入数据
		ShopArray.insertData(0);
	}

	public static void tip(){
		System.out.println("请输入会员本月的消费记录");
	}

	public static void insertData(int currentIndex){
		if (currentIndex<5) {
			System.out.println("请输入第"+(currentIndex+1)+"笔购物金额:");
			amount[currentIndex] = input.nextInt();
			currentIndex++;
			insertData(currentIndex);
		}else{
			System.out.println("序号        金额（元）");
			int sum = 0;
			for (int i = 0;i<amount.length;i++ ) {
				sum += amount[i];
				System.out.println((i+1)+"       "+amount[i]);
			}
			System.out.println("总金额        "+sum);
		}
	} 
	

}