import java.util.Scanner;
public class WeatherData {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[][] temperatures = new double[3][7];
        double[] highest = new double[3];
        double[] average = new double[3];
        double total = 0;
        
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 7; column++) {
                System.out.println("Enter temperature for city " + (row + 1) + " on day " + (column + 1) + ":");
                temperatures[row][column] = userInput.nextDouble();
                total += temperatures[row][column];
                
                if (temperatures[row][column] > highest[row]) {
                    highest[row] = temperatures[row][column];
                }
            }

            average[row] = total / 7;
            total = 0;
        }

        for (int resultRow = 0; resultRow < 3; resultRow++) {
            System.out.printf("The average temperature for city %d is: %.2f\n", (resultRow + 1), average[resultRow]);
            System.out.printf("The highest temperature for city %d is: %.2f\n", (resultRow + 1), highest[resultRow]);
        }
    }
}
