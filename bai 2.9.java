import java.util.Scanner;
public class App {
public static void main(String[] args) {
        int n;
        float sum = 0;
        int giaiThua = 1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số nguyên dương n:");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương!");
            }
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
            sum += (i / (float) giaiThua);
        }
        System.out.println("Tổng = " + sum);
    }
}
