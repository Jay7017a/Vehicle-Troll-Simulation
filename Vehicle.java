package vehicleTroll;

import java.util.Scanner;

public class Vehicle{
	Scanner sc= new Scanner(System.in);
	private String vehicleNumber;
	String vehicletype;
	double entryTime;
	
	
	public void setVehicleDetails(String vehicleNumber, String vehicletype, double entryTime) {
	
		this.vehicleNumber = vehicleNumber;
		this.vehicletype = vehicletype;
		this.entryTime = entryTime;
	
	}
	public void getVehicleDetails() {
		System.out.println();
		System.out.println("-------VEHICLE ENTERED------------");
		System.out.println();
		System.out.println("Vehicle Number : "+vehicleNumber);
		System.out.println("Vehicle Type : "+vehicletype);
		System.out.println("Entry Time : "+entryTime);
		System.out.println("status : Accepted");
	}
}
