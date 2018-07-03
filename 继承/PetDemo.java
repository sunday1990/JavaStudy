import java.util.*;
public class PetDemo{	
	public static Scanner scan;
	public static String petname;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		petname = ""; 

		//宠物的名字
		System.out.println("欢迎您来到宠物店");
		System.out.println("请输入您要领养的宠物的名字:");
		//获取宠物名字
		petname = scan.next();

		//宠物类别
		int petType;
		System.out.println("请选择您要领养的宠物类型：（1、狗狗  2、企鹅）:");
		petType = scan.nextInt();

		if (petType == 1) {
			//狗狗
			Dog dog = new Dog("拉布拉多",80,80,"棕色");
			System.out.println(dog.getName()+dog.getHealth()+dog.getLove()+dog.getStrain());
			
		}else if(petType == 2){
			//企鹅


		}
	}
}