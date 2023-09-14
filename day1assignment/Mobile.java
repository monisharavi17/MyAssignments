package day1assignment;

public class Mobile {
public void sendmessage() {
	System.out.println("sendMessage");
}
public void sharedocument() {
	System.out.println("shareDocument");
}
public void makecall() {
	System.out.println("makeCall");
}
public static void main(String[] args) {
	Mobile vivo = new Mobile();
	vivo.sendmessage();
	vivo.sharedocument();
	vivo.makecall();
}
}
