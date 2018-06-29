public class Initial{
	public static void main(String[] args) {
		SmartPhone sPhone = new SmartPhone();
		NormalPhone nPhone = new NormalPhone();
		//智能手机
		sPhone.sendMessage();
		sPhone.makeCall();
		sPhone.netSurf();
		sPhone.playVideo();
		sPhone.takePhoto();
		//普通手机
		nPhone.sendMessage();
		nPhone.makeCall();
		nPhone.playVoice();
	}
}