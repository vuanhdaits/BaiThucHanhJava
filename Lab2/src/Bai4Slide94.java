import java.util.Scanner;

public class Bai4Slide94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Nhap mot so bat ky: ");
        int thang = sc.nextInt();

        switch (thang) {
            case 1:
                System.out.println("Thang mot");
                break;
            case 2:
                System.out.println("Thang hai");
                break;
            case 3:
                System.out.println("Thang ba");
                break;
            case 4:
                System.out.println("Thang tu");
                break;
            case 5:
                System.out.println("Thang nam");
                break;
            case 6:
                System.out.println("Thang sau");
                break;
            case 7:
                System.out.println("Thang bay");
                break;
            case 8:
                System.out.println("Thang tam");
                break;
            case 9:
                System.out.println("Thang chin");
                break;
            case 10:
                System.out.println("Thang muoi");
                break;
            case 11:
                System.out.println("Thang muoi mot");
                break;
            case 12:
                System.out.println("Thang muoi hai");
                break;
            default:
                break;
        }
    }
}