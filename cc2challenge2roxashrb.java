/*
Roxas, Hernani Roy B.
CC2 CITCS 1B-B
2024-09-09
Laboratory Challenge 2: Calculating The Area and Perimeter of a Rectangle
*/

public class cc2challenge2roxashrb {
    public static void main(String[] args) {
        /* for example, we have a garden with these values:
            the length of the garden is 42 meters
            the width of the garden is 12 meters
        */
        //set variables and print area
        int L = 42, W = 12;
        int A = L * W;
        int P = 2 * (L + W);
        
        //print results
        System.out.print("The length of the garden is " + L + "meters, ");
        System.out.println("and its width is " + W + "meters.");
        System.out.print("The area of the garden is " + A + "meters, ");
        System.out.println("and its perimeter is " + P + "meters.");
    }
}
