import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap n: ");
        int n = sc.nextInt();
        if (sokkk(n)== true){
            System.out.println("so chan");
        }else{
            System.out.println("so le");
        }  
    }
    public static boolean sokkk(int n){
        if (n%2==0){
            return true;
        }else{
            return false;
        }
    }
    }


