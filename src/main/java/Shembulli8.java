public class Shembulli8 {
    public static void main( String[] args) {

        int numri = 323;
        int br = numri % 10;
        int br1 = numri / 10;
        int br2 = br1 % 10;
        int br3 = br1 / 10;
        int br4 = br3 % 10;
        int sum = br + br2 + br4;

        System.out.println(br);
        System.out.println(br2);
        System.out.println(br4);
        System.out.println("the sum of all numbers: "+sum);
    }


}
