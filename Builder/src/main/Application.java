package main;

public class Application {

	public static void main(String[] args) {
		
		CarTelescopic1 carTelescopic1 = new CarTelescopic1("full");
		System.out.println(carTelescopic1);
		
		CarTelescopic2 carTelescopic2 = new CarTelescopic2("full");
		System.out.println(carTelescopic2);
		
		Car.Builder builder = new Car.Builder("Full");
		Car car = builder.dropOffLocation("LA").roadAssistance("full").build();
		System.out.println(car);
	}
}
