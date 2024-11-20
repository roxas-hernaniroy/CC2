import java.util.Scanner;
public class WeatherData {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        
       
        double[][] weather = new double[2][5];
        
        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[i].length; j++) {
                System.out.println("Input weather of city " + (i + 1) + " for day " + (j + 1)+ ":");
                weather[i][j] = userInput.nextInt();
            }
        }
        
        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[i].length; j++) {
                System.out.println("City " + (i + 1) + " day " + (j + 1) + ": " + weather[i][j]);
            }
        }
    }
}
