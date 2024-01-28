import java.util.Scanner;

public class Bai2Slide92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot so bat ky: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " la so chan.");
        } else {
            System.out.print(a + " la so le.");
        }
    }
}