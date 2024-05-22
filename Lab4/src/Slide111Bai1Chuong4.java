import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide111Bai1Chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> sapXep = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        System.out.print("Nhap: ");
        
        for(int i = 0; i< n; i++){
            int num = sc.nextInt();
            sapXep.add(num);
        }
        int max = -1;
        
        for (Integer integer : sapXep) {
            max = Math.max(max, integer);
            System.out.println("Gia tri lon nhat la: " + max);
        }

        ArrayList<Integer> tmp = new ArrayList<>();
        System.out.println("Gia tri muon xoa: ");
        int num = sc.nextInt();
        tmp.add(num);
        sapXep.remove(tmp);

        Collections.sort(sapXep);
        System.out.println(sapXep);
        sc.close();
    }
}