package vehicleTroll;

import java.util.Scanner;

public class Toll extends Payment {
	static double baseToll;
	static double peakHour;
	static double tollTotal;
	static Scanner sc = new Scanner(System.in);

	static void tollStart() {
		System.out.println();
		System.out.println("-------TOLL STARTED--------");

	}

	void vehicleTypecheck(String vehicletype) {
		if (vehicletype.equalsIgnoreCase("car")) {
			car();
			System.out.println(baseToll);
			tollCalculation(vehicletype);
		}
		else if (vehicletype.equalsIgnoreCase("bike")) {
			bike();
			tollCalculation(vehicletype);
		}
		else if (vehicletype.equalsIgnoreCase("bus")) {
			bus();
			tollCalculation(vehicletype);
		}
		else if (vehicletype.equalsIgnoreCase("auto")) {
			auto();
			tollCalculation(vehicletype);
		}
		else if (vehicletype.equalsIgnoreCase("truck")) {
			container();
			tollCalculation(vehicletype);
		}
		else if (vehicletype.equalsIgnoreCase("lorry")) {
			container();
			tollCalculation(vehicletype);
		}
		else if (vehicletype.equalsIgnoreCase("ambulance")) {
			ambulance();
			tollCalculation(vehicletype);
		}
		else if (vehicletype.equalsIgnoreCase("electricvehicle")) {
			electricvehicle();
			tollCalculation(vehicletype);
		}
		else if (vehicletype.equalsIgnoreCase("container")) {
			container();
			tollCalculation(vehicletype);
		}
		else if(vehicletype.equalsIgnoreCase("cycle")||vehicletype.equalsIgnoreCase("bullecot")||vehicletype.equalsIgnoreCase("policevehicle")||vehicletype.equalsIgnoreCase("governmentvehicle")) {
			tollCalculation(vehicletype);
		}
		else {
			tollCalculation(vehicletype);
			System.out.println(baseToll);
		}
		
	}

	static void tollCalculation(String vehicletype) {
		System.out.println();
		System.out.println("------TOLL CALCULATION-------");
		System.out.println();
		System.out.println("Vehicle Type : " + vehicletype);
		System.out.println("Base Toll : " + baseToll);
		System.out.println("peak Hour : " + peakHour);
		System.out.println("Total Toll : " + tollTotal);
		System.out.println("------------------------------");
	}

	static void car() {
		baseToll = 50;
		peakHour = 60;
		tollTotal = baseToll + peakHour;
		
	}

	static double bike() {
		baseToll = 20;
		peakHour = 20;
		tollTotal = baseToll + peakHour;
		return tollTotal;
	}

	static double auto() {
		baseToll = 30;
		peakHour = 36;
		tollTotal = baseToll + peakHour;
		return tollTotal;
	}

	static double van() {
		baseToll = 70;
		peakHour = 84;
		tollTotal = baseToll + peakHour;
		return tollTotal;
	}

	static double bus() {
		baseToll = 100;
		peakHour = 120;
		tollTotal = baseToll + peakHour;
		return tollTotal;
	}

	static double container() {
		baseToll = 200;
		peakHour = 240;
		tollTotal = baseToll + peakHour;
		return tollTotal;
	}

	static double ambulance() {
		baseToll = 0;
		peakHour = 0;
		tollTotal = baseToll + peakHour;
		return tollTotal;
	}

	static double electricvehicle() {
		baseToll = 30;
		peakHour = 36;
		tollTotal = baseToll + peakHour;
		return tollTotal;
	}

}
