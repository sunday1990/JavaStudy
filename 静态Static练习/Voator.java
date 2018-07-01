public class Voator{
	public static int totalCount;
	{
		totalCount = 0;
	}

	public static void vote(){
		totalCount++;
		System.out.println("第"+totalCount+"次投票");
	}
}