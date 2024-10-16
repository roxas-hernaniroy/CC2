//Roxas, Hernani Roy B.
//CITCS 1B-B

import java.util.Scanner;
public class OrderSystem {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int menuSelection = 5;
        int quantitySelection = 0;
        int totalCost = 0;

        System.out.println("MENU\n1. Burger\t\t- PHP 100\n2. Fries\t\t- PHP  50\n3. Soda\t\t\t- PHP  30\n4. Ice Cream\t- PHP  45\n5. Exit");
    
        System.out.print("Enter menu number: ");
        menuSelection = userInput.nextInt();
    
        if (menuSelection > 5 || menuSelection < 1) {
            System.out.println("Invalid order.");
            System.exit(0);
        }
        else if (menuSelection == 5) {
            System.out.println("Exiting program.");
            System.exit(0);
        }

        System.out.print("Enter quantity: ");
        quantitySelection = userInput.nextInt();
        
        if (quantitySelection <= 0) {
            System.out.println("Invalid quantity.");
            System.exit(0);
        }
    
        switch (menuSelection) {
            case 1:
                System.out.println("You have ordered " + quantitySelection + " burgers.");
                totalCost = 100 * quantitySelection;
                break;
            case 2:
                System.out.println("You have ordered " + quantitySelection + " fries.");
                totalCost = 50 * quantitySelection;
                break;
            case 3:
                System.out.println("You have ordered " + quantitySelection + " soda.");
                totalCost = 30 * quantitySelection;
                break;
            case 4:
                System.out.println("You have ordered " + quantitySelection + " ice cream.");
                totalCost = 45 * quantitySelection;
                break;
        }
        System.out.println("Total amount: " + totalCost);
        userInput.close();
    }
}
