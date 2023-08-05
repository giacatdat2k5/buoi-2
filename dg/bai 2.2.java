import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int n;
       int m;
       int k;
       int s=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap n: ");
       n = sc.nextInt();
       System.out.println("nhap m: ");
       m = sc.nextInt();
       System.out.println("nhap k: ");
       k = sc.nextInt();
    for (int i= n ; i <= m; i++){
        if (i % k == 0){
            s+=i;
            System.out.println("tong la: "+ s);
            
            }
        }
    }
}
