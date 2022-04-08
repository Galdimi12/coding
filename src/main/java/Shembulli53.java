public class Shembulli53 {
    public static void main(String[] args) {
        int rreshtat = 7;
        int count = 1;


        while (count <= rreshtat) {
            int count2 = 1;
            System.out.println();
            while (count2 <= rreshtat) {
                if (count2 < 4) {
                    System.out.print(" ");
                }
                if (count2 == 4) {
                    System.out.print("*");
                }
                if(count2 > 4) {
                    System.out.print(" ");
                }
                count2++;

            }
            count++;

        }
    }

}

//       *
//      ***
//     *****
//    *******
//     *****