import java.util.Scanner;
public class RadixConv {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter input:");
        long numberInput = userInput.nextLong();
        String textInput = userInput.nextLine();
/*
        if (textInput.equals("STOP")) {
            userInput.close();
        }
*/
        
        System.out.println("Enter desired base:");
        int radix;
        radix = userInput.nextByte();
        
        switch (radix) {
            case 16:
                String decimalToHex = Long.toString(numberInput, 16);
                System.out.println("Hexadecimal Result: " + decimalToHex);
                break;
            case 8:
                String decimalToOctal = Long.toString(numberInput, 8);
                System.out.println("Octal Result: " + decimalToOctal);
                break;
            case 2:
                String decimalToBinary = Long.toString(numberInput, 2);
                System.out.println("Binary Result: " + decimalToBinary);
                break;
        }
    }
}

/*
import java.util.Scanner;
public class RadixConv{
    public static void main(String[] args) {
        boolean continueProgram = true;
        Scanner userInput = new Scanner(System.in);
        String stopProgram = "STOP";
        
        while (continueProgram) {
            System.out.println("base10 to base2/base8/base16\nEnter input:");
            long numberInput = userInput.nextLong();
            String textInput = userInput.nextLine();

            if (boolean stopProgram = true) {
                boolean continueProgram = false;
            }
            
            System.out.println("Enter destination radix:");
            byte radixInput = userInput.nextByte();
            
            switch (radixInput) {
                case 2:
                    String binaryResult = Long.toString(numberInput, 2);
                    System.out.println(numberInput + "to binary: " + binaryResult);
                    break;
                case 8:
                    String octalResult = Long.toString(numberInput, 8);
                    System.out.println(numberInput + "to octal: " + octalResult);
                    break;
                case 16:
                    String hexResult = Long.toString(numberInput, 16);
                    System.out.println(numberInput + "to hexadecimal: " + hexResult);
                    break;
                default:
                    System.out.println("Unsupported for now. Reset? Y/N");
                    if (userInput.nextLine("N") {
                    userInput.close();
                    }
                    break;
            }
        }
    }
}
*/
