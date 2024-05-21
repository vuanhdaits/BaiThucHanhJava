import java.util.Scanner;
import java.util.LinkedList;

public class Slide41Chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList.add("Thang 1");
        LinkedList.add("Thang 2");
        LinkedList.add("Thang 3");
        LinkedList.add("Thang 4");
        LinkedList.add("Thang 5");
        LinkedList.add("Thang 6");
        LinkedList.add("Thang 7");
        LinkedList.add("Thang 8");
        LinkedList.add("Thang 9");
        LinkedList.add("Thang 10");
        LinkedList.add("Thang 11");
        LinkedList.add("Thang 12");

        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();

        if ((index < ) || (index > (linkedList.size() - 1))){
            System.out.println("Chi so can phai lon hon 0 va nho hon " + (linkedList.size()-1));
        }
        else{
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la " + node);
        }

        String firstNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();

        System.out.println("\nPhan tu dau tien trong danh sach la " + firstNode + " ; Phan tu cuoi cung trong danh sach la " + lastNode);
    }
}