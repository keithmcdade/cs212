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
			input.close();
			
			switch (choice) {
				case 1:
//					System.out.print("Enter grade: ");
//					grades.add(input.nextDouble());
//					System.out.println("Grade added!\n");
					addGrade(grades);
					break;
				case 2:
					System.out.println("Grades:");
					for (int i = 0; i < grades.size(); i++) 
						System.out.println((i + 1) + ": " + grades.get(i));
					System.out.print("Which record to remove? ");
					choice = input.nextInt();
					grades.remove(choice - 1);
					System.out.println("Grade removed!\n");
					break;
				case 3:
					// update
					break;
				case 4:
					// display highest and lowest
//					System.out.println("Highest grade: ")
					break;
				case 5:
					// calculate average
					break;
				case 6:
					System.out.println("Grades:");
					for (int i = 0; i < grades.size(); i++) 
						System.out.println((i + 1) + ": " + grades.get(i));
					break;
				case 7:
					input.close();
					System.out.println("Exiting program. Goodbye!");
					System.exit(0);
			}
		}
	}
	public static void addGrade(ArrayList<Double> grades) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter grade: ");
		grades.add(input.nextDouble());
		System.out.println("Grade added!\n");
		input.close();
	}
}
