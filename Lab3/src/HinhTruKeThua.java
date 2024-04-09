import java.util.Scanner;

public class HinhTruKeThua extends HinhTronKeThua{
    public float chieuCao;

    public void hinhTru(){
        ten = "hinh tru";
    }

    public void nhapChieuCao(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap chieu cao: ");
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich(){
        theTich = dienTich * chieuCao;
    }
}