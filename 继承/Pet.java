public class Pet{
	//公共参数
	public String name;
	public int health;
	public int love;
	{
		name = "";
		health = 60;
		love = 0;
	}
	//构造方法
	Pet(String n,int h,int l){
		name = n;
		health = h;
		love = l;
		System.out.println("a pet is created");
	}

	//公共方法
	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setHealth(int h){
		health = h;
	}

	public int getHealth(){
		return health;
	}


	public void setLove(int l){
		love = l;
	}

	public int getLove(){
		return love;
	}
}