import java.util.Scanner;

public class PartTime extends employee {
    public int luong1h = 25000;
    public int gio;
    
    public void so_gio_lam(){   
        Scanner sc = new Scanner(System.in);
        System.out.print("So gio lam: ");
        gio = sc.nextInt();
    }
    
    public void Luong_NV_PartTime(){   
        luong = luong1h*gio;
        inluong();
    }
}