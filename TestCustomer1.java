package oopsAssignment;
class Address1{
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
	
	public Address1(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	void getAddressDetails()
	{
		String address;
		System.out.println("Ist Main HSR Layout, Bangalore");
		
	}
	
}
class Customer1{
	private String customerName;
	private Address1 residentialAddress;
	private Address1 officialAddress;
	Customer1(String customername, Address1 residentialAddress)
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

	public Address1 getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address1 residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public Address1 getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(String string, Address1 officialAddress) {
		this.officialAddress = officialAddress;
	}
	public void getCustomerDetails()
	{
		System.out.println("customername:"+customerName);
		System.out.println("Residential Address:"+residentialAddress.getAddressLine()+" "+residentialAddress.getCity());
		System.out.println("Official Address:"+officialAddress.getAddressLine()+" "+officialAddress.getCity());
		
	}

}
public class TestCustomer1 {

	public static void main(String[] args) {
		Address1 a=new Address1("Ist Main HSR Layout","Bangalore");
		Address1 b=new Address1("Ist Main Electronics city", "Bangalore");
		Customer1 c=new Customer1("john", a);
		c.getResidentialAddress();
		c.setOfficialAddress("john",b);
		c.getOfficialAddress();
		c.setCustomerName("John");
		c.getCustomerDetails();

	}

}
