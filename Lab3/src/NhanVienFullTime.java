import util.Configs;

public class NhanVienFullTime {
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten){

    }

    public NhanVienFullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public setLoaiChucVu(int loaiChucVu){

    }

    @Override
    public String loaiNhanVien(){
        return "Nhan vien toan thoi gian";
    }

    public void tinhLuong(){
        luong = Configs.luongNhanVienFullTimeSep + Configs.luongLamThemMoiNgay;
        luong = Configs.luongNhanVienFullTimeLinh + Configs.luongLamThemMoiNgay;
    }
}