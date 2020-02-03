import java.util.Scanner; 

public class BMICalculator 
{
	// declare instance vars
	private double height; 
	private double weight; 
	private double Bmi; 
	private String BmiCategory; 
	public char unitType; 
	
	// create input stream 
	private static Scanner stdIn = new Scanner(System.in);
	
	// getters & setters 
	public double getWeight()
	{
		return weight; 
	}
		
	private void setWeight(double weight)
	{
		// set weight 
		this.weight = weight; 
		
		// make sure user enters a positive weight or print error 
		if(this.weight < 0)
		{
			System.out.println("Please enter a positive value for weight!"); 
			System.exit(0); 
		}
	}
		
	public double getHeight()
	{
		return height; 
	}
		
	private void setHeight(double height) 
	{
		// set height 
		this.height = height; 
		
		// make sure user enters a positive height or print error 
		if(this.height < 0)
		{
			System.out.println("Please enter a positive value for height!");
			System.exit(0);
		}	
	}
		
	public double getBmi()
	{
		return Bmi; 		
	}
		
	public String getBmiCategory()
	{
		return BmiCategory; 
	}
	
	
	// calculates Bmi & passes value to calculateBmiCategory; 
	public void calculateBmi()
	{
		if(unitType == 'A')
		{
			Bmi = weight / (height * height);
			calculateBmiCategory(); 
		}
			
		
		else if(unitType == 'B')
		{
			Bmi = (703 * weight) / (height * height);
			calculateBmiCategory(); 
		}
			 
	}
	
	// calculates Bmi category based off Bmi results
	private void calculateBmiCategory()
	{
		if(Bmi <= 18.5)
		{
			BmiCategory = "Underweight";
		}
		else if(Bmi > 18.5 && Bmi < 25)
		{
			BmiCategory = "Normal Weight";
		}
		else if(Bmi >= 25 && Bmi < 30)
		{
			BmiCategory = "Overweight";
		}	
		else if(Bmi >= 30)
		{
			BmiCategory = "Obese";
		}	
	}
	
	// displays User's Bmi & Categories along with other Bmi Categories
	public void displayBmi()
	{
		System.out.println("\n\n\n\t_______Your Results______");
		System.out.printf("\tBMI: %.2f\n", Bmi);
		System.out.println("\tBMI Category: " + BmiCategory);
		System.out.println("\n\n\t________BMI Categories_______");
		System.out.println("\tUnderweight: BMI < 18.5");
		System.out.println("\tNormal Weight: 18.5 - 24.9");
		System.out.println("\tOverweight: 25 - 29.9");
		System.out.println("\tObesity: 29.9 < BMI");
	}
	
	// prompts user for Metric or Imperial and then assigns correct value to unitType
	private void readUnitType() 
	{	
		do 
		{
			System.out.println("Welcome to the BMI Calculator!\n");
			System.out.println("Would you like to use...\n\t A) Metric\n\t B) Imperial");
			System.out.print("Please enter A or B");
			System.out.println("\n");
			unitType = stdIn.next().charAt(0);
			unitType = Character.toUpperCase(unitType); 
		} while(unitType != 'A' && unitType != 'B');
	}
		
	// calls metric or imperial method 
	private void readMeasurementData()
	{
		if(unitType == 'A')
			readMetricData(); 
		
		else if(unitType == 'B')
			readImperialData(); 		
	}
		
	// reads metric data 
	private void readMetricData()
	{
		// prompt for weight 
		System.out.print("Please enter your weight in kilograms: ");
		setWeight(stdIn.nextDouble());
		
		// prompt for height 
		System.out.print("Please enter your height in meters: ");
		setHeight(stdIn.nextDouble());
	}
		
	// reads imperial data
	private void readImperialData()
	{
		// prompt for weight 
		System.out.print("Please enter your weight in pounds: ");
		setWeight(stdIn.nextDouble());
		
		// prompt for height 
		System.out.print("Please enter your height in inches: ");
		setHeight(stdIn.nextDouble());  
	}
	
	// use readUnitType & readMeasurementData to read data from user 
	public void readUserData()
	{
		readUnitType();
		readMeasurementData(); 
	}
}