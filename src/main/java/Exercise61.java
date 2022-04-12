import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int Count =0;
        for(;Count !=-999;) {
            System.out.println("Shkruaj numrin e dyte: ");
            int Number2 = Scan.nextInt();
            System.out.println("Shkruaj numrin e pare: ");
            int Number1 = Scan.nextInt();
            int Result = Number1 * Number2;
            System.out.println( Number1 + " x " + Number2+ " = " +Result);

        }
    }
}
