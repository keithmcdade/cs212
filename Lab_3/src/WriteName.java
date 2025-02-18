import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteName {
	public static void main(String args[]) throws FileNotFoundException {
		
		Scanner getName = new Scanner(System.in);

		// take input from command line and assign it to 'name'
		System.out.print("Please enter your name: ");
		String name = getName.next(),
			   fileName = "./" + name + ".txt";
		getName.close();
		
		// create new file, file name is same as use input
		File nameFile = new File(fileName);
		
		// write name to file
		PrintWriter nameWriter = new PrintWriter(nameFile);
		nameWriter.print(name);
		nameWriter.close();
		
		// convert letters in name to all upper case 
		Scanner readFile = new Scanner(nameFile);
		System.out.println(readFile.next().toUpperCase());
		readFile.close();
	}
}
