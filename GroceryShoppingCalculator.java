//Roxas, Hernani Roy B.
//CITCS 1B-B
//CC2

import java.util.Scanner;
public class GroceryShoppingCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        //item one
        System.out.print("Enter price of item one:\t");
        double itemOnePrice = userInput.nextDouble();
        
        System.out.print("Enter quantity of item one:\t");
        int itemOneQuantity = userInput.nextInt();
        
        double itemOneSubtotal = itemOnePrice * itemOneQuantity;
        
        //item two
        System.out.print("Enter price of item two:\t");
        double itemTwoPrice = userInput.nextDouble();
        
        System.out.print("Enter quantity of item two:\t");
        int itemTwoQuantity = userInput.nextInt();
        
        double itemTwoSubtotal = itemTwoPrice * itemTwoQuantity;
        
        //item three
        System.out.print("Enter price of item three:\t");
        double itemThreePrice = userInput.nextDouble();
        
        System.out.print("Enter quantity of item three:\t");
        int itemThreeQuantity = userInput.nextInt();
        
        double itemThreeSubtotal = itemThreePrice * itemThreeQuantity;
        
        //calculations
        double itemAllSubtotal = itemOneSubtotal + itemTwoSubtotal + itemThreeSubtotal;
        float itemAllSubtotalF = (float)itemAllSubtotal; //casting to float for result readability
        
        double allSubtotalDiscount = itemAllSubtotal * 0.05;
        float allSubtotalDiscountF = (float)allSubtotalDiscount;
        
        double salesTax = (itemAllSubtotal - allSubtotalDiscount) * 0.12;
        float salesTaxF = (float)salesTax;
        
        double finalTotal = (itemAllSubtotal - allSubtotalDiscount) + salesTax;
        float finalTotalF = (float)finalTotal;
        
        //results
        System.out.println("\nSubtotal:\t" + itemAllSubtotalF);
        System.out.println("Discount:\t" + allSubtotalDiscountF);
        System.out.println("Sales tax:\t" + salesTaxF);
        System.out.println("Final total:\t" + finalTotalF);
    }
}
