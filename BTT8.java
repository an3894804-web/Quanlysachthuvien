
import java.util.ArrayList;

class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        int namHienTai = java.time.Year.now().getValue();

        if (namXuatBan > 0 && namXuatBan <= namHienTai) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong duoc am!");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + getMaSach());
        System.out.println("Tieu de: " + getTieuDe());
        System.out.println("Tac gia: " + getTacGia());
        System.out.println("Nam xuat ban: " + getNamXuatBan());
        System.out.println("So luong: " + getSoLuong());
        System.out.println("----------------------------");
    }
}

public class BTT8 {
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

        System.out.println("\n===== KIEM TRA DU LIEU =====");

        System.out.println("So luong ban dau: " + sach1.getSoLuong());

        sach1.setSoLuong(25);

        System.out.println("So luong sau khi sua: " + sach1.getSoLuong());

        sach1.setSoLuong(-5);
        sach1.setNamXuatBan(2030);
    }
}
