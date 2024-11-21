import java.util.Scanner;
public class GradeTracker {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        double total = 0;

        System.out.println("How many students are there?");
        int studentCount = userInput.nextInt();
        String[] studentNames = new String[studentCount];
        double[] studentAverage = new double[studentCount];

        System.out.println("How many subjects are in the course?");
        int subjectCount = userInput.nextInt();
        double[][] grades = new double[studentCount][subjectCount];
        userInput.nextLine();

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            System.out.println("What is the name of student " + (studentIndex + 1) + "?");
            studentNames[studentIndex] = userInput.nextLine();
        }

        for (int row = 0; row < studentCount; row++) {
            for (int column = 0; column < subjectCount; column++) {
                System.out.println("What is " + studentNames[row] + "'s grade in subject " + (column + 1) + "?");
                grades[row][column] = userInput.nextDouble();
                total += grades[row][column];
            }

            double average = total / subjectCount;
            studentAverage[row] = average;
            total = 0;
        }

        for (int resultIndex = 0; resultIndex < studentCount; resultIndex++) {
            System.out.printf(studentNames[resultIndex] + "'s average grade is %.2f\n", studentAverage[resultIndex]);
        }
    }
}
