package application;
import java.util.Scanner;
public class Email_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		



				        // Array of valid email IDs
				        String[] arrayofEmails = {"priyanka@gmail.com", "kartik@gmail.com", "piya@gmail.com"};

				        // Get input from user
				        Scanner scanner = new Scanner(System.in);
				        System.out.print("Enter an email ID to verify: ");
				        String email = scanner.nextLine();

				        // Verify email ID
				        boolean isValid = false;
				        for (String validEmail : arrayofEmails) {
				            if (validEmail.equals(email)) {
				                isValid = true;
				                break;
				            }
				        }

				        // Display output
				        if (isValid) {
				            System.out.println("Email ID is valid.");
				        } else {
				            System.out.println("Email ID is invalid.");
				        }

				        scanner.close();
				    }
				
				    }
				
				    
				

			




	
