import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        int n, so_du, tong = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao mot so duong bat ky: ");
        n = sc.nextInt();

        while (n > 0) {
            so_du = n % 10;
            n = n / 10;
            tong = tong + so_du;
        }
        System.out.println("Tong cac chu so = " + tong);
    }
}