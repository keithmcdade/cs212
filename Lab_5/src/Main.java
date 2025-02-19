import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		ArrayList<Double> grades = new ArrayList<>();
		
		System.out.print("Welcome to the Student Grade Manager!\n"
				+ "1. Add a grade\n"
				+ "2. Remove a grade\n"
				+ "3. Update a grade\n"
				+ "4. Find highest and lowest grade\n"
				+ "5. Calculate average grade\n"
				+ "6. Display all grades\n"
				+ "7. Exit\n\n");		
				
		while (true) {
			
			System.out.print("Enter your choice: ");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
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
					input.close();
					System.out.println("Exiting program. Goodbye!");
					System.exit(0);
			}
		}
	}
	
	public static void addGrade(ArrayList<Double> grades, Scanner input) {
		
		System.out.print("Enter grade: ");
		grades.add(input.nextDouble());
		
		System.out.println("Grade added!");
		System.out.println();
	}
	
	public static void removeGrade(ArrayList<Double> grades, Scanner input) {
		
		displayGrades(grades);
		
		System.out.print("Which record to remove? ");
		int choice = input.nextInt();
		
		grades.remove(choice - 1);
		
		System.out.println("Grade removed!");
		System.out.println();
	}
	
	public static void updateGrade(ArrayList<Double> grades, Scanner input) {
		
		displayGrades(grades);
		
		System.out.print("Which record to update? ");
		int choice = input.nextInt();
		
		System.out.print("Update grade to what? ");
		double newGrade = input.nextDouble();
		
		grades.set(choice - 1, newGrade);
		
		System.out.println("Grade updated!");
		System.out.println();
	}
	
	public static void displayHighestAndLowest(ArrayList<Double> grades) {
		
		double highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE;
		
		for (double grade : grades) {
			if (grade > highest) highest = grade;
			if (grade < lowest) lowest = grade;
		}
		
		System.out.println("Highest grade: " + highest);
		System.out.println("Lowest grade: " + lowest);
		System.out.println();
	}
	
	public static void calculateAverage(ArrayList<Double> grades) {
		
		double average = 0;
		
		for (double grade : grades) average += grade;
		
		System.out.println("The average grade is: " + (average / grades.size()));
		System.out.println();
	}
	
	public static void displayGrades(ArrayList<Double> grades) {
		
		System.out.println("Grades:");
		
		for (int i = 0; i < grades.size(); i++) 
			System.out.println((i + 1) + ": " + grades.get(i));
		System.out.println();
	}
}
