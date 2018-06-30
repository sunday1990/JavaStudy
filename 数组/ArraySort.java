import java.util.*;

public class ArraySort{

	static int[][]scores;

	static Scanner scanner;

	public static void main(String[] args) {
		scores = new int[3][5];
		scanner = new Scanner(System.in);
		ArraySort.inputScore(0,0);
	}

	public static void inputScore(int grade,int index){
		if (grade<3) {
			if (index == 0) {
				System.out.println("*******第"+(grade + 1)+"个班*******");	
			}
			System.out.println("请输入第"+(index+1)+"个学生的成绩:");	
			int score = scanner.nextInt();
			scores[grade][index] = score;
			if (index == 4) {
				grade++;
				index=0;
			}else{
				index++;
			}
			inputScore(grade,index);
		}else{
			//总成绩
			System.out.println("******成绩总计*******");	
			for (int i = 0;i<3 ;i++ ) {
				int sum = 0;
				for (int j = 0;j<5;j++ ) {
					sum += scores[i][j];					
				}
				System.out.println((i+1)+"班总成绩："+sum);
			}
		}
	}

}