public class Customer {
	
	private final int customerID;
	private String email;
	private String custName;
	private long phone;
	private String city;
	private static int customerCount=0; 
	
	public Customer()
	{
		customerCount++;
		this.customerID=customerCount;
	}
	
	public Customer(String custName, String email) {
		this();
		this.custName = custName;
		this.email=email;
	}
	
	public Customer(String custName, long phone) {
		this();
		this.custName = custName;
		this.setPhone(phone);
	}
	
	public Customer(String custName, String email, long phone) {
		this();
		this.custName = custName;
		this.email=email;
		this.setPhone(phone);
	}

	public String getcustName() {
		return custName;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		
		if(phone >= 0000000000L && phone <= 9999999999L)
			this.phone = phone;
		else
			this.phone = 9999999999L;
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public int getcustomerID() {
		return customerID;
	}
	
	public String toString()
	{
		return "[ID: "+ getcustomerID()+ ", Name: "+getcustName()+
				", Email: "+getEmail()+", Phone: "+getPhone()+ ", City: "+getCity()+" ]";
	}
}
