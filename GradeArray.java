import java.util.Scanner;
public class GradeArray {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int[] grades = new int[5];
        int gradeSum = 0;
        int gradesHigh = 0;
        int gradesLow = 100;
        
        
        for (int gradeIndex = 0; gradeIndex <=4; gradeIndex++) {
            System.out.println("Enter student grade [" + (gradeIndex + 1) + "]:");
            grades[gradeIndex] = userInput.nextInt();
            
            gradeSum = grades[gradeIndex] + gradeSum; 
            
            if (grades[gradeIndex] > gradesHigh) {
                gradesHigh = grades[gradeIndex];
            }
            
            if (grades[gradeIndex] < gradesLow) {
                gradesLow = grades[gradeIndex];
            }
        }
        
        double gradesAverage = gradeSum / 5;
        
        System.out.printf("\nAverage grade:\t" + "%.2f", gradesAverage);
        System.out.println("\nHighest grade:\t" + gradesHigh + "\nLowest grade:\t" + gradesLow);
    }
}
