
import java.util.*;

public class Workflow{
	
	public static Goods[] goodsArray;
	public static Scanner scan;

	public static void main(String[] args) {
		goodsArray = new Goods[3];
		goodsArray[0] = new Goods("T恤",235.f);
		goodsArray[1] = new Goods("网球拍",200.f);
		goodsArray[2] = new Goods("网球鞋",100.f);
		scan = new Scanner(System.in);
		String flag = "y";
		int goodNum;
		while(flag.equals("y")){
			System.out.println("请选择购买的商品编号");
			for (int i = 0;i<goodsArray.length ;i++ ) {
				System.out.println((i+1)+"."+goodsArray[i].name+"    "+goodsArray[i].price);
			}
			System.out.println("请输入商品编号");
			goodNum = scan.nextInt();

			while(goodNum>3){
				System.out.println("商品编号输入错误，请重新输入");
				goodNum = scan.nextInt();
			}			
			Goods selectGood = goodsArray[goodNum-1];			
			System.out.println(selectGood.name+"    "+ selectGood.price);			
			System.out.println("是否继续（y/n）");			
			flag = scan.next();
			while(!flag.equals("y") && !flag.equals("n")){
				System.out.println("输入错误，请重新输入");	
				flag = scan.next();
			}
		}
		System.out.println("程序结束");			
	}
}











