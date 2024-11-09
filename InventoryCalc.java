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

/*
package javaapplication32;

import java.util.Scanner;
import java.util.regex.*;
public class InventoryManagement {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        Pattern inputCheck = Pattern.compile("[a-zA-Z]");
        Matcher checkStockMismatch;
        Matcher checkPriceMismatch;
        boolean foundStockMismatch;
        boolean foundPriceMismatch;
        String stockInput;
        String priceInput;
        
        int[] itemStock = new int[10];
        double[] itemPrice = new double[10];
        double invValue = 0;
        
        for (int invIndex = 0; invIndex < 10; invIndex++){
            while (true) {
                System.out.println("Enter stock level of item " + (invIndex + 1) + ":\t");
                stockInput = userInput.nextLine();
                checkStockMismatch = inputCheck.matcher(stockInput);
                foundStockMismatch = checkStockMismatch.find();
            
                if (foundStockMismatch) {
                    System.out.println("...");
                } else {
                    int correctStockInput = Integer.valueOf(stockInput);
                    itemStock[invIndex] = correctStockInput;
                    break;
                }
            }
            
            while (true) {
                System.out.println("Enter price of item " + (invIndex + 1) + ":\t");
                priceInput = userInput.nextLine();
                checkPriceMismatch = inputCheck.matcher(priceInput);
                foundPriceMismatch = checkPriceMismatch.find();
                
                if (foundPriceMismatch) {
                    System.out.println("...");
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
*/
