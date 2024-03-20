import java.util.Scanner;

public class HinhTron {
    public float duongKinh, chuVi, dienTich;
    public final float PI = 3.14f;

    public void nhapDuongKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap duong kinh cua hinh tron: ");
        duongKinh = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = 2 * PI * duongKinh;
    }
    public void tinhDienTich() {
        dienTich = PI + duongKinh * duongKinh;
    }
    public void inChuVi() {
        System.out.println("Chu vi cua hinh tron = " + chuVi);
    }
    public void inDienTich() {
        System.out.println("Dien tich cua hinh tron = " + dienTich);
    }
}