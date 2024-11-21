import java.util.Scanner;
public class WeatherData {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[][] weather = new double[3][7];
        
        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[i].length; j++) {
                System.out.println("Input temperature of city " + (i + 1) + " for day " + (j + 1)+ ":");
                weather[i][j] = userInput.nextDouble();
                int total = 0;
            }
        }
        
        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[i].length; j++) {
                System.out.print(weather[i][j] + " ");
            }
            System.out.println();
        }
    }
}
