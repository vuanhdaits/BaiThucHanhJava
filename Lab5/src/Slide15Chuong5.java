import java.io.IOException;

public class Slide15Chuong5 {
    void m() throws IOException {
        throw new IOException(":oi thiet bi");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();

        } catch (Exception Ex) {
            System.out.println("Ngoai le duoc xu li");
        }
    }

    public static void main(String[] args) {
        Slide15 obj = new Slide15();
        obj.p();
        System.out.println("Luong binh thuong");
    }
}