package main;

public class Item {

	String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Item{Name=" + name + "}";
	}
}
