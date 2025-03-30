/**Jaime Sparks
 * COSC 1406-13271
 * Instructor Smith
 * Java Project 4
 * July 13, 2022
 */


package cosc1436.crn13271.summer2022.mod07mod08;
	
import java.util.Scanner; 
import java.io.*;
import java.util.Date;

public class Jaime_Sparks_topicC_jp4 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		//Declaration Section:  Variables~top
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
		int patientPainPointCount = 0;
		float serviceCostTotalToPatient = 0.00f;
		//Variables~bottom
		
		//Declaration section cont.:  String Variables~top
		String patientFirstName = "";
		String patientLastName = "";
		String patientStreetAddressName = "";
		String patientCity = "";
		String patientState = "";
		String patientAccount = "";
		String patientPassword = "";
		String phoneNumber = "";
		String databasePatient = "";
		String databaseAdmin = "";
		//String variables~bottom
		
		//Declaration section cont.:  Boolean variables~top
		boolean isPatient = false;
		boolean isDoctor = false;
		boolean isAdministrator = false;
		
		//JP4 Boolean variable declaration:
		boolean runMainMenu = true;
		boolean runSignUp = true;
		boolean runLogIn = true;
		boolean isNextPatient = false;
		//Boolean variables~bottom
		
		//Doctor and Administrator Variables ~ top
		String doctorAccount = "";
		String administratorAccount = "";
		
		int doctorCountNumber = 0;
		long doctorIDNumber = 0;
		short doctorStreetAddressNumber = 0;
		int	doctorZipCode = 0;
		
		long administratorPasscode = 0;
		long administratorIDNumber = 0;
		//Doctor and Administrator Variables ~ bottom
		
		//Select section ~ top
		byte selectorMainMenu_s1 = 0;  //Main Menu selector 1-3
		byte selectorSignUp_s2 = 0;    //Sign Up selector 1-4
		byte selectorAddPatient_s3 = 0; //Add Patient selector 1-2
		byte selectorLogIn_s4 = 0;		//LogIn selector 1-3
		byte selectorAdmin_s5 = 0;  	//Admin Selector 1-2
		//Select ~ bottom
		
		//County Hospital Introduction ~ top
		System.out.println("Welcome!");
		System.out.println("Favor County Health System is a fully integrated healthcare system that cares for all residents of Favor County, Texas.");
		System.out.println("We are the first accredited healthcare institution in Favor County to be designated by the National Committee for Quality");
		System.out.println("Assurance as a Patient-Centered Medical Home, and are one of the largest systems in the country to achieve the quality standard.");
		System.out.println("Our system is focused on preventitive and naturopathic care allowing the body to detox, by treating the whole person and addressing"); 
		System.out.println("the root causes of disease.  Favor County Hospital is a 215 licensed bed acute-care hospital with a newly expanded Level III trauma");
		System.out.println("center and a distinguished regional center for neonatal intesive care for high-risk deliveries.");
		System.out.println("**********************************************************************************************************************************************");
		//Hospital Introduction ~ bottom
		
		
		//Program Introduction ~ top
		System.out.println("This software is desgined to support the hospital in managing electronic records in accordance to HIPAA laws.  The user will have the");
		System.out.println("ability to SignUp and LogIn to their account where patients, Doctors or Administrators can be added to the database system.  A confirmation");
		System.out.println("of each record will be provided upon submission and an Exit Message will display a summary when the Program has ended upon log out.");
		System.out.println("**********************************************************************************************************************************************");
		//Program Introduction ~ bottom
		
		//***runMainMenu While Loop BEGINS**///
		while (runMainMenu) {									
			
		//Main Menu ~ top
		System.out.println("\n" + "Main Menu _ 1");
		System.out.println("---------------");
		System.out.println("1 - SignUp");								//Guides user to Menu Options
		System.out.println("2 - LogIn");
		System.out.println("3 - Exit");
		System.out.println("");
		//Main Menu ~ bottom 
		
		//Main Menu I/O Scanner object ~ top 
		System.out.print("[Main Menu] Please select 1, 2, or 3:  ");	//Prompts user for Main Menu selection
		System.out.println("");
		selectorMainMenu_s1 = userInput.nextByte();
		System.out.print("*User Selected (selectorMainMenu_s1) = " + selectorMainMenu_s1);		//Confirms user for Main Menu selection
		
			//Switch statement for MainMenu
			switch(selectorMainMenu_s1) {
			case 1:
			
			//**runSignUp While Loop BEGINS***//
			while (runSignUp) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				//Scanner ~ bottom
						
				//SignUp Menu ~ top
				System.out.println("Sign Up Menu _ 2");
				System.out.println("---------------");
				System.out.println("1 - Add Patient");												//Guides user to Menu Options
				System.out.println("2 - Add Doctor	");
				System.out.println("3 - Add Administrator");
				System.out.println("4 - Exit");
				System.out.println("");
				//SignUp Menu ~ bottom
				
				//SignUp Menu I/O Scanner object ~ top 
				System.out.print("[SignUp Menu] Please select 1, 2, 3, or 4:  ");					//Prompts user for SignUp Menu selection
				System.out.println("");
				selectorSignUp_s2 = userInput.nextByte();
				System.out.print("*User Selected (selectorSignUp_s2) = " + selectorSignUp_s2);		//Confirms user for SignUp Menu selection
				
						if(selectorSignUp_s2 == 1) {												//If-else-if statement for Selector SignUp
							
						System.out.println("");
						System.out.println("");
						System.out.println("");
						//Scanner ~ bottom
						
						//Add Patient Menu ~ top
						//Source code	
						do {																		//Do While Loop to Add a New Patient Auto generated or Manually
						System.out.println("Add Patient Menu _ 3");
						System.out.println("\n" + "How to create patient:  ");
						System.out.println("1 - Add Patient - auto generated");
						System.out.println("2 - Add Patient - user Inputs");
						System.out.print("[AddPatient Menu] Please select 1 or 2:  ");				//Prompts user for AddPatient Menu selection
						System.out.println("");
						selectorAddPatient_s3 = userInput.nextByte();
						System.out.print("*User Selected (selectorAddPatient_s3) = " + selectorAddPatient_s3);
						
																											
								switch (selectorAddPatient_s3) {
								case 1:
									
									System.out.println("");
									System.out.println("How many patients to create?");
									int createPatients = userInput.nextInt();
									System.out.println("File Updated");
									
									for (int i = 0; i < createPatients; i++) {								//12.3:  For Loop to Create Multiple users by Input Amount

									//12.1-2:  Create Random Patient User and Store Random User into a String	
									//Reading data from imported text files and using substring to declare variables	
									patientAccount = ""; 
									patientIDNumber = (long) (Math.random() * (987654321 - 123456789) + 123456789);
									patientAccount += "[" + patientIDNumber + "]"; 
									try {
										Scanner read = new Scanner(new File("firstNames_100"));
										String data = "";
										while (read.hasNextLine()) {
											data += read.nextLine() + ":";
										}
										int count = 0;
										for (int j = 0; j < data.length(); j++) {
											count++; 
											if (j < data.length() - 1) {
												data = data.substring(data.indexOf(":") + 1);
											}
										}
										int random = (int) (Math.random() * count);
										String d = "";
										d = data.substring(random);
										d = d.substring(d.indexOf(":") + 1);
										d = d.substring(0, d.indexOf(":"));
										patientFirstName = d;
									} catch (Exception e) {
										// TODO: handle exception
									}
									patientAccount += "[" + patientFirstName + "]";

									try {
										Scanner read = new Scanner(new File("lastNames_100"));
										String data = "";
										while (read.hasNextLine()) {
											data += read.nextLine() + ":";
										}
										int count = 0;
										for (int j = 0; j < data.length(); j++) {
											count++;
											String d = data.substring(0, data.indexOf(":"));
											if (j < data.length() - 1) {
												data = data.substring(data.indexOf(":") + 1);
											}
										}
										int random = (int) (Math.random() * count);
										String d = "";
										d = data.substring(random);
										d = d.substring(d.indexOf(":") + 1);
										d = d.substring(0, d.indexOf(":"));
										patientLastName = d;
									} catch (Exception e) {
										// TODO: handle exception
									}
									patientAccount += "[" + patientLastName + "]";
	 
									patientStreetAddressNumber = (short) (Math.random() * (25000 - 1) + 1);
									patientAccount += "[" + patientStreetAddressNumber + "]";

									try {
										Scanner read = new Scanner(new File("streetAddress_100"));
										String data = "";
										while (read.hasNextLine()) {
											data += read.nextLine() + ":";
										}
										int count = 0;
										for (int j = 0; j < data.length(); j++) {
											count++;
											String d = data.substring(0, data.indexOf(":"));
											if (j < data.length() - 1) {
												data = data.substring(data.indexOf(":") + 1);
											}
										}
										int random = (int) (Math.random() * count);
										String d = "";
										d = data.substring(random);
										d = d.substring(d.indexOf(":") + 1);
										d = d.substring(0, d.indexOf(":"));
										patientStreetAddressName = d;
									} catch (Exception e) {
										// TODO: handle exception
									}
									patientAccount += "[" + patientStreetAddressName + "]";

									try {
										Scanner read = new Scanner(new File("city_100"));
										String data = "";
										while (read.hasNextLine()) {
											data += read.nextLine() + ":";
										}
										int count = 0;
										for (int j = 0; j < data.length(); j++) {
											count++;
											String d = data.substring(0, data.indexOf(":"));
											if (j < data.length() - 1) {
												data = data.substring(data.indexOf(":") + 1);
											}
										}
										int random = (int) (Math.random() * count);
										String d = "";
										d = data.substring(random);
										d = d.substring(d.indexOf(":") + 1);
										d = d.substring(0, d.indexOf(":"));
										patientCity = d;
									} catch (Exception e) {
										// TODO: handle exception
									}
									patientAccount += "[" + patientCity + "]";

									try {
										Scanner read = new Scanner(new File("states_100"));
										String data = "";
										while (read.hasNextLine()) {
											data += read.nextLine() + ":";
										}
										int count = 0;
										for (int j = 0; j < data.length(); j++) {
											count++;
											String d = data.substring(0, data.indexOf(":"));
											if (j < data.length() - 1) {
												data = data.substring(data.indexOf(":") + 1);
											}
										}
										int random = (int) (Math.random() * count);
										String d = "";
										d = data.substring(random);
										d = d.substring(d.indexOf(":") + 1);
										d = d.substring(0, d.indexOf(":"));
										patientState = d;
									} catch (Exception e) {
										// TODO: handle exception
									}
									patientAccount += "[" + patientState + "]";
	 
									patientZipCode = (int) (Math.random() * (25000-1) + 1);
									patientAccount += "[" + patientZipCode + "]"; 
									patientPainLevel = (byte) (Math.random() * (25000-1) + 1);
									// patientPainLevel = userInput.nextByte();
									patientAccount += "[" + patientPainLevel + "]"; 
									patientPainLocation = (byte) (Math.random() * (25000-1) + 1);
									// patientPainLocation = userInput.nextByte();
									patientAccount += "[" + patientPainLocation + "]"; 
									patientPainType = (byte) (Math.random() * (25000-1) + 1);
									// patientPainType = userInput.nextByte();
									patientAccount += "[" + patientPainType + "]";

									patientPainPointCount = (byte) (patientPainLevel + patientPainLocation
											+ patientPainType);
									patientAccount += "[" + patientPainPointCount + "]"; 
									patientDiscountRate = (Math.random() * (100-1) + 1);
									// patientDiscountRate = userInput.nextByte();
									patientAccount += "[" + patientDiscountRate + "]";
									float hi1 = 999999.99f;
									float lo1 = 1.00f;
									patientCost = (float) (Math.random() * (hi1 - lo1) + lo1);
									// patientCost = userInput.nextFloat();
									patientAccount += "[" + patientCost + "]";
									serviceCostTotalToPatient = (float) (((TAXES_FEES) * patientCost)
											+ ((patientDiscountRate / 100) * patientCost) + patientCost);
									patientAccount += "[" + serviceCostTotalToPatient + "]";
									//Patient Password 
									patientPassword = (char)(Math.random()*(90-65)+65)+""+
											(char)(Math.random()*(122-97)+97)+""+
											(char)(Math.random()*(122-97)+97)+""+
											(char)(Math.random()*(122-97)+97)+""+
											(char)(Math.random()*(122-97)+97)+""+
											(char)(Math.random()*(122-97)+97)+""+
											(char)(Math.random()*(36-33)+33)+""+
											(char)(Math.random()*(57-48)+48)+""+
											(char)(Math.random()*(57-48)+48); 
									
									patientAccount += "[" + patientPassword + "]";

									databasePatient += "{" + patientIDNumber + ", " + patientAccount + "}\n";					//12.4:  Store string data of each patient creation

									try {
										File f = new File("database");
										PrintWriter pw = new PrintWriter(f);
										if (f.exists()) {
											FileWriter fw = new FileWriter(f);
											pw = new PrintWriter(fw);
										}
										pw.print(databasePatient);
										pw.close();
										 
									} catch (Exception e) {
	 
									}

									patientPassword = "";
																							
									}
									isPatient=false;
									break;
									
								case 2:	
									//Add New Patient Manually	
									System.out.println("1.  Patient Count Number:  " + ++patientCountNumber);				//Increments Patient Count Number
									
									System.out.print("2.  <User Input> Enter Patient ID Number, i.e. 333111111:  ");		//Obtain Patient ID from the user
									patientIDNumber = userInput.nextLong(); 
													
									System.out.println("3.  <User Input> Enter Patient First Name, i.e., Jane:  ");			//Obtain Patient First Name from the user
									patientFirstName = userInput.next();										
									
									System.out.println("4.  <User Input> Enter Patient Last Name, i.e. Doe:  ");			//Obtain Patient Last Name from the user
									patientLastName = userInput.next();											
									
									System.out.println("5.  <User Input> Enter Patient Street Address Number, i.e. 5350:  ");		//Obtain the Patient Street address from the user
									patientStreetAddressNumber = userInput.nextShort();
									
									System.out.println("6.  <User Input> Enter Patient Street Address Name, i.e. Main St:  ");	//Obtain the Patient Street Address from the user
									userInput.nextLine();
									patientStreetAddressName = userInput.nextLine();
												
									System.out.print("7.  <User Input> Enter Patient's City, i.e. Houston:  ");				//Obtain the Patient City from the user
									patientCity = userInput.next();									
									
									System.out.println("8.  <User Input> Enter Patient's State, i.e. Texas:  ");			//Obtain the Patient State from the user
									patientState = userInput.next();		
									
									System.out.println("9.  <User Input> Enter Patient's Zip Code, i.e. 77002:  ");			//Obtain the Patient Zip Code from the user
									patientZipCode = userInput.nextInt();
									
									System.out.print("10.  <User Input> Enter Patient's Pain Level, value of 1-10:  ");		//Obtain the Patient Pain Level from the user
									patientPainLevel = userInput.nextByte();
									
									System.out.println("11.  <User Input> Select the Patient's Pain Location # from 1-7, descriptions listed below:");
									System.out.println("	1 - Foot"); 
									System.out.println("	2 - Hand");
									System.out.println("	3 - Leg"); 
									System.out.println("	4 - Arms"); 										//Obtain the Patient Pain Location from the user
									System.out.println("	5 - Stomach");										//location #'s listed
									System.out.println("	6 - Chest");  
									System.out.println("	7 - Head");
									System.out.println("Enter Patient's Pain Location:  ");	
									patientPainLocation = userInput.nextByte();
									System.out.println("");
									
									System.out.println("12.  <User Input> Select the Patient's Pain Type # from 1-7, descriptions listed below:");
									System.out.println("	1 - Internal/Pain inside skin"); 
									System.out.println("	2 - External/Open Wound"); 									//Obtain the Patient Pain Type from the user
									System.out.println("	3 - External/Open Wound & Internal/Pain inside skin");		//severity #'s listed
									System.out.print("Enter Patient's Pain Type:  ");
									patientPainType = userInput.nextByte();
									System.out.println("");
									
									//Calculate the Patient's points
									points = (byte) (patientPainLevel + patientPainLocation + patientPainType);
									
									System.out.print("13.  <User Input> Enter Patient's Discount Rate, numeric value from 1.00 - 25.00:  ");			//Obtain the Patient Discount Rate from the user
									patientDiscountRate = userInput.nextDouble();
									
									System.out.println("14.  Patient's Taxes and Fees:  " + TAXES_FEES + "%"); 											//Display the Taxes & Fees - final float 
									
									System.out.print("15.  <User Input> Enter Patient's Cost, i.e. $1500.00:  $");										//Obtain the Patient Cost from the user
									patientCost = userInput.nextFloat();
									
									//Calculate the Total
									total = (float) ((TAXES_FEES*patientCost)+((patientDiscountRate/100)*patientCost)+(patientCost));
									
									System.out.println("Patient Total:  $" + total);																	//Display the Patient Total
									//Add Patient Menu ~ bottom
									
									//Add Random generated Phone Number
									int area = (int) (Math.random() * (999-111) + 111);
									int pref = (int) (Math.random() * (999-111) + 111);
									int suff = (int) (Math.random() * (999-1111) + 1111);
									phoneNumber = area + "-" + pref + "-" + suff;
									
									patientAccount += "[" + phoneNumber + "]";
									
									//Add Generated Password 
									patientPassword = patientFirstName.substring(0, 3) + ((int)(patientStreetAddressNumber % 100)) + 
											patientStreetAddressName.substring(1, 2) + "!@#$".charAt((int)(Math.random() * "!@#$".length()));
									
									patientAccount += "[" + patientPassword + "]";
									
									//Concatenate Add Patient Data in patientAccount
											patientAccount = "["+patientCountNumber+"]" + "["+patientIDNumber+"]" + "["+patientFirstName.toUpperCase()+"]" + "["+patientLastName.toUpperCase()+"]" + 
													"["+patientStreetAddressNumber+"]" + "["+patientStreetAddressName.toUpperCase()+"]" + "["+patientCity.toUpperCase()+"]" + "["+patientState.toUpperCase()+"]" + 
													"["+patientZipCode+"]" + "[" + phoneNumber + "]" + "[" + patientPassword + "]" + "["+patientPainLevel+"]" + "["+patientPainLocation+"]" + "["+patientPainType+"]" + "["+points+"]" + 
													"["+patientDiscountRate+"]" + "["+total+"]";
									
									//Manual Input Output Results ~ top
									System.out.println("");
									System.out.println("");
									System.out.println("/////// New Patient - Sign Up : Receipt ///////");
									System.out.println("");
									System.out.println("1.  Patient's Count Number:  " + patientCountNumber);
									System.out.println("2.  Patient's ID Number:  " + patientIDNumber);
									System.out.println("3.  Patient's First Name:  " + patientFirstName.toLowerCase());				//Converts String to Lower Case
									System.out.println("4.  Patient's Last Name:  " + patientLastName);
									System.out.println("5.  Patient's Street Address Number:  " + patientStreetAddressNumber);
									System.out.println("6.  Patient's Street Address Name:  " + patientStreetAddressName.trim());	//Trims String 
									System.out.println("7.  Patient's City:  " + patientCity);
									System.out.println("8.  Patient's State:  " + patientState);
									System.out.println("9.  Patient's Zip Code:  " + patientZipCode);
									System.out.println("10. Patient's Phone Number" + phoneNumber);
									System.out.println("11. Patient's Pain Level:  " + patientPainLevel);
									System.out.println("12. Patient's Pain Location:  " + patientPainLocation + "	[1-low priority through 7-high priority]");
									System.out.println("13. Patient's Pain Type:  " + patientPainType + "	[1-low priority through 3-high priority]");
									System.out.println("14. Patient's Total Points:  " + points);
									System.out.println("15. Patient's Discount Rate:  " + patientDiscountRate + "%");
									System.out.println("16. Patient's Taxes and Fees:  " + (TAXES_FEES * 100) + "%");
									System.out.println("17. Patient's Cost:  $" + total);
									System.out.println("18. Patient's Password:  " + patientPassword);
									isPatient=true;																	
									System.out.println("19. Patient with ID of ["+patientIDNumber+"] owes [$" + Math.round(total) +"] "
											+ "for pain point count total of ["+points+"] out of 20.");
									System.out.println("");
									System.out.println("");
									System.out.println("Patient Data - Account");
									System.out.println("------------------------");
									System.out.println(patientAccount);																				//Display the Patient Account Data
									System.out.println("");
									System.out.println("");
									//Output Results ~ bottom
									
									System.out.println("Now, what would you like to do now:  ");
									System.out.println("1 - Add another patient to database");
									System.out.println("2 - Add current patient, and Exit");
									int answer = userInput.nextInt();
									if (answer == 1) {
										isNextPatient = true;
										}else {
											isNextPatient=false;
											}
									
									continue;
								}	
							
							//}	ADDED LAST

						
							databasePatient += "{"+ patientIDNumber + "," + patientAccount + "\n";
							}while (isNextPatient);
						//END of Do While Loop
							
							runSignUp = false;
							//runMainMenu = false;
							isPatient = true;
							//break;
						
						
						}else if(selectorSignUp_s2 == 2) {
												
								//Add Doctor Menu ~ top
								System.out.println("");														
								System.out.println("");
								System.out.println("Add Doctor Menu _ 4");
								doctorCountNumber = (int) (Math.abs(Math.random() * 5000 + 1));
								System.out.println("1.  Doctor Count Number:  " + doctorCountNumber);
								
								System.out.print("2.  <User Input> Enter Doctor ID Number, i.e. 333111111:  ");				//Obtain Doctor ID from the user
								doctorIDNumber = userInput.nextLong(); 
												
								System.out.println("3.  <User Input> Enter Patient First Name, i.e., Jane:  ");				//Obtain Doctor First Name from the user
								String doctorFirstName = userInput.next();										
								
								System.out.println("4.  <User Input> Enter Patient Last Name, i.e. Doe:  ");				//Obtain Doctor Last Name from the user
								String doctorLastName = userInput.next();											
								
								System.out.println("5.  <User Input> Enter Patient Street Address Number, i.e. 5350:  ");		//Obtain the Doctor Street address from the user
								doctorStreetAddressNumber = userInput.nextShort();
								
								System.out.println("6.  <User Input> Enter Patient Street Address Name, i.e. Main St:  ");		//Obtain the Doctor Street Address from the user
								userInput.nextLine();
								String doctorStreetAddressName = userInput.nextLine();
											
								System.out.print("7.  <User Input> Enter Patient's City, i.e. Houston:  ");					//Obtain the Doctor City from the user
								String doctorCity = userInput.next();									
								
								System.out.println("8.  <User Input> Enter Patient's State, i.e. Texas:  ");				//Obtain the Doctor State from the user
								String doctorState = userInput.next();		
								doctorState.toUpperCase();																	//Converts string to Upper Case
								
								System.out.println("9.  <User Input> Enter Patient's Zip Code, i.e. 77002:  ");				//Obtain the Doctor Zip Code from the user
								doctorZipCode = userInput.nextInt();
								
								//Concatenate Add Doctor Data in doctorAccount
								doctorAccount = "["+doctorCountNumber+"]" + "["+doctorIDNumber+"]" + "["+doctorFirstName.toUpperCase()+"]" + "["+doctorLastName.toUpperCase()+"]" + 
										"["+doctorStreetAddressNumber+"]" + "["+doctorStreetAddressName.toUpperCase()+"]" + "["+doctorCity.toUpperCase()+"]" + "["+doctorState.toUpperCase()+"]" + 
										"["+doctorZipCode+"]";
				
									if (doctorAccount.length() > 0) {														//Evaluates the string length
										isDoctor = true;
										
									//Doctor Output Results ~ top
									System.out.println("");
									System.out.println("");
									System.out.println("/////// New Doctor - Sign Up : Receipt ///////");
									System.out.println("");
									System.out.println("1.  Doctor's Count Number:  " + doctorCountNumber);
									System.out.println("2.  Doctor's ID Number:  " + doctorIDNumber);
									System.out.println("3.  Doctor's First Name:  " + doctorFirstName.toLowerCase());				
									System.out.println("4.  Doctor's Last Name:  " + doctorLastName);
									System.out.println("5.  Doctor's Street Address Number:  " + doctorStreetAddressNumber);
									System.out.println("6.  Doctor's Street Address Name:  " + doctorStreetAddressName.trim());		
									System.out.println("7.  Doctor's City:  " + doctorCity);
									System.out.println("8.  Doctor's State:  " + doctorState);
									System.out.println("9.  Doctort's Zip Code:  " + doctorZipCode);
									//Doctor output ~ bottom
									
									System.out.println("");
									System.out.println("");
									System.out.println("Doctor Data - Account");
									System.out.println("------------------------");
									System.out.println(doctorAccount);														//Display the Doctor Account Data
									System.out.println("");
									System.out.println("");
									//break;
									}	
					
						}else if(selectorSignUp_s2 == 3) {
							if (administratorAccount.length() > 0) {														//12.5:  Administrator data creation
								isAdministrator = true;
								
							}//Add Administrator Menu
							System.out.println("");														
							System.out.println("");
							System.out.println("Add Administrator Menu _ 5");
							
							System.out.println("");
							System.out.println("1 - Add Administrator");
							System.out.println("2 - Exit Program");
											
							//Admin Menu I/O Scanner object ~ top 
							System.out.print("[Admin Menu] Please select 1 or 2:  ");								//Prompts user for Admin Menu selection
							System.out.println("");
							selectorAdmin_s5 = userInput.nextByte();
							System.out.print("*User Selected (selectorLogIn_s4) = " + selectorAdmin_s5);			//Confirms user for Admin Menu selection
							
								switch (selectorAdmin_s5) {
								case 1:
									isAdministrator = true;
									administratorIDNumber = (long) (Math.random() * (999999 - 100000) + 100000); 				//Random assigned Administrator ID 
									System.out.println("Random assign Administrator ID Number:  " + administratorIDNumber);	
									
									System.out.println("<User Input> Enter Administrator First Name, i.e., Doctor:  ");			//Obtain Administrator First Name from the user
									String administratorFirstName = userInput.next();										
									
									System.out.println("<User Input> Enter Administrator Last Name, i.e. DoRight:  ");			//Obtain Administrator Last Name from the user
									String administratorLastName = userInput.next();											
																							
									//Add Generated Passcode 
									administratorPasscode = (long) (Math.random() * (999999 - 100000) + 100000); 
									System.out.println("Random assign Administrator Passcode:  " + administratorPasscode);	
																
									//Display Date and Time Created
									Date date = new Date();
									String created = String.format("Date Created:  %tc", date);
									System.out.println(created);
									//System.out.println();			
									System.out.println("<User Input> Enter User Name, i.e. Lion16:  ");							//Obtain the Administrator User Name from the user
									String administratorUserName = userInput.next();									
									
									System.out.println("<User Input> Enter Password, i.e. Bike3Nike21@:  ");					//Obtain the Administrator Password from the user
									String administratorPassword = userInput.next();		
																									
															
									//Concatenate Add Administrator Data in administratorAccount
									administratorAccount = "{ " + administratorIDNumber + ", " + administratorPassword + ", " + administratorPasscode + " ["+administratorIDNumber+"]" + "["+administratorFirstName.toUpperCase()+"]" + 
											"["+administratorLastName+"]" + "["+administratorPasscode+"]" + "["+created+"]" + "["+administratorUserName+"]" + 
											"["+administratorPassword+"]" + "}";
									
									System.out.println(administratorAccount);
									
									databaseAdmin += "{" + administratorIDNumber + ", " + administratorAccount + "}\n";	
								
									//Create adminDatabase text file to capture new Administrator records and build a database
									try {
										File f = new File("adminDatabase");
										PrintWriter pw = new PrintWriter(f);
										if (f.exists()) {
											FileWriter fw = new FileWriter(f);
											pw = new PrintWriter(fw);
										}
										pw.print(databaseAdmin);
										pw.close();
										 
									} catch (Exception e) {
		
									}
								isPatient = false;
								break;
								
								case 2:
									System.out.println("");
									System.out.println("The Program has Ended.");
									System.exit(3);
								}
								//break;
						}else {
							System.out.println("");
							System.out.println("");
							System.out.println("The Program has Ended.");
							}
							
						
			System.out.println("\n" + "Would you like to :"); 
			System.out.println(" 1 - Return to Sign Up menu"); 
			System.out.println(" 2 - Return to Main Menu"); 
			int ans = userInput.nextInt(); 
			runSignUp = ans == 1 ? true : false; 
			} //***runSignUp While Loop ENDS***//
			isPatient = false;
			break;
			
		case 2:																					//Compare Strings for the Login function
						
			//**runLogin While Loop BEGINS***//
			while (runLogIn) {
				
			System.out.println("");
			System.out.println("1 - Patient Login");
			System.out.println("2 - Doctor Login");
			System.out.println("3 - Admin Login");
			
			//LogIn Menu I/O Scanner object ~ top 
			System.out.print("[LogIn Menu] Please select 1, 2, or 3:  ");						//Prompts user for LogIn Menu selection
			System.out.println("");
			selectorLogIn_s4 = userInput.nextByte();
			System.out.print("*User Selected (selectorLogIn_s4) = " + selectorLogIn_s4);		//Confirms user for LogIn Menu selection
			
				switch (selectorLogIn_s4) {
				case 1:
					
					System.out.println("");
					System.out.println("Patient LogIn Menu");											//12.6:  Patient Log In reference
							
					String userNameDatabase = "509720855";	
					System.out.println("");
					System.out.println("");
					System.out.println("Enter your username:  ");
					String userNameUserInput = userInput.next();
							if (userNameUserInput.equals(userNameDatabase)) {
									String passwordDatabase = "Sgxbky!54";								   //add patientPassword
									System.out.println("Enter your password:  ");
									String passwordNameUserInput = userInput.next();
									if (passwordNameUserInput.equals(passwordDatabase)) {					//add patientPassword
										System.out.println("Access Granted - Log In Successful");
										System.out.println("Log-In Screen \n");
										System.out.println("1 - Update Patient Info");
										System.out.println("2 - Exit/Return");
											int updatePatientInfo = userInput.nextInt();
											if (updatePatientInfo == 1) {
												System.out.println("1 - Update First Name");
												System.out.println("2 - Update Last Name");
												System.out.println("3 - Update Street Address #");
												System.out.println("4 - Update Street Address Name");
												System.out.println("5 - Update City");
												System.out.println("6 - Update State");
												System.out.println("7 - Update Zip Code");
												System.out.println("8 - Update Password");
												System.out.println("9 - Update Phone");
												System.exit(2);
											}else {
												continue;
											}
										} 
									else {
										System.out.println(passwordNameUserInput + ", does not match the password in the database for " + userNameDatabase);   	//does not match patientPassword
										}
							} 
									else {
									System.out.println(userNameUserInput + ", does not exist in the database" + "\n");
									break;
									//System.out.println("=======EXIT MESSAGE========");
									} 
				case 2:
					//System.out.println("Doctor LogIn Menu" + "\n");   *FOR FUTURE REFERENCE*
					
				case 3:
					System.out.println();
					System.out.println("Admin LogIn Menu" + "\n");
									
					String adminTempPasscodeDatabase = "708066";
					System.out.println("Enter Passcode:  ");
					String userAdminTempPasscodeInput = userInput.next();
						if (userAdminTempPasscodeInput.equals(adminTempPasscodeDatabase)) {
							System.out.println("Admin, Welcome");
							}break;
						}
				
				
				
			
										
			System.out.println("\n" + "Would you like to :"); 
			System.out.println(" 1 - Return to Log In menu"); 
			System.out.println(" 2 - Return to Main Menu"); 
			int ans = userInput.nextInt(); 
			runLogIn = ans == 1 ? true : false; 
			} //***runLogIn While Loop ENDS***//
			System.out.println("");
			System.out.println("=======EXIT MESSAGE========");
			isPatient = false;
			break;
						
		case 3:
			System.out.println("");
			System.out.println("");
			System.out.println("Program has Ended!");
			System.exit(1);
		}
		
		
		//Exit Message ~ top						
		if (isPatient) {
			
			System.out.println("");
			System.out.println("=======EXIT MESSAGE========");	
			
			//Patient Creation Confirmation w/ Patient ID & Total ~ top
			System.out.println("Patient Created");
																					
			String cutString = patientAccount.substring(patientAccount.indexOf("[", 3) + 1);							//Cut out Patient Count Number
			cutString.charAt(0);																						//Returns the first character of the string
			
			String outputID = cutString.substring(0, cutString.indexOf("]"));											//Cut out Patient ID
			System.out.println("Patient ID#:  " + outputID);
					
			String outputTotal = cutString.substring((cutString.lastIndexOf("]") - 9), (cutString.length() - 1));		//Cut out Patient Total
			System.out.println("Patient Total = $" + outputTotal + "\n");									
			//Patient Creation Confirmation ~ bottom
			}
		
				if (isDoctor) {
				System.out.println("Doctor Created");
				}
			
					if (isAdministrator) {
					System.out.println("Administrator Created");
					}
					
		System.out.println("\n" + "Would you like to :"); 
		System.out.println(" 1 - Return to Main Menu"); 
		System.out.println(" 2 - Exit Program"); 
		int ans = userInput.nextInt(); 
		runMainMenu = ans == 1 ? true : false;
		continue;	
		}	//***runMainMenu While Loop Ends***//
		
			
		// end of program
		// last display
		System.out.println(databasePatient);
		System.out.println("Program has Ended!");
		System.out.println("");
		//Exit Message ~ bottom
		
		
		//Close Scanner object I/O section
		userInput.close();
	}

}

