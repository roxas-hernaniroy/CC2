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
        
        double allSubtotalDiscount = itemAllSubtotal * 0.05;
        
        double salesTax = (itemAllSubtotal - allSubtotalDiscount) * 0.12;
        
        double finalTotal = (itemAllSubtotal - allSubtotalDiscount) + salesTax;
        
        //results
        System.out.printf("\nSubtotal:\t" + "PHP " + "%.2f%n", itemAllSubtotal);
        System.out.printf("Discount:\t" + "PHP " + "%.2f%n", allSubtotalDiscount);
        System.out.printf("Sales tax:\t" + "PHP " + "%.2f%n", salesTax);
        System.out.printf("Final total:\t" + "PHP " + "%.2f%n", finalTotal);
    }
}
