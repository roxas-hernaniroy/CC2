import java.util.Scanner;
public class InventoryCalc {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int[] itemStock = new int[10];
        int[] itemPrice = new int[10];
        double invValue = 0;
        
        for (int invIndex = 0; invIndex < 10; invIndex++){
            System.out.println("Enter stock level of item " + (invIndex + 1) + ":\t");
            itemStock[invIndex] = userInput.nextInt();
            
            System.out.println("Enter stock price of item " + (invIndex + 1) + ":\t");
            itemPrice[invIndex] = userInput.nextInt();
            
            invValue = invValue + (itemStock[invIndex] * itemPrice[invIndex]);
        }
        
        System.out.printf("Total inventory value:\t" + "&.2f", invValue);
    }
}
