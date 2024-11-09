import java.util.Scanner;
import java.util.regex.*;
public class InventoryManagement {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        Pattern inputCheck = Pattern.compile("[a-zA-Z]");
        
        int[] itemStock = new int[10];
        double[] itemPrice = new double[10];
        double invValue = 0;
        
        for (int invIndex = 0; invIndex < 10; invIndex++){
            while (true) {
                System.out.println("Enter stock level of item " + (invIndex + 1) + ":\t");
                String stockInput = userInput.nextLine();
                Matcher checkStockMismatch = inputCheck.matcher(stockInput);
                boolean foundStockMismatch = checkStockMismatch.find();
            
                if (foundStockMismatch) {
                    System.out.println("Invalid input, retry.");
                } else {
                    int correctStockInput = Integer.valueOf(stockInput);
                    itemStock[invIndex] = correctStockInput;
                    break;
                }
            }
            
            while (true) {
                System.out.println("Enter price of item " + (invIndex + 1) + ":\t");
                String priceInput = userInput.nextLine();
                Matcher checkPriceMismatch = inputCheck.matcher(priceInput);
                boolean foundPriceMismatch = checkPriceMismatch.find();
                
                if (foundPriceMismatch) {
                    System.out.println("Invalid input, retry.");
                } else {
                    double correctPriceInput = Double.valueOf(priceInput);
                    itemPrice[invIndex] = correctPriceInput;
                    break;
                }
            }
            
            invValue = invValue + (itemStock[invIndex] * itemPrice[invIndex]);
        }

        System.out.printf("Total inventory value:\t%.2f", invValue);
        userInput.close();
    }
}

/*
import java.util.Scanner;
public class InventoryManagement {
    public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
        
        int[] itemStock = new int[10];
        double[] itemPrice = new double[10];
        double invValue = 0;
        
        for (int invIndex = 0; invIndex < 10; invIndex++){
            System.out.println("Enter stock level of item " + (invIndex + 1) + ":\t");
            itemStock[invIndex] = userInput.nextInt();
            
            System.out.println("Enter price of item " + (invIndex + 1) + ":\t");
            itemPrice[invIndex] = userInput.nextDouble();
            
            invValue = invValue + (itemStock[invIndex] * itemPrice[invIndex]);
        }

        System.out.printf("Total inventory value:\t%.2f", invValue);
        userInput.close();
    }
}

*/
