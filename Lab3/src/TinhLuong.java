public class TinhLuong {
    public static void main(String[] args) {
        person ps = new person();
    
       employee nv = new employee();
        nv.nhapThongTin();
        nv.xuatThongTin();
        
        PartTime pt = new PartTime();
        pt.so_gio_lam();
        pt.Luong_NV_PartTime();

        FullTime ft = new FullTime();
        ft.nhapLCB();
        ft.PhanTram_Doanhthu();
        ft.thuong();
        ft.Luong_FullTime();
    }
}