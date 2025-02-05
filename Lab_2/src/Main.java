import java.util.Scanner;

public class Main {
	public static int sumOfEven(int n) {
		
		int sum = 0;
		
		for (int i = 0; i <= n; i++)
			if (i % 2 == 0) sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		input.nextLine();
		
		System.out.println(sumOfEven(n));
		input.close();
	}
}
