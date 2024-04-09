public class KetQuaHinhHoc {
    public static void main(String[] args) {
      HinhChuNhatKeThua hcn = new HinhChuNhatKeThua();
      hcn.nhapThongTin();
      hcn.tinhChuVi();
      hcn.tinhDienTich();
      hcn.hinhChuNhat();
      hcn.inChuvi();
      hcn.inDienTich();

      HinhVuongKeThua hv = new HinhVuongKeThua();
      hv.nhapThongTin();
      hv.tinhChuVi();
      hv.tinhDienTich();
      hv.hinhVuong();
      hv.inChuvi();
      hv.inDienTich();

      HinhTronKeThua hc = new HinhTronKeThua();
      hc.nhapDuongKinh();
      hc.tinhChuVi();
      hc.tinhDienTich();
      hc.hinhTron();
      hc.inChuvi();
      hc.inDienTich();

      HinhTruKeThua ht = new HinhTruKeThua();
      ht.nhapChieuCao();
      ht.tinhTheTich();
      ht.hinhTru();
      ht.inTheTich();
    }
}