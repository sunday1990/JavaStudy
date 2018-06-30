import java.util.*;
public class ArrayPractice{
	public static void main(String[] args) {
		int[]array = {8,4,2,1,23,344,12};
		int sum = 0;
		for (int item :array ) {
			sum += item;			
		}
		System.out.println("数列中所有数值的和为"+sum);

		int input;
		System.out.println("请输入一个数字，判断在不在数组中");


		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		boolean bingo = false;
		for (int item :array ) {
			if (input == item) {
				bingo = true;
			}	
		}

		if (bingo) {
			System.out.println("恭喜你猜对了");

		}else{
			System.out.println("很遗憾,猜错了");

		}
	}
}