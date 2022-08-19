package main;

public class StudentPackage extends Package {

	@Override
	protected void createPackage() {
		offers.add(new MealOffer());
	}
}
