package main;

public class Application {

	public static void main(String[] args) {
		
		VAT vat = new VAT();
		NBT nbt = new NBT();
		BTT btt = new BTT();
		SSF ssf = new SSF();
		Tax tax = new Tax();
		
		tax.setSuccossor(vat);
		vat.setSuccossor(nbt);
		nbt.setSuccossor(btt);
		btt.setSuccossor(ssf);
		
		Invoice invoice = new Invoice(1, 50);
		System.out.println(tax.applyTax(invoice));
		
		Invoice invoice2 = new Invoice(2, 150);
		System.out.println(tax.applyTax(invoice2));
		
		Invoice invoice3 = new Invoice(2, 250);
		System.out.println(tax.applyTax(invoice3));
		
		Invoice invoice4 = new Invoice(2, 350);
		System.out.println(tax.applyTax(invoice4));
		
		Invoice invoice5 = new Invoice(2, 450);
		System.out.println(tax.applyTax(invoice5));
		
		Invoice invoice6 = new Invoice(2, 550);
		System.out.println(tax.applyTax(invoice6));
	}
}
