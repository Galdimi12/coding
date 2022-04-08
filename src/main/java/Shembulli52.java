public class Shembulli52 {
    public static void main(String[] args) {


        int n = 5;
        int i = 1;
        int j = 1;

        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
