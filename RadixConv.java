import java.util.Scanner;
public class RadixConv {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Current radix value: " + userInput.radix());
        
        System.out.println("Enter input:");
        long numberInput = userInput.nextLong();
        
        System.out.println("Enter desired base:");
        int radix;
        radix = userInput.nextInt();
        
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
