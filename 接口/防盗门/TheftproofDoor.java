
public class TheftproofDoor extends AbstractDoor implements Lock,StrongLock,PhotoInterface{
	public static void main(String[] args) {
		System.out.println("初始化了一个防盗门");
	}	
	@Override
	public void openDoor(){
		System.out.println("开始开锁");		

		System.out.println("开门了");
	}

	@Override
	public void closeDoor(){
		System.out.println("关门了");
	}

	//lock interface 
	public void lock(){
		System.out.println("上锁");
	}

	public void unlock(){
		System.out.println("开锁");
	}
	
	//lock interface 
	public void strongLock(){
		System.out.println("强行上锁");
	}

	public void strongUnlock(){
		System.out.println("强行开锁锁");
	}
	
	//photo interface 
	public void takeAPhotoOfInviter(){
		System.out.println("拍照成功");	
	};

}