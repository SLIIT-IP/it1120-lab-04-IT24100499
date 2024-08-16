import java.util.Scanner;

public class IT24100499Lab4Q3{
	public static void main(String[] args){
		//getting the inputs from the keyboard
			Scanner scanner = new Scanner(System.in);
		
		//print to get the user inputs 
			System.out.println("Enter the number ");
			double num = scanner.nextDouble();

		//check if the number is positive, negative or zero by using ternary 	oparetor
			String result = (num > 0) ?
" The number is postive"
			:(num < 0 ) ? "The number is negative"
			:"The number is zero";			

		//print the resault
			System.out.println(result);

	        // Close the scanner
		        scanner.close();
	}
}