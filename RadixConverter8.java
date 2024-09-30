//Roxas, Hernani Roy
//CITCS 1B-B

import java.util.Scanner;
public class RadixConverter8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        byte programState = 1;
        int correctRadixInput;
        String wrongRadixInput;
        long correctNumberInput;
        String wrongNumberInput;
        
        while (programState > 0) {
            System.out.print("\nEnter origin radix (2 to 16):");
            userInput.useRadix(10); //resets radix to 10 for next operation to prevent input issues

            if (!userInput.hasNextInt()) { //input checking
                wrongRadixInput = userInput.nextLine();
                    if (wrongRadixInput.equals("STOP")) {
                        System.out.println("\nClosing...");
                        programState--;
                        break;
                    }
                    else {
                        System.out.println("\nEnter a valid input or type STOP to close program.");
                        continue;
                    }
            }
            else {
                correctRadixInput = userInput.nextInt();
            
                if (correctRadixInput > 1 && correctRadixInput < 17) { //input checking
                    userInput.useRadix(correctRadixInput);
                    System.out.println("\nInput radix changed to " + userInput.radix()); //confirms radix change
                }
                else {
                    System.out.println("\nEnter a valid input.");
                    continue;
                }
            }

            while (true) {
                System.out.println("\nEnter number to convert:");
            
                if (!userInput.hasNextLong()) { //input checking
                    wrongNumberInput = userInput.nextLine();

                    if (wrongNumberInput.equals("STOP")) {
                        System.out.println("\nClosing...");
                        programState--;
                        break;
                    }
                    else {
                        System.out.println("\nEnter a valid input or type STOP to close program.");
                    }
                }
                else {
                    correctNumberInput = userInput.nextLong();

                    for (byte radix = 2; radix <= 16; radix++) {
                        String convertedOutput = Long.toString(correctNumberInput, radix);
                        System.out.println("\nbase" + radix + ": " + convertedOutput);
                    }
                    break;
                }
            }
        }
    }
}
