import java.util.Scanner;

public class Slide35Chuong2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner (System.in);

        System.out.println("Nhap hai so bat ky: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        if (a > b) {
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
}