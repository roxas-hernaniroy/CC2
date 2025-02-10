import java.util.Scanner;

public class TestMain {

    // Method to calculate array address
    public static void arrayAddressCalculation() {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of dimensions
        System.out.print("Enter the number of dimensions: ");
        int dimensions = scanner.nextInt();

        // Input: Base address
        System.out.print("Enter the base address: ");
        int baseAddress = scanner.nextInt();

        // Input: Size of each element
        System.out.print("Enter the size of each element (in bytes): ");
        int elementSize = scanner.nextInt();

        // Input: Number of elements in each dimension
        int[] numElements = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            System.out.print("Enter the number of elements in dimension " + (i + 1) + ": ");
            numElements[i] = scanner.nextInt();
        }

        // Input: Indices for each dimension
        int[] indices = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            System.out.print("Enter the index for dimension " + (i + 1) + ": ");
            indices[i] = scanner.nextInt();
        }

        // Calculate total number of elements
        int totalElements = 1;
        for (int num : numElements) {
            totalElements *= num;
        }
        System.out.println("Total number of elements: " + totalElements);

        // Calculate address
        int address = baseAddress;
        int multiplier = 1;
        for (int i = dimensions - 1; i >= 0; i--) {
            address += indices[i] * multiplier * elementSize;
            multiplier *= numElements[i];
        }
        System.out.println("Computed address: " + address);
    }

    // Method to calculate record address
    public static void recordAddressCalculation() {
        Scanner scanner = new Scanner(System.in);

        // Input: Base address
        System.out.print("Enter the base address of the record: ");
        int baseAddress = scanner.nextInt();

        // Input: Number of fields
        System.out.print("Enter the number of fields in the record: ");
        int numFields = scanner.nextInt();

        // Input: Size and offset of each field
        int[] fieldSizes = new int[numFields];
        int[] fieldOffsets = new int[numFields];
        for (int i = 0; i < numFields; i++) {
            System.out.print("Enter the size of field " + (i + 1) + " (in bytes): ");
            fieldSizes[i] = scanner.nextInt();
            if (i == 0) {
                fieldOffsets[i] = 0; // First field starts at offset 0
            } else {
                fieldOffsets[i] = fieldOffsets[i - 1] + fieldSizes[i - 1];
            }
        }

        // Display field offsets
        System.out.println("Field offsets:");
        for (int i = 0; i < numFields; i++) {
            System.out.println("Field " + (i + 1) + ": " + fieldOffsets[i] + " bytes");
        }

        // Input: Field to compute address for
        System.out.print("Enter the field number to compute the address for: ");
        int fieldNumber = scanner.nextInt();

        // Compute and display address
        if (fieldNumber < 1 || fieldNumber > numFields) {
            System.out.println("Invalid field number!");
        } else {
            int address = baseAddress + fieldOffsets[fieldNumber - 1];
            System.out.println("Computed address for field " + fieldNumber + ": " + address);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Array Address Calculation");
        System.out.println("2. Record Address Calculation");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                arrayAddressCalculation();
                break;
            case 2:
                recordAddressCalculation();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}