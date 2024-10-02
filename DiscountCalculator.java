import java.util.Scanner;
public class DiscountCalculator {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        int purchaseTotal = 0;

        System.out.println("Enter the total purchase amount: ");
        purchaseTotal = userInput.nextInt();

        if (purchaseTotal < 1000) {
            System.out.println("Discount applied:\t0%");
            System.out.println("Final price after discount:\t" + purchaseTotal);
        }
        else if (purchaseTotal >= 1000 && purchaseTotal <= 5000) {
            System.out.println("Discount applied:\t5%");
            double fivePercentDiscount = purchaseTotal * 0.05;
            double finalPriceFivePercent = purchaseTotal - fivePercentDiscount;
            System.out.printf("Final price after discount\t" + "%.2f%n", finalPriceFivePercent);
        }
        else if (purchaseTotal >= 5001 && purchaseTotal <= 10000) {
            System.out.println("Discount applied:\t10%");
            double tenPercentDiscount = purchaseTotal * 0.1;
            double finalPriceTenPercent = purchaseTotal - tenPercentDiscount;

        }
        else if (purchaseTotal > 10000) {

        }
    }
}
