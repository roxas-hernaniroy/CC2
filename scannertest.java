//Roxas, Hernani Roy B.
//CITCS 1B-B
import java.util.Scanner;
public class InputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        
        //String inputText = sc.nextLine();
        //System.out.println("Inputted text is: " + inputText);
        
        int inputInteger = sc.nextInt();
        System.out.println("Inputted age is: " + inputInteger);
    }
    
}

		
		/*not sure about this code block here
		String closecommand = input.findInLine("STOP");
		if (closecommand.equals(true)) {
			input.close();
		}
		*/
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean continueProgram = true;
        
        while (continueProgram) {
            System.out.println("Enter first input:");
            long firstNumber = userInput.nextLong();
            
            System.out.println("Enter operation:");
            char selectedOperation = userInput.next().charAt(0);
            
            System.out.println("Enter second input:");
            long secondNumber = userInput.nextLong();
            
            switch (selectedOperation) {
                case '+':
                    System.out.println(firstNumber + secondNumber);
                    break;
                case '-':
                    System.out.println(firstNumber - secondNumber);
                    break;
                case '*':
                    System.out.println("Product is " + firstNumber * secondNumber);
                    break;
                case '/':
                    System.out.println("Quotient is " + firstNumber / secondNumber);
                    break;
                default:
                    System.out.println("Not a valid operation");
            }
        }
        
        
    }
    
}
