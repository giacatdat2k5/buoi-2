import java.util.Scanner;
public class HocSinh{
    private String hoTen;
    private String lop;
    private int diemtrungbinh;
    public String getHoten(){
        return hoTen;
    }
    public void setHoten(String hoTen){
        this.hoTen = hoTen;
    }
    public String getLop(){
        return lop;
    }
    public void setLop(String lop){
        this.lop = lop;
    }
    public int getDiemtrungbinh(){
        return diemtrungbinh;
    }
    private void setDiemtrungbinh(int diemtrungbinh){
        this.diemtrungbinh = diemtrungbinh;
    }
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten hs");
        setHoten(sc.nextLine());
        System.out.println("nhap lop hs");
        setLop(sc.nextLine());
        System.out.println("nhap dtb hs");
        setDiemtrungbinh(sc.nextInt());
    }
    public void hienThiTT(){
        System.out.println("ho va ten"+getHoten());
        System.out.println("lop hs"+getLop());
        System.out.println("diem tb hs "+getDiemtrungbinh());
    }
    public static void main(String[] args) {
        Scanner hs = new Scanner(System.in);
        HocSinh a = new HocSinh();
        HocSinh b = new HocSinh();
        System.out.println("nhap tt hs a");
        a.nhapTT();
        System.out.println("nhap tt hs b");
        b.nhapTT();
        System.out.println("hoc sinh diem cao hon la");
        if (a.getDiemtrungbinh() > b.getDiemtrungbinh()){
            a.hienThiTT();
        }else{
            b.hienThiTT();
        }
    }
    }
        