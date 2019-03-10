package demo2;

public class DayInfo extends Info {

	public void nextDay() {
		System.out.println("Tomorrow will be Monday");
	}

	public static void main(String[] args) {
		DayInfo obj = new DayInfo();
		obj.nextDay();
		obj.day();
	}

}
