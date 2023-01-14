import java.util.Date;

public class Reservation {
	private final int reservationID;
	private Customer customerObj;
	private Vehicle vehicleObj;
	private String contractStatus;
	private Date bookingDate;
	private Date releaseDate;
	private static int reservationCount=0;
	
	public Reservation(Customer customerObj, Vehicle vehicleObj) {
		this.customerObj = customerObj;
		this.vehicleObj = vehicleObj;
		reservationCount++;
		this.reservationID=reservationCount;
	}

	public Reservation(String customerName, long phone, Vehicle vehicleObj) {
		this.customerObj = new Customer(customerName, phone);
		this.vehicleObj = vehicleObj;
		reservationCount++;
		this.reservationID=reservationCount;
	}

	public Reservation(String customerName, String email, Vehicle vehicleObj){
		this.customerObj = new Customer(customerName, email);
		this.vehicleObj = vehicleObj;
		reservationCount++;
		this.reservationID=reservationCount;
	}

	public Reservation(String customerName, String email, long phone, Vehicle vehicleObj){
		this.customerObj = new Customer(customerName, email, phone);
		this.vehicleObj = vehicleObj;
		reservationCount++;
		this.reservationID=reservationCount;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}
	
	public String releaseContract(){
		if(bookingDate.compareTo(releaseDate)==0 && vehicleObj.getKeyStatus().compareTo("available")==0)
			return vehicleObj.updateKeyStatus();
		else
			return "Vehicle not avaible";
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public Vehicle getVehicleObj() {
		return vehicleObj;
	}

	public int getReservationID() {
		return reservationID;
	}
	
}
