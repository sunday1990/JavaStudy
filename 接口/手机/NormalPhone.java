public class NormalPhone extends TelPhone implements NormalPhoneInterface{
	public static void main(String[] args) {
		System.out.println("初始化了一个普通手机");
	}
	
	@Override
	public void sendMessage(){
		System.out.println("普通手机发送短信");
	}

	@Override
	public void makeCall(){
		System.out.println("普通手机打电话");
	}
	
	//Interface
	public void playVoice(){
		System.out.println("普通手机 播放声音");	
	}


}