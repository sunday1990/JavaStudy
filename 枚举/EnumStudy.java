enum Genders{
	Male,
	Female
}

public class EnumStudy{
	static Genders sex;
	public static void main(String[] args) {
		EnumStudy e = new EnumStudy();
		// e.sex = "hello";//不兼容的类型: String无法转换为Genders
		// e.sex = 0;//不兼容的类型: Int无法转换为Genders
		e.sex = Genders.Male;//如果Genders前面有public的话，会报错，去掉后就好了
		System.out.println("性别是"+e.sex);//性别是Male
	}
}