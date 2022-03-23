import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Shembulli7 {
    public static void main( String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("");
        double minutes = 3456789;
        double hours = minutes / 60;
        double days = hours / 24;

        double years = days /365;
        double dayLeft = days * years;

        int Result = (int) years;

        System.out.println(minutes + " Minuta jane " + Result + " vjet dhe " );



    }

}
