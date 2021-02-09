package oopsAssignment;
class Address{
	private String addressLine;
	private String city;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	void getAddressDetails()
	{
		String address;
		System.out.println("Ist Main HSR Layout,Bangalore");
	}
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	
}
class Customer{
	private String customerName;
	private Address residentialAddress;
	Customer(String customername, Address residentialAddress)
	{
		this.customerName=customerName;
		this.residentialAddress=residentialAddress;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress(String string, Address ad) {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public void getCustomerDetails()
	{
		System.out.println("customername:"+customerName);
		System.out.println("Residential Address:"+residentialAddress.getAddressLine()+" "+residentialAddress.getCity());
		
	}
}
public class TestCustomer 
{

	public static void main(String args[])
	{
		Address a=new Address("Ist Main HSR Layout","Bangalore");
		Customer c=new Customer("john", a);
		c.setCustomerName("John");
		c.getCustomerDetails();
	}
}