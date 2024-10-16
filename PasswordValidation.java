//Roxas, Hernani Roy B.
//CITCS 1B-B

import java.util.Scanner;
import java.util.regex.*;
public class PasswordValidation {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean loopCondition = true;
        String userPass;
        int passLength;
        Pattern containsUppercase = Pattern.compile("[A-Z]");
        Matcher uppercaseMatch;
        boolean uppercaseTrue;
        Pattern containsNumber = Pattern.compile("[0-9]");
        Matcher numberMatch;
        boolean numberTrue;

        do { 
            System.out.println("Enter password: ");
            userPass = userInput.nextLine();
            passLength = userPass.length();
            uppercaseMatch = containsUppercase.matcher(userPass);
            uppercaseTrue = uppercaseMatch.find();
            numberMatch = containsNumber.matcher(userPass);
            numberTrue = numberMatch.find();

            if (passLength >= 8 && uppercaseTrue && numberTrue) {
                loopCondition = false;
                break;
            }
            else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        } while (loopCondition);

        System.out.println("Your password is valid.");
        userInput.close();
    }
}
