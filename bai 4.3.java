import java.util.Scanner;

public class sVien {
    private String hoTen;
    private String lop;
    private int tuoi;
    private String queQuan;
    private int sdt;
    private String gioiTinh;
    private String hocLuc;
    private int chieuCao;
    private int canNang;
    private int diemThi;
    public String getHoTen(){
        return this.hoTen;
    }
    public void setHoten(String hoTen){
        this.hoTen= hoTen ;
    }
    public String getLop(){
        return this.lop;
    }
    public void setLop(String lop){
        this.lop = lop;
    }
    public int getTuoi(){
        return this.tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public String getQueQuan(){
        return this.queQuan;
    }
    public void setQueQuan(String queQuan){
        this.queQuan = queQuan;
    }
    public int getSdt(){
        return this.sdt;
    }
    public void setSdt(int sdt){
        this.sdt = sdt;
    }
    public String getGioiTinh(){
        return this.gioiTinh;
    }
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public String getHocLuc(){
        return this.hocLuc;
    }
    public void setHocluc(String hocLuc){
        this.hocLuc = hocLuc;
    }
    public int getChieuCao(){
        return this.chieuCao;
    }
    public void setChieuCao(int chieuCao){
        this.chieuCao = chieuCao;
    }
    public int getCanNang(){
        return this.canNang;
    }
    public void setCanNang(int canNang){
        this.canNang = canNang;
    }
    public int getDiemThi(){
        return this.diemThi;
    }
    public void setDiemThi(int diemThi){
        this.diemThi = diemThi;
    }
    public sVien(){
    }
    public sVien(String hoTen,int chieuCao,int canNang){
        this.hoTen = hoTen;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }
    public sVien(String hoTen, int sdt,String hocLuc){
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.hocLuc = hocLuc;
    }
    public sVien(String hoten,String queQuan, String gioiTinh ){
        this.hoTen = hoten;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
    }
    public sVien(int chieuCao,String gioiTinh ,int canNang){
        this.chieuCao = chieuCao;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
    }
    public void thongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten");
        setHoten(sc.nextLine());
        System.out.println("nhap lop");
        setLop(sc.nextLine());
        System.out.println("nhap tuoi");
        setTuoi(sc.nextInt());
        System.out.println("nhap que quan");
        setQueQuan(sc.nextLine());
        System.out.println("nhap sdt");
        setSdt(sc.nextInt());
        System.out.println("nhap gioi tinh");
        setGioiTinh(sc.nextLine());
        System.out.println("nhap hoc luc");
        setHocluc(sc.nextLine());
        System.out.println("nhap chieu cao");
        setChieuCao(sc.nextInt());
        System.out.println("nhap can nang");
        setCanNang(sc.nextInt());
        System.out.println("nhap diem thi");
        setDiemThi(sc.nextInt());
    }
    public void hienThiTT(){
        System.out.println("ho ten sv"+getHoTen());
        System.out.println("lop sv"+getLop());
        System.out.println("tuoi sv"+getTuoi());
        System.out.println("que quan sv"+getQueQuan());
        System.out.println("sdt sv"+getSdt());
        System.out.println("gioi tinh sv"+getGioiTinh());
        System.out.println("hoc luc sv"+getHocLuc());
        System.out.println("chieu cao sv"+getChieuCao());
        System.out.println("can nang sv"+getCanNang());
        System.out.println("diem thi sv"+getDiemThi());
    }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n;
            sVien[] sv;
            do {
                System.out.print("So luong sv: ");
                n = input.nextInt();
                if (n < 0) {
                    System.out.println("so phai lon hon 0");
                }
            } while (n < 0);
            sv = new sVien[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Sinh vien " + (i + 1) + ": ");
                sv[i] = new sVien();
                sv[i].thongTin();
            }
            for (int i = 0; i < n; i++) {
                sv[i].hienThiTT();
            }
    
        }
    }    
   
    


