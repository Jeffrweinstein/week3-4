package week3and4project;

import java.lang.reflect.Array;

public class week3and4ArraysandMethods {

	public static void main(String[] args) {
	
			double[]ages = {3, 9, 23, 64, 2, 8, 28, 93};


	//	1a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array
		System.out.print("1a: ");
       System.out.println(ages[ages.length - 1] - ages[0]);
        
        //1b.     Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).

		//	double[]ages = {3, 9, 23, 64, 2, 8, 28, 93, 47};
		//	System.out.print("1b: ");
		//	System.out.println(ages[ages.length - 1] - ages[0]);
		//1c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		double sum = 0;
		
		for ( double number : ages) {
			sum += number;
				}
		System.out.print("1c: ");
		System.out.println(sum  / ages.length);
	
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2a Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console
		
		int sumNames = 0; {
		
		for (int i = 0; i < names.length; i++) {
			
			sumNames += names[i].length();
			
		}
			System.out.print("2a: ");
			System.out.println(sumNames / names.length);
		}
			
		//2b.  Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console
			String namesArray = ""; {
				for (int i = 0; i < names.length; i++) {
					namesArray += names[i] + " ";
				}
					System.out.print("2b: ");
					System.out.println(namesArray);
					
		 // 3.  	How do you access the last element of any array?
				//System.out.println(array[array.length-1]);
					
		//4.  	How do you access the first element of any array?	
			
		//	  (array[0]);
			
		
		//5. 	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array
					int[] nameLengths = new int[names.length];
					
					int sum1 = 0;
					for (int j = 0; j < names.length; j++) {
						  nameLengths[j] = names[j].length();	
				
						  sum1 += nameLengths[j];
					}
								
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console			
						System.out.println("6: " + sum1);
						
		
		//7.
						int numTimes = 3;
						String wordSelection = "Hello";
						System.out.print("7: ");
						System.out.println(greeting(wordSelection, numTimes));
						
		//8.
						String firstName = "Jeff";
						String lastName = "Weinstein";
						String fullName = createFullName(firstName, lastName);
						
						
						System.out.println("8: " + fullName);
		
		//9.			
						int[]ages1 = {3, 9, 23, 64, 2, 8, 28, 93, 47};
						System.out.print("9: ");
						System.out.println(array100(ages1));
		
		//10. 
							double[]ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 47};
										
							System.out.print("10: ");
							System.out.println(calcAverage(ages2));
		
		//11. 	
									
							double[] hrJuanSoto = {22, 34, 13, 29, 27};
							double[] hrRonaldAcuna = {26, 41, 14, 24, 15};
							
							System.out.print("11. ");
							System.out.println(hrTotals(hrJuanSoto, hrRonaldAcuna));	
						
		//12.					
							boolean isHotOutside = true;
							double moneyInPocket = 10.00;
							
							System.out.print("12: ");
							System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
							
		//13.			I created this as an operations Manager for my company when trying to determine if i 
		//			have to control payroll and stop my staff from exhausting overtime.
				
						
					double[] overtimeHours = {24.3, 15.7, 7.5, 13.3, 29.7, 26.5};
					
					double sumOT = 0;
					
					for (int x = 0; x < overtimeHours.length; x++) {
						sumOT += overtimeHours[x];
						
						
					}
					System.out.print("13: ");
					System.out.println(marioOvertime(sumOT / overtimeHours.length));
			}
					
						
}
						
						
						
						 
				
				
				
				
									
	//}
	//7.    Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	static String greeting(String wordSelection , int numTimes) {
 		String newGreeting = "";
 		for (int i = 0; i < numTimes; i++) {
 		newGreeting += wordSelection;
 	}
 		return newGreeting;
		 	
		 	}
	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		public static String createFullName(String i, String j) {
			return i + " " + j;
			}
	
		//9. 	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
		
		
			 
			public static boolean array100 (int[] ages)
			{
				int sum = 0 ;
				for (int i = 0; i < ages.length; i++) {
					sum += ages[i];
				}
				
				if (sum > 100) {
					return true;
				}
				else {
					return false;
				}
			}
			//10.  Write a method that takes an array of double and returns the average of all the elements in the array.
				
				public static double calcAverage (double[] ages)
				{
					double sum = 0.0;
					for (int i = 0; i < ages.length; i++) {
						sum += ages[i]/ages.length;
						
					}
					return sum;
				}


			//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array			
			 
					public static boolean hrTotals(double[] Padres, double[] Braves) {
						double soto = 0;
						for (int p = 0; p < Padres.length; p++) {
							soto += Padres[p] / Padres.length;
							
						}
						double acuna = 0;
						for (int b = 0; b < Braves.length; b++) {
							acuna += Braves[b]/ Braves.length;	
						}
						
						if (soto > acuna) {
							return true;
							}
						else {
							return false;
						}
					}
					
			//12. 	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
					public static boolean willBuyDrink(boolean temperature, double money) {
						if (temperature == true && money > 10.50) {
							return true;
						}
						else {
							return false;
						}
			
					}
					
//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.		
					
					public static String marioOvertime(double hours) {
						if (hours > 20) {
							return "You have to stop working";
							}
						else {
							return "You can work more overtime";
						}
						
				
					}
}

					

	
		 	
				
	
	

