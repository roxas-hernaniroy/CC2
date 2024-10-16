//Roxas, Hernani Roy B.
//CITCS 1B-B

//optimize to reduce code redundancy

import java.util.Scanner;
public class DiscountCalculator {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        int purchaseTotal;
        double fivePercentDiscount;
        double finalPriceFivePercent;
        double tenPercentDiscount;
        double finalPriceTenPercent;
        double fifteenPercentDiscount;
        double finalPriceFifteenPercent;

        System.out.println("Enter the total purchase amount: ");
        purchaseTotal = userInput.nextInt();

        if (purchaseTotal < 1000) {
            System.out.println("Discount applied:\t\t\t0%");
            System.out.println("Final price after discount:\t" + purchaseTotal);
        }
        else if (purchaseTotal >= 1000 && purchaseTotal <= 5000) {
            System.out.println("Discount applied:\t\t\t5%");
            fivePercentDiscount = purchaseTotal * 0.05;
            finalPriceFivePercent = purchaseTotal - fivePercentDiscount;
            System.out.printf("Final price after discount\t" + "%.2f%n", finalPriceFivePercent);
        }
        else if (purchaseTotal >= 5001 && purchaseTotal <= 10000) {
            System.out.println("Discount applied:\t\t\t10%");
            tenPercentDiscount = purchaseTotal * 0.1;
            finalPriceTenPercent = purchaseTotal - tenPercentDiscount;
            System.out.printf("Final price after discount\t" + "%.2f%n", finalPriceTenPercent);
        }
        else if (purchaseTotal > 10000) {
            System.out.println("Discount applied:\t\t\t15%");
            fifteenPercentDiscount = purchaseTotal * 0.15;
            finalPriceFifteenPercent = purchaseTotal - fifteenPercentDiscount;
            System.out.printf("Final price after discount:\t" + "%.2f%n", finalPriceFifteenPercent);
        }
        userInput.close();
    }
}
