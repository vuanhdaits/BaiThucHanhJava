public class employee extends nguoi {
    public float luong;
   
    public void nhapThongTin(String ten, String diachi, int tuoi){
        hoTen = ten;
        diaChi = diachi;
        tuoi = tuoi;
    }
    
    public float inluong(){   
        System.out.println("Luong: "+luong);
        return luong;
    }
}