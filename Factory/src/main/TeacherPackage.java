package main;

public class TeacherPackage extends Package {

	@Override
	protected void createPackage() {
		offers.add(new MealOffer());
		offers.add(new TransportOffer());
	}
}
