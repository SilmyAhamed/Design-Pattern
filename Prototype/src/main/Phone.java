package main;

public class Phone extends Device {

	private String type;
	
	public String geType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Phone{Type " + type +" }";
	}
}
