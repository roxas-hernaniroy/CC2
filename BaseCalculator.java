import java.util.Scanner;
public class TripleBaseCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        //
        userInput.useRadix(10); //reset
        
        System.out.println("Enter first number's input radix: ");
        int firstInputRadix = userInput.nextInt();
        System.out.println("Enter first number's value: ");
        long firstInputValue = userInput.nextInt();
        
        //
        userInput.useRadix(10); //reset
        
        System.out.println("Enter second number's input radix: ");
        int secondInputRadix = userInput.nextInt();
        System.out.println("Enter second number's value: ");
        long secondInputValue = userInput.nextLong();
        
        //
        System.out.println("Select operation: ");
        String selectedOperation = userInput.nextLine();
        
        switch (selectedOperation) {
            case "+":
                
            case "-":
                
            case "*":
                
            case "/":
                
            case "%":
                
                
        //
        System.out.println("Select display radix: ");
        int resultDisplayRadix = userInput.nextInt();
        
        System.out.println("Result is: ");
        }
    }
    
}
