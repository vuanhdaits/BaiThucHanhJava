import java.util.Scanner;

public class VAD472Student extends VAD472Person{
    public long maSV;

    @Override
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien cua ban: ");
        maSV = sc.nextLong();
    }

    @Override
    public void xuatThongTin(){
        System.out.println("Ma sinh vien: " + maSV);
    }
}