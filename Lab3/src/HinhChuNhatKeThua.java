import java.util.Scanner;

public class HinhChuNhatKeThua extends HInhHoc{
    public float chieuDai, chieuRong;

    public void hinhChuNhat(){
        ten = "hinh chu nhat";
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        chieuRong = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = (chieuDai + chieuRong) * 2;
    }

    public void tinhDienTich(){
        dienTich = chieuDai * chieuRong;
    }
}