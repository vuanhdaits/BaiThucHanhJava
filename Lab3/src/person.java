import java.util.Scanner;

public class person {
    public int tuoi, chieuCao, canNang;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap vao chieu cao (cm): ");
        chieuCao = sc.nextInt();
        System.out.print("Nhap vao can nang (kg): ");
        canNang = sc.nextInt();
    }

    public void nhapThongTin(int number) {
        System.out.println("Nhap vao so tuoi: " + number);
        System.out.println("Nhap vao chieu cao (cm): " + number);
        System.out.println("Nhap vao can nang (kg): " + number);
    }

    public void inThongtTin() {
        System.out.println("Tuoi = " + tuoi);
        System.out.println("Chieu cao = " + chieuCao + " cm");
        System.out.println("Can nang = " + canNang + " kg");
    }
}