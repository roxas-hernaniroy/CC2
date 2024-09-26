import java.util.Scanner;
public class RadixConverterVII {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        byte programMainLoop = 1;
        byte programSubLoopOne = 0;
        byte programSubLoopTwo = 0;
        
        int correctRadixInput;
        String wrongRadixInput;
        long correctNumberInput;
        String wrongNumberInput;

        while (programMainLoop > 0) {
            userInput.useRadix(10);
            
            System.out.println("Enter origin radix (2 - 16): ");
            programSubLoopOne = 1;
            while (programSubLoopOne > 0) {
                if (userInput.hasNextInt()) {
                    correctRadixInput = userInput.nextInt();
                
                    if (correctRadixInput > 1 && correctRadixInput < 17) {
                        userInput.useRadix(correctRadixInput);

                        System.out.println("\nRadix has been changed to " + userInput.radix());

                        programSubLoopOne = 0;
                        break;
                    }
                    else {
                        System.out.println("\nEnter a valid input or type STOP to close.");
                    }
                }
                else {
                    wrongRadixInput = userInput.nextLine();
                
                    if (wrongRadixInput.equals("STOP")) {
                        System.out.println("\nClosing...");
                        programMainLoop--;
                        break;
                    }
                    else {
                        System.out.println("\nEnter a valid input or type STOP to close.");
                    }
                }
            }

            System.out.println("Enter number to be converted: ");
            programSubLoopTwo = 1;
            while (programSubLoopTwo > 0) {
                if (userInput.hasNextLong()) {
                    correctNumberInput = userInput.nextLong();

                    for (byte radix = 2; radix <= 16; radix++) {
                        String convertedOutput = Long.toString(correctNumberInput, radix);
                        System.out.println("\nbase" + radix + ": " + convertedOutput);
                    }

                    programSubLoopTwo = 0;
                    break;
                }
                else {
                    wrongNumberInput = userInput.nextLine();

                    if (wrongNumberInput.equals("STOP")) {
                        System.out.println("\nClosing...");
                        programMainLoop--;
                        break;
                    }
                    else {
                        System.out.println("\nEnter a valid input or type STOP to close.");
                    }
                }
            }
        }
    }
}
