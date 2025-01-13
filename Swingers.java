package javaapplication28;
import java.util.Scanner;
import javax.swing.*;

public class Swingers {
    public static void main(String[] args) {
        //interface
        JFrame userWindow = new JFrame("Reserve");
        JButton confirmButton = new JButton("Confirm");
        
        userWindow.setSize(600, 600);
        userWindow.setVisible(true);
        
        //input
        Scanner userInput = new Scanner(System.in);
        
        //storage
        String rooms[] = new String[10];
        
        String reserveRequest = null;
        int roomSelection = 0;
        
        if (rooms[roomSelection].isEmpty()) {
            rooms[roomSelection] = reserveRequest;
            System.out.println("result a");
        } else {
            System.out.println("result b");
        }
    }
}
