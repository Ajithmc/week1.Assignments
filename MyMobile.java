package week1.Assignment;
	//Assignment 1
public class MyMobile {
	String Brand = "OnePlus..";
	long num = 9923465700l ;
	public void makeCall() {
		System.out.println("Make a Call...");
	}
	public void sendMsg() {
		System.out.println("Send a Message..");
	}
	private void payBills() {
		System.out.println("Pay mobile Bills...");
	}
	public static void main(String[] args) {
		MyMobile mob = new MyMobile();
		mob.makeCall();
		mob.sendMsg();
		mob.payBills();
		System.out.println(mob.Brand);
		System.out.println(mob.num);
	}
}
