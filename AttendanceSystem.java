import java.util.Scanner;
public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int totalStudents = 0;
        char presentState = N;
        int totalPresent = 0;
        int totalAbsent = 0;

        System.out.println("Total number of students: ");
        totalStudents = userInput.nextInt();

        for (int studentIndex = 0, studentIndex <= totalStudents, studentIndex++) {
            System.out.print("Is student " + studentIndex + " present? [Y/N]: ");
            presentState = userInput.nextChar();

            if (presentState = 'Y') {
                totalPresent++;
            }
            else if (presentState = 'N') {
                totalAbsent++;
            }
        }
        System.out.println("Total present: " + totalPresent);
        System.out.println("Total absent: " + totalAbsent);
    }
}