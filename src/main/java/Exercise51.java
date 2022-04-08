import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {

        // Krijo programin qe kalkulon rrogen netto prej brutto te puntorve.
        Scanner input = new Scanner(System.in);

        double rroga = 0;


        while (rroga != -1 ) {

            System.out.println("Shkruaj rrogen brutto (-1 perfundon programin): " );
            rroga = input.nextDouble();

            if (rroga >= 1 && rroga <= 180 ) {

                System.out.println("Rroga netto: "+ rroga);
            }
            if(rroga >= 180 && rroga <= 250) {

                double  rrogaNetto  = rroga - rroga * 0.05;
                System.out.println("Rroga netto: "+ rrogaNetto);
            }
            if (rroga >= 250 && rroga<= 800 ) {

                double  rrogaNetto  = rroga - rroga * 0.10;
                System.out.println("Rroga netto: "+ rrogaNetto);

            }
            if (rroga > 800) {

                double  rrogaNetto  = rroga - rroga * 0.15;
                System.out.println("Rroga netto: "+ rrogaNetto);
            }
        }

        //Per rrogat nga 1 - 180 euro nuk ka tatim
        //Per rrogat 180 - 250 euro ka 5% tatim
        //Per rrogat 250 - 800 euro ka 10% tatim
       // Per rrogat 800+ euro ka 15% tatim

       // rroga - rroga * tatimi = netto
        // 500 - 500 * 0.10 = 450




    }
}
