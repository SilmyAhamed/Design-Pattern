package main;

public class Laptop extends Device {

	private int numberOfStock;
	
	public int getNumberOfStock() {
		return numberOfStock;
	}
	
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	
	@Override
	public String toString() {
		return "Laptop{NumberOfStock " + numberOfStock +" }";
	}
}
