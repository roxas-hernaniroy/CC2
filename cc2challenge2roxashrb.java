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
        System.out.print("The length of the garden is " + L + ". ");
        System.out.println("The width of the garden is " + W + ".");
        System.out.println("The area of the garden is " + A + ".");
        System.out.println("The perimeter of the garden is " + P + ".");
    }
}
