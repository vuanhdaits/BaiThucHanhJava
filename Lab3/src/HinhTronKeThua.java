import java.util.Scanner;

public class HinhTronKeThua extends HInhHoc {
    public float duongKinh;

    public void hinhTron(){
        ten = "hinh tron";
    }

    public void nhapDuongKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap duong kinh: ");
        duongKinh = sc.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * Pi * duongKinh;
    }

    public void tinhDienTich() {
        dienTich = Pi + duongKinh * duongKinh;
    }
}