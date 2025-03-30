/**Jaime Sparks
 * COSC 1406-13271
 * Instructor Smith
 * Java Project 2
 * June 21, 2022
 */


package mod02.jp2;

import java.util.Scanner; 

public class Jaime_Sparks_topicC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		//2.2.1:  Declaration Section:  Variables~top
		int patientCountNumber = 0;
		long patientIDNumber = 0;
		short patientStreetAddressNumber = 0;
		int	patientZipCode = 0;
		byte patientPainLevel = 0;
		byte patientPainLocation = 0;
		byte patientPainType = 0;
		int	points = 0;
		double patientDiscountRate = 0.00;
		final float	TAXES_FEES = 0.025f;
		float patientCost = 0.00f;
		float total = 0.00f;
		//Variables~bottom
		
		//2.2.2: Select section ~ top
		byte selectorMainMenu_s1 = 0;  //Main Menu selector 1-7
		byte selectorSignUp_s2 = 0;    //Sign Up selector 1-3
		//Select ~ bottom
		
		//3.1:  County Hospital Introduction ~ top
		System.out.println("Welcome!");
		System.out.println("Favor County Health System is a fully integrated healthcare system that cares for all residents of Favor County, Texas.");
		System.out.println("We are the first accredited healthcare institution in Favor County to be designated by the National Committee for Quality");
		System.out.println("Assurance as a Patient-Centered Medical Home, and are one of the largest systems in the country to achieve the quality standard.");
		System.out.println("Our system is focused on preventitive and naturopathic care allowing the body to detox, by treating the whole person and addressing"); 
		System.out.println("the root causes of disease.  Favor County Hospital is a 215 licensed bed acute-care hospital with a newly expanded Level III trauma");
		System.out.println("center and a distinguished regional center for neonatal intesive care for high-risk deliveries.");
		System.out.println("**********************************************************************************************************************************************");
		//Hospital Introduction ~ bottom
		
		
		//3.2:  Program Introduction ~ top
		System.out.println("This software is desgined to support the hospital in managing electronic records in accordance to HIPAA laws.  The user will have the");
		System.out.println("ability to SignUp and LogIn to their account where patients, Doctors or Administrators can be added to the database system.  A confirmation");
		System.out.println("of each record will be provided upon submission and an Exit Message will display a summary when the Program has ended upon log out.");
		System.out.println("**********************************************************************************************************************************************");
		//Program Introduction ~ bottom
		
		
		//3.3:  Main Menu ~ top
		System.out.println("Main Menu _ 1");
		System.out.println("---------------");
		System.out.println("1 - SignUp                             <==");	//Guides user to Available option
		System.out.println("2 - LogIn (not Avaialble");
		System.out.println("3 - Exit (not Available");
		System.out.println("");
		//Main Menu ~ bottom 
		
		//3.4:  Main Menu I/O Scanner object ~ top 
		System.out.print("[Main Menu] Please select 1, 2, or 3:  ");	//Prompts user for Main Menu selection
		System.out.println("");
		selectorMainMenu_s1 = userInput.nextByte();
		
		System.out.print("*User Selected " + selectorMainMenu_s1);		//Confirms user for Main Menu selection
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//Scanner ~ bottom
		
		//3.5:  SignUp Menu ~ top
		System.out.println("Sign Up Menu _ 2");
		System.out.println("---------------");
		System.out.println("1 - Add Patient                       <==");	//Guides user to Available option
		System.out.println("2 - Add Doctor (not Avaialble");
		System.out.println("3 - Add Administrator (not Available");
		System.out.println("4 - Exit (not Available");
		System.out.println("");
		//SignUp Menu ~ bottom
		
		//3.6:  SignUp Menu I/O Scanner object ~ top 
		System.out.print("[SignUp Menu] Please select 1, 2, or 3:  ");	//Prompts user for SignUp Menu selection
		System.out.println("");
		selectorSignUp_s2 = userInput.nextByte();
		
		System.out.print("*User Selected " + selectorSignUp_s2);	//Confirms user for SignUp Menu selection
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//Scanner ~ bottom
		
		//3.7:  Add Patient Menu ~ top
		//Source code
		System.out.println("Add Patient Menu _ 3");
		System.out.println("1.  Patient Count Number:  " + ++patientCountNumber);	//Increments Patient Count Number
		
		System.out.print("2.  Enter Patient ID Number, i.e. 333111111:  ");			//Obtain Patient ID from the user
		patientIDNumber = userInput.nextLong(); 
		
		System.out.println("3.  Enter Patient First Name, i.e., Jane:  ");			//Obtain Patient First Name from the user
		String patientFirstName = userInput.next();									//String literal
		
		System.out.println("4.  Enter Patient Last Name, i.e. Doe:  ");				//Obtain Patient Last Name from the user
		String patientLastName = userInput.next();									//String literal
		
		System.out.println("5.  Enter Patient Street Address Number, i.e. 5350:  ");		//Obtain the Patient Street address from the user
		patientStreetAddressNumber = userInput.nextShort();
		
		System.out.println("6.  Enter Patient Street Address Name:  ");				//Obtain the Patient Street Address from the user
		String patientStreetAddressName = userInput.next();							//String literal
		
		System.out.print("7.  Enter Patient's City, i.e. Houston:  ");				//Obtain the Patient City from the user
		String patientCity = userInput.next();										//String literal
		
		System.out.println("8.  Enter Patient's State, i.e. Texas:  ");				//Obtain the Patient State from the user
		String patientState = userInput.next();										//String literal
		
		System.out.println("9.  Enter Patient's Zip Code, i.e. 77002:  ");			//Obtain the Patient Zip Code from the user
		patientZipCode = userInput.nextInt();
		
		System.out.print("10.  Enter Patient's Pain Level, value of 1-10:  ");		//Obtain the Patient Pain Level from the user
		patientPainLevel = userInput.nextByte();
		
		System.out.println("11.  Select the Patient's Pain Location # from 1-7, descriptions listed below:");
		System.out.println("	1 - Foot"); 
		System.out.println("	2 - Hand");
		System.out.println("	3 - Leg"); 
		System.out.println("	4 - Arms"); 										//Obtain the Patient Pain Location from the user
		System.out.println("	5 - Stomach");										//location #'s listed
		System.out.println("	6 - Chest");  
		System.out.println("	7 - Head");
		System.out.print("Enter Patient's Pain Location:  ");
		patientPainLocation = userInput.nextByte();
		System.out.println("");
		
		System.out.println("12.  Select the Patient's Pain Type # from 1-7, descriptions listed below:");
		System.out.println("	1 - Internal/Pain inside skin"); 
		System.out.println("	2 - External/Open Wound"); 									//Obtain the Patient Pain Type from the user
		System.out.println("	3 - External/Open Wound & Internal/Pain inside skin");		//severity #'s listed
		System.out.print("Enter Patient's Pain Type:  ");
		patientPainType = userInput.nextByte();
		System.out.println("");
		
		//Calculate the Patient's points
		points = (byte) (patientPainLevel + patientPainLocation + patientPainType);
		
		System.out.print("13.  Enter Patient's Discount Rate, numeric value from 1.00 - 25.00:  ");			//Obtain the Patient Discount Rate
		patientDiscountRate = userInput.nextDouble();
		
		System.out.println("14.  Patient's Taxes and Fees:  " + TAXES_FEES + "%"); 			//Display the Taxes & Fees - final float 
		
		System.out.print("15.  Enter Patient's Cost, i.e. $1500.00:  $");					//Obtain the Patient Cost from the user
		patientCost = userInput.nextFloat();
		
		//Calculate the Total
		total = (float) ((TAXES_FEES*patientCost)+((patientDiscountRate/100)*patientCost)+(patientCost));
		
		System.out.println("Patient Total:  $" + total);									//Display the Patient Total
		//Add Patient Menu ~ bottom
		
		//3.8:  Output Results ~ top
		System.out.println("");
		System.out.println("");
		System.out.println("/////// New Patient - Sign Up : Receipt ///////");
		System.out.println("");
		System.out.println("1.  Patient's Count Number:  " + patientCountNumber);
		System.out.println("2.  Patient's ID Number:  " + patientIDNumber);
		System.out.println("3.  Patient's First Name:  " + patientFirstName);
		System.out.println("4.  Patient's Last Name:  " + patientLastName);
		System.out.println("5.  Patient's Street Address Number:  " + patientStreetAddressNumber);
		System.out.println("6.  Patient's Street Address Name:  " + patientStreetAddressName);
		System.out.println("7.  Patient's City:  " + patientCity);
		System.out.println("8.  Patient's State:  " + patientState);
		System.out.println("9.  Patient's Zip Code:  " + patientZipCode);
		System.out.println("10. Patient's Pain Level:  " + patientPainLevel);
		System.out.println("11. Patient's Pain Location:  " + patientPainLocation + "	[1-low priority through 7-high priority]");
		System.out.println("12. Patient's Pain Type:  " + patientPainType + "	[1-low priority through 3-high priority]");
		System.out.println("13. Patient's Total Points:  " + points);
		System.out.println("14. Patient's Discount Rate:  " + patientDiscountRate + "%");
		System.out.println("15. Patient's Taxes and Fees:  " + (TAXES_FEES * 100) + "%");
		System.out.println("16. Patient's Cost:  $" + total);
		System.out.println("17. Patient with ID of " + patientIDNumber + " owes $" + total + " for pain point count total of " + points + " out of 20.");
		System.out.println("");
		//Output Results ~ bottom
		
		//3.9:  Exit Message
		System.out.println("");
		System.out.println("=======EXIT MESSAGE========");
		System.out.println("Patient Created ");
		System.out.println("Patient ID#  " + patientIDNumber);
		System.out.println("Program has Ended!");
		System.out.println("");
		
		//Close Scanner object I/O section
		userInput.close();
	}

}
