import java.util.Scanner;

public class VAD472Person {
    public String hoVaTen;
    public int tuoi;
    public float chieuCao;
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten cua ban: ");
        hoVaTen = sc.nextLine();
        System.out.print("Nhap tuoi cua ban: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap chieu cao cua ban (cm): ");
        chieuCao = sc.nextFloat();
    }

    public void xuatThongTin(){
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println(tuoi + " tuoi");
        System.out.println("Chieu cao: " + chieuCao +"cm");
    }
}