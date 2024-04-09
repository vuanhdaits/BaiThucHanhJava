public class HInhHoc {
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
    public final float Pi = 3.14f;

    public void ten(){
        System.out.println(ten);
    }

    public void inChuvi(){
        System.out.println("Chu vi " + ten + " la: " + chuVi);
    }

    public void inDienTich(){
        System.out.println("Dien tich " + ten + " la: " + dienTich);
    }

    public void inTheTich(){
        System.out.println("The tich " + ten + " la: " + theTich);
    }
}