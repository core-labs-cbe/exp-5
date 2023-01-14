import java.util.Scanner;
import java.util.Date;

public class TestDriver {

	public static void main(String[] args) {
		Vehicle vobj = new Vehicle(5678);
		Reservation rObjComposition = new Reservation("JKL", 999999999, vobj);
		rObjComposition.getCustomerObj().setCity("Coimbatore");
		rObjComposition.setBookingDate(new Date());
		rObjComposition.getVehicleObj().updateKeyStatus();
		}
	}
