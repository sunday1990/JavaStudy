public class SmartPhone extends TelPhone implements SmartPhoneInterface{

	@Override
	public void sendMessage(){
		System.out.println("智能手机发送短信");
	}


	@Override
	public void makeCall(){
		System.out.println("智能手机打电话");
	}

	//Interface
	public void netSurf(){
		System.out.println("上网冲浪");
	}
	public void playVideo(){
		System.out.println("播放视频");
	}
	public void takePhoto(){
		System.out.println("拍照");
	}

}