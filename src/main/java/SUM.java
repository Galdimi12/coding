public class SUM {
    public static void main( String[] args) {
        int N = 999;
        double M = (double) N / 10;
        int Mint = (int)M;
        double x = M - Mint;

        double M1 = (double) Mint / 10;
        int M1int =  (int)M1;
        double x1 = M1 - M1int;

        System.out.println(x);
        System.out.println(x1);
        System.out.println(M1int);
      double Result = x * 10 + x1 * 10 + M1int;
        System.out.println( Result);


    }

}
