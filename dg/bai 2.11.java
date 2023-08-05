
import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("nhap so duong n: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("ban phai nhap so duong");
            }
        } while (n <= 0);
        for (int i=1;i<=n; i++) {
            sum += (1/(float) i);
        }
        System.out.println("Tong = " + sum);
    }
}