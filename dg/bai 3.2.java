import java.util.Scanner;

public class App {
        //Viết chương trình sử dụng hàm tính diện tích hình tròn 
        //với bán kính r bất 
        //kỳ được nhập từ bàn phím. ( r được nhập trong hàm Main ) 
            static void tinhdientichtron(int r){
                Scanner sc = new Scanner(System.in);
                System.out.println("moi nhap r: ");
                r = sc.nextInt();
                System.out.println("dien tich hinh tron"+ r*r*3.14);

            }
            
        }
  

