public class Penguin extends Pet{
	private String sex;
	{
		sex = "";
	}

	Penguin(){
		System.out.println("a Penguin is created");		
	}

	public void setSex(String s){
		sex = s;
	}

	public String getSex(){
		return sex;
	} 
}