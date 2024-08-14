import java.util.Scanner;

public class IT24100499Lab4Q1{
	public static void main(String[] args){
		
	//getting the inputs from the user
		Scanner scanner = new Scanner(System.in);

	//promt the user to enter the number
		System.out.println("Enter the number :");
		double num = scanner.nextDouble();

	//check if number is positive or negative zero
		if(num>0){ System.out.println("This number is Positive");

			} else if (num < 0 ){
					System.out.println("This number is Negative.");
			} else {
					System.out.println("The number is zero.");
			}

	}
}