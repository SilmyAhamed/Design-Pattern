package main;

public class SectionHeadPackage extends Package {

	@Override
	protected void createPackage() {
		offers.add(new MealOffer());
		offers.add(new TransportOffer());
		offers.add(new AccommodationOffer());
	}
}
