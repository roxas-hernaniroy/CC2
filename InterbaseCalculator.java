package triplebasecalculator;
import java.util.Scanner;
public class InterbaseCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        //
        userInput.useRadix(10); //reset
        
        System.out.println("Enter first number's input radix: ");
        int firstRadix = userInput.nextInt();
        userInput.useRadix(firstRadix);
        
        System.out.println("Enter first number's value: ");
        long firstValue = userInput.nextInt();
        
        //
        userInput.useRadix(10); //reset
        
        System.out.println("Enter second number's input radix: ");
        int secondRadix = userInput.nextInt();
        userInput.useRadix(secondRadix);
        
        System.out.println("Enter second number's value: ");
        long secondValue = userInput.nextLong();
        
        userInput.nextLine();
        
        //
        System.out.println("Select operation: ");
        String selectedOperation = userInput.nextLine();
        
        long result;
        switch (selectedOperation) {
            case "+": 
                result = firstValue + secondValue;
            case "-":
                result = firstValue - secondValue;
            case "*":
                result = firstValue * secondValue;
            case "/":
                result = firstValue / secondValue;
            case "%":
                result = firstValue % secondValue;
                
        //
        System.out.println("Select display radix: ");
        int resultDisplayRadix = userInput.nextInt();
        String resultOutput = Long.toString(result, resultDisplayRadix);
        
        System.out.println("Result is: " + resultOutput);
        }
    }
}
