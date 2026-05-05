package vehicleTroll;

import java.util.Scanner;

public class vehicleMain extends Toll{
	static String yes="yes";
	static Scanner sc= new Scanner(System.in);
	private static String vehicleNumber;
	static String vehicletype;
	static double entryTime;
	static void addVehicle() {
		System.out.println("Enter Vehicle Number : ");
		vehicleNumber=sc.next();
		System.out.println("Enter Vehicle type : ");
		vehicletype=sc.next();
		System.out.println("Enter Vehicle entryTime : ");
		entryTime=sc.nextDouble();
		
	}
	public static void main(String[] args) {
		do {
		System.out.println();
		System.out.println("========================================");

		System.out.println("TOLL MANAGEMENT SYSTEM");
	
		System.out.println("=========================================");
		vehicleMain.addVehicle();
		Vehicle v1=new Vehicle();
		v1.setVehicleDetails(vehicleNumber,vehicletype,entryTime);
		v1.getVehicleDetails();
		Toll.tollStart();
		Toll t1=new Toll();
		t1.vehicleTypecheck(vehicletype);
		t1.selectPaymentMode(vehicletype);
	
		
	if(status.equalsIgnoreCase("SUCCESS")) {
		yes="yes";
	}
	
	}
		while(yes.equalsIgnoreCase("yes"));
}
}
