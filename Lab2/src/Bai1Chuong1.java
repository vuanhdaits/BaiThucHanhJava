import java.util.Scanner;

public class Bai1Chuong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat : ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao so thu hai : ");
        double b = sc.nextDouble();
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = 0;
        double chiaDu = 0;
        if (b != 0) {
            thuong = a / b;
            chiaDu = a % b;
        } else {
            System.out.println("Khong the chia cho 0");
        }
        System.out.println("Tong :" + tong);
        System.out.println("Hieu :" + hieu);
        System.out.println("Tich :" + tich);
        if (b != 0) {
            System.out.println("Thuong :" + thuong);
            System.out.println("Chia lay phan du :" + chiaDu);
        }
        if (a > b) {
            System.out.println(a + " lon hon " + b);
        } else if (a < b) {
            System.out.println(a + " be hon " + b);
        } else {
            System.out.println(" Hai so bang nhau");
        }
    }
}