import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteName {
	public static void main(String args[]) throws FileNotFoundException {
		
		Scanner getName = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = getName.next(),
			   fileName = "./" + name + ".txt";
		getName.close();
		
		File nameFile = new File(fileName);
		
		PrintWriter nameWriter = new PrintWriter(nameFile);
		nameWriter.print(name);
		nameWriter.close();
		
		Scanner readFile = new Scanner(nameFile);
		System.out.println(readFile.next().toUpperCase());
		readFile.close();
	}
}
