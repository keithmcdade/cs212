import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String args[]) throws FileNotFoundException {
		
		// take input from file and put it in scanner, create new file for output
		Scanner input = new Scanner(new File("./input.txt"));
		PrintWriter output = new PrintWriter("./output.txt");
		
		// check each word from input, only add to output if longer than 4 characters
		while (input.hasNext()) {
			String word = input.next();
			if (word.length() > 4) output.println(word);
		}
			
		input.close();
		output.close();			
	}
}
