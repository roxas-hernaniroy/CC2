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
