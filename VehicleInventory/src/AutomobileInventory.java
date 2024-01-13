import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AutomobileInventory {
	
	private static ArrayList<Automobile> inventory = new ArrayList<>();
		
	public static void main(String[] args) {
				
		Scanner scnr = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 - Add Vehicle.");
			System.out.println("2 - Remove Vehicle.");
			System.out.println("3 - Update Vehicle.");
			System.out.println("4 - Exit.");
			
			int choice = scnr.nextInt();
			
			switch (choice) {
				case 1:
					addVehicle();
					break;
				case 2:
					removeVehicle();
					break;
				case 3:
					updateVehicle();
					break;
				case 4:
					System.out.println("HAVE A NICE DAY!");
					System.exit(0);
				default:
					System.out.println("Invalid choice, try again!");
					System.out.println();
			}
			
		}
		
    }
	
	// list the Vehicle inventory
	private static String listInventory() {
		StringBuilder modifyList = new StringBuilder();
		modifyList.append("Vehicle inventory: ");
		System.out.println();
		
		for (Automobile auto : inventory) {
			modifyList.append(auto.listValues()).append("\n");
		}
		return modifyList.toString();
	}
	
	// add Vehicle method
	private static void addVehicle() {
				
		Scanner scnr = new Scanner(System.in);
		Automobile auto = new Automobile();
		
		System.out.println("Enter make: ");
		String make = scnr.nextLine();
		
		auto.setMake(make);
		
		System.out.println("Enter model: ");
		String model = scnr.nextLine();
		auto.setModel(model);
		
		System.out.println("Enter color: ");
		String color = scnr.nextLine();
		auto.setColor(color);
		
		System.out.println("Enter year: ");
		int year = scnr.nextInt();
		auto.setYear(year);
		
		System.out.println("Enter mileage: ");
		int mileage = scnr.nextInt();
		auto.setMileage(mileage);
		
		// adding vehicle to inventory
		inventory.add(auto);
		System.out.println();
		System.out.println("Vehicle was added successfully!");
		System.out.println();
		System.out.println(listInventory());
		System.out.println();
		
		// creating print method to print to .txt file
		PrintWriter writer;
		Scanner data = new Scanner(System.in);
		System.out.println("Would you like to print the data to a file (Y or N)? ");
		String response = data.nextLine();
		
		// print to file if response is "Y" otherwise Data will not be printed to txt file
		if (response.equalsIgnoreCase("Y")) {
			
			try {
				writer = new PrintWriter("auto.txt");
				writer.println("Make: " + auto.getMake());
				writer.println("Model: " + auto.getModel());
				writer.println("Color: " + auto.getColor());
				writer.println("Year: " + auto.getYear());
				writer.println("Mileage: " + auto.getMileage());
				
				System.out.println("Vehicle information was printed to file successfully!");
				System.out.println();
				writer.close();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("Data will not be printed to file.");
			System.out.println();
		}
		
	}
	
	// update Vehicle
	public static void updateVehicle() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the vehicle you would like to update: ");
		System.out.println("Enter make: ");
		String make = scnr.nextLine();
		System.out.println("Enter model: ");
		String model = scnr.nextLine();
		System.out.println("Enter color: ");
		String color = scnr.nextLine();
		System.out.println("Enter year: ");
		int year = scnr.nextInt();
		System.out.println("Enter mileage: ");
		int mileage = scnr.nextInt();
		
		// remove vehicle if inventory matches otherwise display Vehicle not in inventory
		boolean updateVehicle = inventory.removeIf(auto -> auto.getMake().equals(make) && 
													auto.getModel().equals(model) && 
													auto.getColor().equals(color) && 
													auto.getYear() == year && 
													auto.getMileage() == mileage);
		
		Automobile newAuto = new Automobile();
		
		if (updateVehicle) {					
			System.out.print("Enter new make ");
			String newMake = scnr.nextLine();
			newAuto.setMake(newMake);
			
			System.out.print("& enter new model: ");
			String newModel = scnr.nextLine();
			newAuto.setModel(newModel);
			
			System.out.print("Enter new color: ");
			String newColor = scnr.nextLine();
			newAuto.setColor(newColor);
			
			System.out.print("Enter new year: ");
			int newYear = scnr.nextInt();
			newAuto.setYear(newYear);
			
			System.out.print("Enter new mileage: ");
			int newMileage = scnr.nextInt();
			newAuto.setMileage(newMileage);
			
			System.out.println();
			System.out.print("Vehicle was updated successfully!");
			System.out.println();
			inventory.add(newAuto);
			System.out.println(listInventory());
		}
		else {
			System.out.println();
			System.out.println("Vehicle was not in inventory.");
			System.out.println();
		}
		
		
	}
	
	// remove vehicle method
	public static void removeVehicle() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the vehicle you would like to remove: (make, model, color, year, mileage)");
		System.out.println();
		String make = scnr.nextLine();
		String model = scnr.nextLine();
		String color = scnr.nextLine();
		int year = scnr.nextInt();
		int mileage = scnr.nextInt();
		
		// remove vehicle if inventory matches otherwise display Vehicle was not in stock
		boolean removeVehicle = inventory.removeIf(auto -> auto.getMake().equals(make) && 
													auto.getModel().equals(model) && 
													auto.getColor().equals(color) && 
													auto.getYear() == year && 
													auto.getMileage() == mileage);
		
		if (removeVehicle) {
			System.out.println();
			System.out.println("Vehicle was removed successfully!");
			
		}
		else {
			System.out.println();
			System.out.println("Vehicle was not in inventory.");
		}
		System.out.println(listInventory());
		
	}
	
	
}
	


		




	



	

