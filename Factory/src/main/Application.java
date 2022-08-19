package main;

public class Application {

	public static void main(String[] args) {
		
		Package package01 = PackageFactory.createPackage(PackageCode.TEACHER);
		System.out.println(package01);
	}
}
