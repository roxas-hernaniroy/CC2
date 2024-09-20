//Roxas, Hernani Roy B.
//CITCS 1B-B
import java.util.Scanner;
public class RadixConverter {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        byte programState = 1;
        
        while (programState > 0) {
            System.out.println("\nEnter input:");
            
            if (!userInput.hasNextLong()) {
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
            } else {
                long numberInput = userInput.nextLong();
            
                System.out.println("\nEnter desired base:");
                int radix = userInput.nextInt();
        
                switch (radix) {
                    case 16:
                        String decimalToHex = Long.toString(numberInput, 16);
                        System.out.println("\nHexadecimal Result: " + decimalToHex);
                        break;
                    case 8:
                        String decimalToOctal = Long.toString(numberInput, 8);
                        System.out.println("\nOctal Result: " + decimalToOctal);
                        break;
                    case 2:
                        String decimalToBinary = Long.toString(numberInput, 2);
                        System.out.println("\nBinary Result: " + decimalToBinary);
                        break;
                    default:
                        System.out.println("\nChoose between 2, 8, or 16 for now.");
                }
            }
        }
    }
}

//stylised version
/*
import java.util.Scanner;
public class RadixConverter {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int programState = 1;
        
        while (programState < 2) {
            System.out.println("\nEnter input:");
            
            if (!userInput.hasNextLong()) {
                String textInput = userInput.nextLine();
                switch (textInput) {
                    case "STOP":
                        programState++;
                        break;
                    default:
                        System.out.println("\nType STOP to close program.");
                        break;
                }
            } else {
                long numberInput = userInput.nextLong();
            
                System.out.println("\nEnter desired base:");
                int radix = userInput.nextInt();
        
                switch (radix) {
                    case 16:
                        String decimalToHex = Long.toString(numberInput, 16);
                        System.out.println("\nHexadecimal Result: " + decimalToHex);
                        break;
                    case 8:
                        String decimalToOctal = Long.toString(numberInput, 8);
                        System.out.println("\nOctal Result: " + decimalToOctal);
                        break;
                    case 2:
                        String decimalToBinary = Long.toString(numberInput, 2);
                        System.out.println("\nBinary Result: " + decimalToBinary);
                        break;
                    default:
                        System.out.println("\nChoose between 2, 8, or 16 for now.");
                }
            }
        }
        try {
            System.out.println("\nClosing program...");
            Thread.sleep(1000);
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        }
    }
}
*/
