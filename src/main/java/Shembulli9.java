import java.util.Scanner;

public class Shembulli9 {

    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        while (count <= 13) {
            System.out.println("Enter number: " + count);
            count++;
        }
    }
}
