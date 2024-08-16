import java.util.Scanner;

public class IT24100499Lab4Q2{
    public static void main(String[] args) {
        // Getting the keyboard input
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter the Exam marks (out of 100):");
        double marks = scanner.nextDouble();

        // Check if the number is valid
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid exam marks, marks must be between 0 and 100.");
        }

        // Getting the lab submission marks
        System.out.println("Enter the lab submission marks (out of 100):");
        double labmarks = scanner.nextDouble();

        // Check if lab marks are valid
        if (labmarks < 0 || labmarks > 100) {
            System.out.println("Invalid lab submission marks, marks must be between 0 and 100.");
        }

        // Getting the exam percentage
        System.out.println("Enter the percentage marks in exam:");
        double exampercentage = scanner.nextDouble();

        // Check if exam percentage is valid
        if (exampercentage < 0 || exampercentage > 100) {
            System.out.println("Invalid percentage. The percentage must be between 0 and 100.");
        }

        // Getting the lab percentage
        System.out.println("Enter the percentage marks in lab:");
        double labpercentage = scanner.nextDouble();

        // Check if lab percentage is valid
        if (labpercentage < 0 || labpercentage > 100) {
            System.out.println("Invalid percentage. The percentage must be between 0 and 100.");
        }

        // Calculate the final marks
        double finalmarks = (marks * exampercentage / 100) + (labmarks * labpercentage / 100);

        // Print the final marks
        System.out.println("The final marks for the exam is: " + finalmarks);

       
    }
}
