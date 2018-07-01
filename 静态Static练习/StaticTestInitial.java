public class StaticTestInitial{
	public static void main(String[] args) {
		int num = StaticTest.num;
		StaticTest test = new StaticTest();
		System.out.println(test.num);

		StaticTest test1 = new StaticTest();
		System.out.println(test1.num);
	
	}
}