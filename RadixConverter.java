import java.util.Scanner;
public class RadixConverter {
public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        byte programState = 1;
        while (programState > 0) {

            System.out.println("\nEnter origin radix (2 to 16) or STOP: ");
            
            if (!userInput.hasNextInt()) {
                String textInput = userInput.nextLine();
                switch (textInput){
                    case "STOP":
                        System.out.println("\nClosing program");
                        programState--;
                        break;
                    default:
                        System.out.println("\nType STOP to close program");
                }        
            }
            
            int radixInput = userInput.nextInt();
            switch (radixInput) {
                default:
                    System.out.println("\nTry again, only base2 to base16");
                case 2:
                    userInput.useRadix(2);
                    System.out.println("\nEnter number to be converted: ");
                    long inputTwo = userInput.nextLong();
                    String baseTwoTwo = Long.toString(inputTwo, 2);
                    String baseTwoThree = Long.toString(inputTwo, 3);
                    String baseTwoFour = Long.toString(inputTwo, 4);
                    String baseTwoFive = Long.toString(inputTwo, 5);
                    String baseTwoSix = Long.toString(inputTwo, 6);
                    String baseTwoSeven = Long.toString(inputTwo, 7);
                    String baseTwoEight = Long.toString(inputTwo, 8);
                    String baseTwoNine = Long.toString(inputTwo, 9);
                    String baseTwoTen = Long.toString(inputTwo, 10);
                    String baseTwoEleven = Long.toString(inputTwo, 11);
                    String baseTwoTwelve = Long.toString(inputTwo, 12);
                    String baseTwoThirteen = Long.toString(inputTwo, 13);
                    String baseTwoFourteen = Long.toString(inputTwo, 14);
                    String baseTwoFifteen = Long.toString(inputTwo, 15);
                    String baseTwoSixteen = Long.toString(inputTwo, 16);
                    
                    System.out.println("\nbase2: " + baseTwoTwo);
                    System.out.println("base3: " + baseTwoThree);
                    System.out.println("base4: " + baseTwoFour);
                    System.out.println("base5: " + baseTwoFive);
                    System.out.println("base6: " + baseTwoSix);
                    System.out.println("base7: " + baseTwoSeven);
                    System.out.println("base8: " + baseTwoEight);
                    System.out.println("base9: " + baseTwoNine);
                    System.out.println("base10: " + baseTwoTen);
                    System.out.println("base11: " + baseTwoEleven);
                    System.out.println("base12: " + baseTwoTwelve);
                    System.out.println("base13: " + baseTwoThirteen);
                    System.out.println("base14: " + baseTwoFourteen);
                    System.out.println("base15: " + baseTwoFifteen);
                    System.out.println("base16: " + baseTwoSixteen);
                case 3:
                    userInput.useRadix(3);
                    System.out.println("\nEnter number to be converted: ");
                    long inputThree = userInput.nextLong();
                    String baseThreeTwo = Long.toString(inputThree, 2);
                    String baseThreeThree = Long.toString(inputThree, 3);
                    String baseThreeFour = Long.toString(inputThree, 4);
                    String baseThreeFive = Long.toString(inputThree, 5);
                    String baseThreeSix = Long.toString(inputThree, 6);
                    String baseThreeSeven = Long.toString(inputThree, 7);
                    String baseThreeEight = Long.toString(inputThree, 8);
                    String baseThreeNine = Long.toString(inputThree, 9);
                    String baseThreeTen = Long.toString(inputThree, 10);
                    String baseThreeEleven = Long.toString(inputThree, 11);
                    String baseThreeTwelve = Long.toString(inputThree, 12);
                    String baseThreeThirteen = Long.toString(inputThree, 13);
                    String baseThreeFourteen = Long.toString(inputThree, 14);
                    String baseThreeFifteen = Long.toString(inputThree, 15);
                    String baseThreeSixteen = Long.toString(inputThree, 16);
                    
                    System.out.println("\nbase2: " + baseThreeTwo);
                    System.out.println("base3: " + baseThreeThree);
                    System.out.println("base4: " + baseThreeFour);
                    System.out.println("base5: " + baseThreeFive);
                    System.out.println("base6: " + baseThreeSix);
                    System.out.println("base7: " + baseThreeSeven);
                    System.out.println("base8: " + baseThreeEight);
                    System.out.println("base9: " + baseThreeNine);
                    System.out.println("base10: " + baseThreeTen);
                    System.out.println("base11: " + baseThreeEleven);
                    System.out.println("base12: " + baseThreeTwelve);
                    System.out.println("base13: " + baseThreeThirteen);
                    System.out.println("base14: " + baseThreeFourteen);
                    System.out.println("base15: " + baseThreeFifteen);
                    System.out.println("base16: " + baseThreeSixteen);
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
            }
        }
    }
}
