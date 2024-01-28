import java.util.Scanner;

public class Bai3Slide93 {
    public static void main(String[] args) {
        int tuoi, nam;
        String ten;
        Scanner sc = new Scanner (System.in);

        System.out.println ("Nhap ten cua ban: ");
        ten = sc.nextLine();
        System.out.println ("Nhap vao nam sinh: ");
        nam = sc.nextInt();
        tuoi = 2024 - nam;

        if (tuoi < 16) {
            System.out.println ("Ban " + ten + "o do tuoi vi thanh nien." );
        }
        else if (tuoi >= 16 || tuoi < 18) {
            System.out.println ("Ban " + ten + " o do tuoi truong thanh.");
        }
        else {
            System.out.println ("Ban " + ten + " da gia.");
        }
    }
}