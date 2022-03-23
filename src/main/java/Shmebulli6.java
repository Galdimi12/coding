import java.util.Scanner;

public class Shmebulli6 {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nje muaj kushton: ");
        double cmimi= input.nextDouble();
        System.out.println("Sa ore ka nje muaj: ");
        double oret= input.nextDouble();

        double cmimiPerOre = cmimi/oret;
        System.out.println(cmimiPerOre + " euro");



    }
}
