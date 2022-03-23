import java.util.Scanner;


public class Conditions {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Shkruaj Textin 1: ");
        String Texti1 = input.nextLine();
        System.out.println("Shkruaj Textin 2" +
                ": ");
        String Texti2 = input.nextLine();

        if(Texti1.equals(Texti2)) {

            System.out.println("Tekstet jane te njejta ");
        } else  {
            System.out.println("Tekstet nuk jane te njejta");


        }
    }

}
