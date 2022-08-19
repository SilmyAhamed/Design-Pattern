package main;

public abstract class Handler {

	protected Handler successor;
	
	public void setSuccossor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract double applyTax(Invoice invoice);
}
