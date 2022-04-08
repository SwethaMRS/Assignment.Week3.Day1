package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsapp()
	{
		System.out.println("Please connect whatsapp");
	}
	public void takeVideo()
	{
		System.out.println("Look at the camera in child class");
	}

	public static void main(String[] args) {
		
		SmartPhone amt=new SmartPhone();
		amt.connectWhatsapp();
		amt.takeVideo();
//		amt.sendMsg();
//		amt.makeCall();
//		amt.saveContact();
	}
}
