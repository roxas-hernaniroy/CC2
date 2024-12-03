//Roxas, Hernani Roy B.
//CITCS 1B-B
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String error) {
        super(error);
    }
}

public class BankingSystemExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            double balance = Math.random() * 1000000 + 1; //random balance for demonstration purposes
            
            while (true) {
                System.out.printf("Welcome. Your current balance is %.2f.\n", balance);
                System.out.print("Enter withdrawal amount:\n");
                double withdrawalAmount = userInput.nextDouble();
                userInput.nextLine();
                    
                if (balance - withdrawalAmount < 0) {
                    userInput.close();
                    throw new InsufficientFundsException("You have insufficient funds for this operation.");
                }
                else {
                    balance -= withdrawalAmount;
                    System.out.printf("Amount of %.2f was withdrawn. Thank you for your patronage. Your new balance is %.2f.", withdrawalAmount, balance);
                    userInput.close();
                    break;
                }
                
            }
        }
        catch (InsufficientFundsException error) {
            System.out.println("Error detected.");
            System.out.println(error.getMessage());
        }
    }
}
