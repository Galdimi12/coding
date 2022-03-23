import java.util.Scanner;

public class Ushtrime4 {
    public static void main( String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Skruaj numrin e oreve: ");
        double oret = input.nextDouble();
        System.out.println("Skruaj numrin e minutave: ");
        double minuta = input.nextDouble();

        double minutat = oret/minuta;
        System.out.println(minutat + " ore");
    }
}
