import java.util.Scanner;
public class InterbaseCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter first number's input radix: ");
        int firstRadix = userInput.nextInt();
        userInput.useRadix(firstRadix);
        
        System.out.println("Enter first number's value: ");
        long firstValue = userInput.nextInt();
        
        userInput.useRadix(10); //reset
        
        System.out.println("Enter second number's input radix: ");
        int secondRadix = userInput.nextInt();
        userInput.useRadix(secondRadix);
        
        System.out.println("Enter second number's value: ");
        long secondValue = userInput.nextLong();
        userInput.nextLine();
        
        userInput.useRadix(10); //reset
        
        System.out.println("Select operation: ");
        String selectedOperation = userInput.nextLine();
        
        long result = 0;
        boolean correctOperation = true;
        switch (selectedOperation) {
            case "+": 
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                result = firstValue / secondValue;
                break;
            case "%":
                result = firstValue % secondValue;
                break;
            default:
                System.out.println("Try again.");
                correctOperation = false;
        }

        if (correctOperation) {
            System.out.println("Select display radix: ");
            int resultDisplayRadix = userInput.nextInt();

            if (resultDisplayRadix == 2) {
                String binaryString = Long.toBinaryString(result);
                
                int paddingLength = (4 - (binaryString.length() % 4)) % 4;
                binaryString = "0".repeat(paddingLength) + binaryString;

                System.out.print("Result is: ");
                for (int i = 0; i < binaryString.length(); i += 4) {
                    System.out.printf("%s ", binaryString.substring(i, i + 4));
                }
                System.out.println();
            }
            else {
                String resultOutput = Long.toString(result, resultDisplayRadix);
                System.out.println("Result is: " + resultOutput);
            }
        }
    }
}
