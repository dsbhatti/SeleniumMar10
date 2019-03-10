package demo2;

public class DateInfo extends Info{
	
	
	public void todayDate() {
		System.out.println("It is 2nd March");
	}
	
	public void nextDate() {
		System.out.println("Tomorrow it will be 3rd March");
	}
	
	public static void main(String[] args) {
		DateInfo obj = new DateInfo();
		obj.day();
		obj.todayDate();
		obj.nextDate();
	}

}
