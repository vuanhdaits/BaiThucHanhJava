import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Slide114Bai4Chuong4 {
    public static void main(String[] args) {
        HashSet<String> gioHang = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Them trai cay vao gio hang: ");
        while (true) {
            String loaiTraiCay = sc.nextLine();
            if(loaiTraiCay.equalsIgnoreCase("x")){
                break;
            }
            gioHang.add(loaiTraiCay);
        }
        System.out.println("So luong trai cay trong gio hang la: " + gioHang.size());

        System.out.println("Nhap ten loai trai cay can kiem tra: ");
        String loaiTraiCay = sc.nextLine();
        if(gioHang.contains(loaiTraiCay)){
            System.out.println("Co tim thay loai trai cay nay!");
        }else{
            System.out.println("Khong tim thay loai trai cay nay");
        }
        //xoa 1 loai trai cay bat ki
        System.out.println("Nhap loai trai cay can loai bo: ");
        String loaiTraiCayCanLoaiBo = sc.nextLine();
            if(gioHang.remove(loaiTraiCayCanLoaiBo)){
                System.out.println("Da xoa " +  loaiTraiCayCanLoaiBo);
            }else{
                System.out.println("Khong tim thay " + loaiTraiCayCanLoaiBo + " de xoa");
            }
        System.out.println("So luong trai cay con lai trong gio Hang la: " + gioHang.size());

           List<String> fruitList = new ArrayList<>();
        System.out.println("Nhap ten cac loai trai cay cho List: ");
        while (true) {
            String fruit = sc.nextLine();
            if (fruit.equalsIgnoreCase("x")) {
                break;
            }
            fruitList.add(fruit);
        }
        gioHang.addAll(fruitList);

        System.out.println("Cac phan tu trong hashSet sau khi them tu list: ");
        Iterator<String> iterator = gioHang.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        gioHang.removeAll(fruitList);

        System.out.println("Cac phan tu con lai trong Hashset sau khi xoa cac phan tu la: " + gioHang);
    }
}