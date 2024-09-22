package com.rhr2408.javatest1;
//do not include package above in submission, it's just to test it because NetBeans IDE 22 forces you to use it

//V3
//Roxas, Hernani Roy
//CITCS 1B-B

import java.util.Scanner;
public class RadixConverter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nCurrent radix is " + userInput.radix() + ".");
        
        byte programState = 2;
        
        while (programState > 1) {
            
            userInput.useRadix(10);
            System.out.println("\nEnter origin radix (2 to 16):");
            
            if (!userInput.hasNextInt()) {
                String otherInputOnRadixField = userInput.nextLine();
                    if (otherInputOnRadixField.equals("STOP")) {
                        System.out.println("\nClosing...");
                        programState--;
                        break;
                    }
            } else {
                int radixFieldInput = userInput.nextInt();
            
                if (radixFieldInput > 1 && radixFieldInput < 17) {
                    userInput.useRadix(radixFieldInput);
                } else if (radixFieldInput <= 1 || radixFieldInput >= 17) {
                    System.out.println("\nUnsupported radix input. Enter a valid radix input.");
                    continue;
                }   
                
                System.out.println("\nInput radix changed to " + userInput.radix());
                
                System.out.println("\nEnter number to convert:");
            
                if (!userInput.hasNextLong()) {
                    String otherInputOnNumberField = userInput.next();
                    switch (otherInputOnNumberField) {
                        default:
                            System.out.println("\nEnter a valid value or type STOP to close.");
                        case "STOP":
                            System.out.println("\nClosing...");
                            programState--;
                            break;
                    }
                } else {
                    long numberFieldInput = userInput.nextLong();
                    for (byte base = 2; base <= 16; base++) {
                    String convertedOutput = Long.toString(numberFieldInput, base);
                    System.out.println("base" + base + ": " + convertedOutput);
                    }
                }
            }
        }
    }
}

/*
//V2
//Roxas, Hernani Roy
//CITCS 1B-B

import java.util.Scanner;
public class RadixConverter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        byte programState = 1;
        while (programState > 0) {
            
            System.out.println("\nEnter origin radix (2 to 16):");
            
            if (!userInput.hasNextByte()) {
                String otherInputOnRadixField = userInput.next();
                switch (otherInputOnRadixField) {
                    default:
                        System.out.println("\nUse a valid origin radix or type STOP to close.");
                    case "STOP":
                        System.out.println("\nClosing...");
                        programState--;
                        break;
                }
            } else {
                byte radixFieldInput = userInput.nextByte();
                userInput.useRadix(radixFieldInput);
                System.out.println("Origin radix is: " + userInput.radix());
            }
            
            System.out.println("\nEnter number to convert:");
            
            if (!userInput.hasNextLong()) {
                String otherInputOnNumberField = userInput.next();
                switch (otherInputOnNumberField) {
                    default:
                        System.out.println("\nEnter a valid value or type STOP to close.");
                    case "STOP":
                        System.out.println("\nClosing...");
                        programState--;
                        break;
                }
            } else {
                long numberFieldInput = userInput.nextLong();
                for (byte base = 2; base <= 16; base++) {
                String convertedOutput = Long.toString(numberFieldInput, base);
                System.out.println("base" + base + ": " + convertedOutput);
                }
            }
        }
    }
}
*/

/*
//V1
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
            } else {
                int radixInput = userInput.nextInt();
                //for (int base = 2, base <= 16, base++) {
                    //userInput.useRadix(base);
                    //System.out.println("Enter number to be converted: ");
                    //long numberInput = userInput.nextLong();
                    //String convertedOutput = Long.toString(numberInput, base);
                    //System.out.println("base" + base + ": " + convertedOutput);
                //}
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
                        userInput.useRadix(4);
                        System.out.println("\nEnter number to be converted: ");
                        long inputFour = userInput.nextLong();
                        String baseFourTwo = Long.toString(inputFour, 2);
                        String baseFourThree = Long.toString(inputFour, 3);
                        String baseFourFour = Long.toString(inputFour, 4);
                        String baseFourFive = Long.toString(inputFour, 5);
                        String baseFourSix = Long.toString(inputFour, 6);
                        String baseFourSeven = Long.toString(inputFour, 7);
                        String baseFourEight = Long.toString(inputFour, 8);
                        String baseFourNine = Long.toString(inputFour, 9);
                        String baseFourTen = Long.toString(inputFour, 10);
                        String baseFourEleven = Long.toString(inputFour, 11);
                        String baseFourTwelve = Long.toString(inputFour, 12);
                        String baseFourThirteen = Long.toString(inputFour, 13);
                        String baseFourFourteen = Long.toString(inputFour, 14);
                        String baseFourFifteen = Long.toString(inputFour, 15);
                        String baseFourSixteen = Long.toString(inputFour, 16);
                    
                        System.out.println("\nbase2: " + baseFourTwo);
                        System.out.println("base3: " + baseFourThree);
                        System.out.println("base4: " + baseFourFour);
                        System.out.println("base5: " + baseFourFive);
                        System.out.println("base6: " + baseFourSix);
                        System.out.println("base7: " + baseFourSeven);
                        System.out.println("base8: " + baseFourEight);
                        System.out.println("base9: " + baseFourNine);
                        System.out.println("base10: " + baseFourTen);
                        System.out.println("base11: " + baseFourEleven);
                        System.out.println("base12: " + baseFourTwelve);
                        System.out.println("base13: " + baseFourThirteen);
                        System.out.println("base14: " + baseFourFourteen);
                        System.out.println("base15: " + baseFourFifteen);
                        System.out.println("base16: " + baseFourSixteen);
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
}
*/
