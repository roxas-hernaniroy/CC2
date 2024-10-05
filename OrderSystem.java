import java.util.Scanner;
public class OrderSystem {
    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    int menuSelection = 5;
    int quantitySelection = 0;
    int totalCost = 0;

    System.out.println("MENU\n1. Burger\t- PHP 100\n2. Fries\t- PHP  50\n3. Soda\t- PHP  30\n4. Ice Cream\t- PHP  45\n5. Exit);
    
    System.out.print("Enter menu number: ");
    menuSelection = userInput.nextInt();
    
    if (menuSelection > 5 || menuSelection < 1) {
        System.out.println("Invalid order.");
    }
    else {
    System.out.print("Enter quantity: );
    quantitySelection = userInput.nextInt();
        
        if (quantitySelection <= 0) {
            System.out.println("Invalid quantity.");
        }
    }

    System.out.println("You have ordered " + quantitySelection + " " + menuSelection + ".");
    
    switch (menuSelection) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
    }
    }
}