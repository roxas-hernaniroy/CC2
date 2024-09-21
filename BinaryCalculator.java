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
                switch (textInput) {
                    case "STOP":
                        System.out.println("\n...Closing program...");
                        programState--;
                        break;
                    default:
                        System.out.println("\nType STOP to close program.");
                        break;
                }
            } else { //converter
                long numberInput = userInput.nextLong();
                    String decimalToBinary = Long.toString(numberInput, 2);
                    System.out.println("\nBinary Result: " + decimalToBinary);
            }
        }
    }
}