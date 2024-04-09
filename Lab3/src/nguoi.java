import java.util.Scanner;

public class nguoi {
    public String hoTen;
    public int tuoi;
    public String diaChi;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        
    }

    public void xuatThongTin(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Tuoi: " + tuoi);
    }

    public nguoi(){
        hoTen = "Vu Anh Dai";
        diaChi = "Phu Tho";
        tuoi = 20;
    }
}