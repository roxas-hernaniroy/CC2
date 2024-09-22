//v4
//Roxas, Hernani Roy
//CITCS 1B-B

import java.util.Scanner;
public class FinalRadixConverter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nCurrent radix is " + userInput.radix() + ".");
        
        byte programState = 1;
        
        while (programState > 0) {
            
            userInput.useRadix(10);
            System.out.println("\nEnter origin radix (2 to 16):");
            
            if (!userInput.hasNextInt() || !userInput.hasNextByte()) {
                String otherInputOnRadixField = userInput.nextLine();
                    if (otherInputOnRadixField.equals("STOP")) {
                        System.out.println("\nClosing...");
                        programState--;
                        break;
                    }
                    else {
                        System.out.println("\nType STOP to close program.");
                    }
            }
            else {
                byte radixFieldInput = userInput.nextByte();
            
                if (radixFieldInput > 1 && radixFieldInput < 17) {
                    userInput.useRadix(radixFieldInput);
                }
                else if (radixFieldInput <= 1 || radixFieldInput >= 17) {
                    System.out.println("\nUnsupported radix input. Enter a valid radix input.");
                    continue;
                }   
                
                System.out.println("\nInput radix changed to " + userInput.radix());
                
                while (true) {
                    System.out.println("\nEnter number to convert:");
            
                    if (!userInput.hasNextLong()) {
                        String otherInputOnNumberField = userInput.nextLine();
                        if (otherInputOnNumberField.equals("STOP")) {
                            System.out.println("\nClosing...");
                            programState--;
                            break;
                        }
                        else {
                            System.out.println("\nType STOP to close program.");
                        }
                    }
                    else {
                        long numberFieldInput = userInput.nextLong();
                        for (byte base = 2; base <= 16; base++) {
                        String convertedOutput = Long.toString(numberFieldInput, base);
                        System.out.println("\nbase" + base + ": " + convertedOutput);
                        }
                    break;
                    }
                }
            }
        }
    }
}
