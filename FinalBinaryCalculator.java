//v4
//Roxas, Hernani Roy B.
//CITCS 1B-B
import java.util.Scanner;
public class BinaryCalculator {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in); 
        
        byte programState = 1;
        while (programState > 0) {
            System.out.println("\nEnter input:");
            
            if (!userInput.hasNextLong()) { //exit condition
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
            else { //converter
                long numberInput = userInput.nextLong();
                    String decimalToBinary = Long.toString(numberInput, 2);
                    System.out.println("\nOutput: " + decimalToBinary);
            }
        }
    }
}
