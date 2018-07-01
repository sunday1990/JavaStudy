import java.util.*;

public class PetStore{	
	static Scanner scan ;
	static Dog dog;
	public static void main(String[] args) {
		  //初始化
		  dog = new Dog();	
		  // dog.setKinds()
		  String petKinds[] = {"1、狗狗","2、企鹅"};
		  scan = new Scanner(System.in);
		   
		  System.out.println("欢迎您来到宠物店");

		  System.out.println("请输入要领养宠物的名字：");

		  String name = scan.next();
		  dog.setName(name);

		  System.out.println("请选择要领养的宠物类型：");
		  System.out.println(petKinds[0] + petKinds[1]);
		  int kind = scan.nextInt();
		  String varietyname;
		  if (kind == 1) {
		  			  System.out.println("请选择够够的品种：1、拉布拉多犬 2、雪纳瑞犬");

		  }else{
		  			  System.out.println("欢迎您来到宠物店");

		  }

 		  int variety = scan.nextInt(); 		  
 		  if (kind == 1 && variety == 1) {
 		  		varietyname = "拉布拉多";
 		  }	else{
 		  		varietyname = "雪纳瑞";
 		  }

		if (kind == 1) {
		  System.out.println("请输入狗狗的健康值");

		}else{
		  System.out.println("请输入企鹅的健康值");

		}
		 int healthy = scan.nextInt(); 		  
		 dog.setHealthy(healthy);

		 System.out.println("宠物的自白：");

		 System.out.println("我的名字叫"+dog.getName()+"健康值"+dog.getHealthy()+"和主人的亲密度是0"+"我是一只酷酷的"+varietyname);

	}  
}