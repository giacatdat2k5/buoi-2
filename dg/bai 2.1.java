import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        int soNguyen;
        int sum = 0;

        do{
            System.out.println("moi nhap n: ");
            n = sc.nextInt();
            if(n<=0){
            System.out.println("moi nhap lai n: ");
            }
         }while (n<=0);
         int i=1;
        while(i<=n){
            do{
            System.out.println("nhap phan tu n: ");
            soNguyen = sc.nextInt();
            if( soNguyen <= 0){
                System.out.println("nhap so nguyen duong: ");
            }
            }while( soNguyen <=0);
            if ( soNguyen % 4 == 0 || ((soNguyen /100)%10) == 3){
                sum = sum + soNguyen;
            }
            i++;
         }
         System.out.println("tong la: "+sum);
    }     
}
