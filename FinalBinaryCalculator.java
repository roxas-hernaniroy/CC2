//v5
import java.util.Scanner;
public class FinalBinaryCalculator {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in); 
        
        byte programState = 1;
        while (programState > 0) {
            System.out.println("\nEnter input:");
            
            if (!userInput.hasNextLong()) { 
                String textInput = userInput.nextLine();
                
                if (textInput.equals("STOP")) {
                    System.out.println("\nClosing program...");
                    programState--;
                    break;
                }
                else {
                    System.out.println("Type STOP to close program.");
                }
            } 
            else {
                long numberInput = userInput.nextLong();
                    String decimalToBinary = Long.toString(numberInput, 2);
                    System.out.println("\nOutput: " + decimalToBinary);
            }
        }
    }
}
