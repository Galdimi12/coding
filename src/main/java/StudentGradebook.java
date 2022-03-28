import java.util.Scanner;

public class StudentGradebook {
    public static void main( String[] args) {
     Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter =1;
        int result;

        while (studentCounter <= 10) {
            System.out.println("Enter result (1=pass, 2=fail: ");
            result = input.nextInt();

            if (result == 1)
                passes = passes + 1;
            else
                failures = failures + 1;

            studentCounter = studentCounter + 1;
        }
        System.out.println( "Passed: " + passes + " Failed: "+  failures );
        if (passes > 8) {
            System.out.println("Bonus to the instructor!");
    } else
    System.out.println("Not enough passed students");
}
}


