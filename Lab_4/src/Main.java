import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String args[]) throws FileNotFoundException {
		
			Scanner input = new Scanner(new File("./input.txt"));
			PrintWriter output = new PrintWriter("./output.txt");
			
			while (input.hasNext()) {
				String word = input.next();
				if (word.length() <= 4) output.println(word);
			}
			
			input.close();
			output.close();			
	}
}
