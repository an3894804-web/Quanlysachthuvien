
import java.util.ArrayList;

class Sach {
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    public Sach(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("----------------------------");
    }
}

public class BTT7 {
    public static void main(String[] args) {

        ArrayList<Sach> danhSachSach = new ArrayList<>();

        Sach sach1 = new Sach("S01", "Lap trinh Java",
                "Nguyen Van A", 2022, 10);

        Sach sach2 = new Sach("S02", "Lap trinh C",
                "Nguyen Van B", 2023, 15);

        Sach sach3 = new Sach("S03", "Co so du lieu",
                "Nguyen Van C", 2024, 20);

        danhSachSach.add(sach1);
        danhSachSach.add(sach2);
        danhSachSach.add(sach3);

        System.out.println("===== DANH SACH QUAN LY SACH =====");

        for (Sach sach : danhSachSach) {
            sach.hienThiThongTin();
        }

        System.out.println("Tong so sach: " + danhSachSach.size());
    }
}
