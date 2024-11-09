import java.util.Scanner;
import java.util.regex.*;
public class TrialSpace {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        Pattern inputCheck = Pattern.compile("^[0-9]+$");
        
        int[] itemStock = new int[10];
        double[] itemPrice = new double[10];
        double invValue = 0;
        
        for (int invIndex = 0; invIndex < 10; invIndex++){
            while (true) {
                System.out.println("Enter stock level of item " + (invIndex + 1) + ":\t");
                String stockInput = userInput.nextLine();
                Matcher checkStockMatch = inputCheck.matcher(stockInput);
                boolean foundStockMatch = checkStockMatch.find();
            
                if (foundStockMatch) {
                    itemStock[invIndex] = Integer.parseInt(stockInput);
                    break;
                } else {
                    System.out.println("Invalid input, retry.");
                }
            }
            
            while (true) {
                System.out.println("Enter price of item " + (invIndex + 1) + ":\t");
                String priceInput = userInput.nextLine();
                Matcher checkPriceMatch = inputCheck.matcher(priceInput);
                boolean foundPriceMatch = checkPriceMatch.find();
                
                if (foundPriceMatch) {
                    itemPrice[invIndex] = Double.parseDouble(priceInput);
                    break;
                } else {
                    System.out.println("Invalid input, retry.");
                }
            }
            
            invValue = invValue + (itemStock[invIndex] * itemPrice[invIndex]);
        }

        System.out.printf("Total inventory value:\t%.2f", invValue);
        userInput.close();
    }
}
