import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String args[]) {

		ArrayList<Double> grades = new ArrayList<>();
		
		// list of choices for user to make
		System.out.print("Welcome to the Student Grade Manager!\n"
				+ "1. Add a grade\n"
				+ "2. Remove a grade\n"
				+ "3. Update a grade\n"
				+ "4. Find highest and lowest grade\n"
				+ "5. Calculate average grade\n"
				+ "6. Display all grades\n"
				+ "7. Exit\n\n");		
		
		// loops until user exits program
		while (true) {
			
			// take in user choice
			System.out.print("Enter your choice: ");
			Scanner input = new Scanner(System.in);
			int choice;
			
			// try / except block to catch invalid inputs and redirect them to default case
			try {
				choice = input.nextInt();
			} catch (Exception e) {
				choice = 8;
			}
			
			// switch case for each user choice
			switch (choice) {
				case 1:
					addGrade(grades, input);
					break;
				case 2:
					removeGrade(grades, input);
					break;
				case 3:
					updateGrade(grades, input);
					break;
				case 4:
					displayHighestAndLowest(grades);
					break;
				case 5:
					calculateAverage(grades);
					break;
				case 6:
					displayGrades(grades);
					break;
				case 7:
					// close Scanner and exit
					input.close();
					System.out.println("Exiting program. Goodbye!");
					System.exit(0);
				default:
					// return to loop start for invalid inputs
					System.out.println("Invalid input.");
					System.out.println();
					break;
			}
		}
	}
	
	public static void addGrade(ArrayList<Double> grades, Scanner input) {
		
		// take user input and append it to grades array
		System.out.print("Enter grade: ");
		grades.add(input.nextDouble());
		
		System.out.println("Grade added!");
		System.out.println();
	}
	
	public static void removeGrade(ArrayList<Double> grades, Scanner input) {
		
		displayGrades(grades);
		
		// user chooses record by index offset by 1
		System.out.print("Which record to remove? ");
		int choice = input.nextInt();
		
		// remove chosen record from grades array
		grades.remove(choice - 1);
		
		System.out.println("Grade removed!");
		System.out.println();
	}
	
	public static void updateGrade(ArrayList<Double> grades, Scanner input) {
		
		displayGrades(grades);
		
		// user chooses record to update by index offset by 1
		System.out.print("Which record to update? ");
		int choice = input.nextInt();
		
		// user enters new value
		System.out.print("Update grade to what? ");
		double newGrade = input.nextDouble();
		
		// update chosen record to new value in grades array
		grades.set(choice - 1, newGrade);
		
		System.out.println("Grade updated!");
		System.out.println();
	}
	
	public static void displayHighestAndLowest(ArrayList<Double> grades) {
		
		// set highest to minimum and lowest to maximum
		double highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE;
		
		// iterate grades to find highest and lowest values in grades array
		for (double grade : grades) {
			if (grade > highest) highest = grade;
			if (grade < lowest) lowest = grade;
		}
		
		System.out.println("Highest grade: " + highest);
		System.out.println("Lowest grade: " + lowest);
		System.out.println();
	}
	
	public static void calculateAverage(ArrayList<Double> grades) {
		
		// use java.text.DecimalFormat to display grades with 2 decimal places rounded
		DecimalFormat rounded = new DecimalFormat("###.##");
		double average = 0;
		
		// iterate grades array to add grades to average then dived by grades.size()
		for (double grade : grades) average += grade;
		average /= grades.size();
		
		// displays formatted value
		System.out.println("The average grade is: " + rounded.format(average));
		System.out.println();
	}
	
	public static void displayGrades(ArrayList<Double> grades) {
		
		System.out.println("Grades:");
		
		// iterates grades and displays them with index number offset by 1
		for (int i = 0; i < grades.size(); i++) 
			System.out.println((i + 1) + ": " + grades.get(i));
		System.out.println();
	}
}
