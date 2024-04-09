import java.util.Scanner;

public class HinhVuongKeThua extends HinhChuNhatKeThua {

    public void hinhVuong(){
        ten = "hinh vuong";
    }
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap canh: ");
        chieuDai = chieuRong = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = chieuDai * 4;
    }

    public void tinhDienTich(){
        dienTich = chieuDai * chieuDai;
    }
}