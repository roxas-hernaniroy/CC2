import java.util.Scanner;
public class BankingSystemExceptionHanding {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            double balance = (Math.random()* 1000) * (Math.random() * 100);
            
            while (true) {
                System.out.printf("Welcome. Your current balance is %.2f.\n", balance);
                System.out.print("Would you like to process a withdrawal? [Y/N]\n");
                String userChoice = userInput.nextLine();
            
                if (userChoice.equalsIgnoreCase("y")) {
                    System.out.print("Enter withdrawal amount:\n");
                    double withdrawalAmount = userInput.nextDouble();
                    
                    if (withdrawalAmount - balance < 0 || withdrawalAmount - balance > balance) {
                        double error = balance / 0;
                        break;
                    }
                    else {
                        balance -= withdrawalAmount;
                        System.out.printf("Amount of %.2f was withdrawn. Thank you for your patronage. Your new balance is %.2f.", withdrawalAmount, balance);
                        break;
                    }
                }
            }
        }
        catch (Exception error) {
            System.out.print("You have insufficient funds for this operation.\n");
        }
    }
}
