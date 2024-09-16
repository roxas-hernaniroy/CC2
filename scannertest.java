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
