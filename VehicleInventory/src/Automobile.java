/* 

	START
	Initialize a private variable autoMake
	Initialize a private variable autoModel
	Initialize a private variable autoColor
	Initialize a private variable autoYear
	Initialize a private variable autoMileage
	
	CREATE METHOD autoMobile method that contains the parameters:
	autoMake, autoMobile, autoColor, autoYear, and autoMileage
	CREATE a autoArray[][] to store the variables and list the items from inventory
	
	FOR LOOP iterate over autoMake.length to store the product information
	Display Make
	Display Mobile
	Display Color
	Display Year
	Display Mileage
	Store information in array with userInput
	
	CREATE autoConstructor method that calls automobile method:
	FOR LOOP iterate over autoMake.length to print each item to the screen
	
	CREATE METHOD removeVehicle:
	TRY
	Clearing all vehicle information
	RETURN "Vehicle successfully removed."
	CATCH EXCEPTION
	RETURN "Error removing vehicle."
	
	CREATE METHOD newVehicle to add a new vehicle:
	TRY
	Get userInput and see if it matches autoMobile method
	Update autoMobile to inventory
	Return "Vehicle added to inventory!"
	CATCH EXCEPTION
	RETURN "Mismatch of information provided."
	
	CREATE METHOD listVehicle information:
	FOR LOOP to iterate over the autoMobiles
	RETURN Make: autoMake, Model: autoModel, Color: autoColor, Year: autoYear, Mileage: autoMileage
	
	CREATE METHOD updateVehicle that contains the parameters:
	newMAKE, newModel, newColor, newYear, newMileage
	RETURN Make: newMake, Model: newModel, Color: newColor, Year: newYear, Mileage: newMileage
	
	Calls the listVehicle method to print the vehicle information
	
	Display a Message: "Would you like to print the information to a file(Y or N)?"
	Scan the userInput
	IF userInput is Y:
	Display: C:\\Users\\Owner\\Autos.txt (file information)
	ELSE:
	Display "The file will not be printed."
	END	
 */
public class Automobile {	
	// initializing private variables	
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	// default constructor
	public Automobile() {
		
	}
	
	// parameterized constructor
	public Automobile(String make, String model, String color, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
	}
	
	// initialize private variables using the get() & set() 
	public void setMake(String make) {
		this.make = make;
	}
	public String getMake() {
		return make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return this.year;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getMileage() {
		return this.mileage;
	}
	

    public String listValues() {
		return String.format("%s %s (%s, %d, %d miles)", make, model, color, year, mileage);
	}	
}


