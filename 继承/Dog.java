public class Dog extends Pet{
	private String strain;
	
	{
		strain = "";
	}

	Dog(String n,int h,int l,String s){
		super(n,h,l);
		this.strain = s;
		System.out.println("a dog is created");
	}

	public void setStrain(String s){
		strain = s;
	}

	public String getStrain(){
		return strain;
	}

	


}