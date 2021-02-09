package oopsAssignment;

import java.util.Random;

abstract class Medicine{
	double price;
	String expiryDate;
	public Medicine(double price, String expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}
	abstract void displayLabel();
	void getDetails()
	{
		System.out.println("Price of the medicine is:"+price+"expiry date is"+expiryDate);
		
	}
}
class Tablet extends Medicine{

	public Tablet(double price, String expiryDate) {
		super(price, expiryDate);
	}

	@Override
	void displayLabel() {
		System.out.println("store in a cool dry place");
		
	}
	
}
class Syrup extends Medicine{

	public Syrup(double price, String expiryDate) {
		super(price, expiryDate);
	}

	@Override
	void displayLabel() {
		System.out.println("Use before the expiry date");
		
	}
	
}
class Ointment extends Medicine{

	public Ointment(double price, String expiryDate) {
		super(price, expiryDate);
	}

	@Override
	void displayLabel() {
		System.out.println("for external use only");
		
	}
	
}
public class TestMedicine {

	public static void main(String[] args) {
		Random r=new Random();
		double a=Math.random()*4;
		int b=(int)a;
		switch(b)
		{
			case 1:
				Medicine m =new Syrup(10.00, "12-01-2022");
				m.displayLabel();
				break;
			case 2:
				Medicine m1=new Tablet(100.00,"12-01-2021");
				m1.displayLabel();
				break;
			case 3:
				Medicine m2=new Ointment(200.00,"23-01-2022");
				m2.displayLabel();
				break;
			
		}

	}

}
