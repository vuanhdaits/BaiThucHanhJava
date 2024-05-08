import util.Configs;    

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu";
    }

    public void tinhLuong(){
        luong = Configs.luongNhanVienPartTimeMoiGio * gioLamViec;
    }
}