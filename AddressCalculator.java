//add total element calculation

package com.mycompany.addresscalculator;


import java.util.Scanner;

public class AddressCalculator {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of dimensions: ");
        int dimensions = sc.nextInt();

        System.out.print("Enter base address: ");
        int base = sc.nextInt();

        System.out.print("Enter element size: ");
        int size = sc.nextInt();

        int[] bounds = new int[dimensions];
        System.out.println("Enter upper bounds for each dimension:");
        for (int i = 0; i < dimensions; i++) {
        System.out.print("Bound for dimension " + (i + 1) + ": ");
        bounds[i] = sc.nextInt();
        }

        int[] indices = new int[dimensions];
        System.out.println("Enter the indices for the target element:");
        for (int i = 0; i < dimensions; i++) {
        System.out.print("Index for dimension " + (i + 1) + ": ");
        indices[i] = sc.nextInt();
        }

        int offset = calculateOffset(indices, bounds);
        int address = base + offset * size;

        System.out.println("The address of the target element is: " + address);

    sc.close();
    }

    public static int calculateOffset(int[] indices, int[] bounds) {
        int offset = 0;
        int product = 1;

        for (int i = indices.length - 1; i >= 0; i--) {
        offset += indices[i] * product;
        product *= bounds[i];
        }

        return offset;
    }
}


