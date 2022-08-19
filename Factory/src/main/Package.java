package main;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {

	protected List<Offer> offers = new ArrayList<>();
	
	public Package() {
		createPackage();
	}
	
	protected abstract void createPackage();
	
	@Override
	public String toString() {
		return "Package{ Offer " + offers + "}";
	}
}
