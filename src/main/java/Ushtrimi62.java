import java.util.Scanner;

public class Ushtrimi62 {
    public static void main(String[] args) {
        System.out.println("Cili eshte kryeqyteti i Japonise: ");
        String Kryeqyteti1 = "a. Tokyo";
        String Kryeqyteti2 = "b. Berlin";
        String Kryeqyteti3 = "c. Londer";
        System.out.println(Kryeqyteti1);
        System.out.println(Kryeqyteti2);
        System.out.println(Kryeqyteti3);
        Scanner input = new Scanner(System.in);

        System.out.println("Shkruaj Pergjigjjen tuaj: ");
        String a = input.nextLine();


        if (a.equals(Kryeqyteti1)) {
            System.out.println("Urime pergjigjja e pare eshte e sakte");
            System.out.println("Pergjigjjet e pasakta jane " + Kryeqyteti2 + " dhe  " + Kryeqyteti3);
        } else if (a.equals(Kryeqyteti2) || a.equals(Kryeqyteti3) )  {
            System.out.println("Perjgigjja eshte e pasakte");
        } else if (a.equals(Kryeqyteti1)) {
            System.out.println("Pergjigjjet e pasakta jane " + Kryeqyteti2 + " " + Kryeqyteti3);
        }
    }
}
