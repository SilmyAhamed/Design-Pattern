package main;

public class Application {

	public static void main(String[] args) {

		Registry registry = new Registry();

		// Here we getting value without using 'new' keyword
		Laptop laptop = (Laptop) registry.getDevice(DeviceType.LAPTOP);
		System.out.println(laptop);

		laptop.setNumberOfStock(18); // value changes here
		System.out.println(laptop);

		Laptop laptop01 = (Laptop) registry.getDevice(DeviceType.LAPTOP);
		System.out.println(laptop01);

		// Phone phone = (Phone) registry.getDevice(DeviceType.PHONE);
		// System.out.println(phone);
	}
}
