import java.util.Scanner;

public class BTT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin cơ bản từ Tuần 3
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        
        System.out.print("Nhap don gia: ");
        double donGia = Double.parseDouble(sc.nextLine());
        
        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.println("\n-----------------------------------------");
        System.out.println("========== KET QUA XU LY TUAN 4 ==========");

        // --- BAI 1: Kiem tra tinh hop le ---
        boolean hopLe = true;
        if (donGia <= 0) {
            System.out.println("- Bai 1: Don gia khong hop le (phai > 0).");
            hopLe = false;
        }
        if (soLuong < 0) {
            System.out.println("- Bai 1: So luong khong hop le (phai >= 0).");
            hopLe = false;
        }
        if (namXuatBan < 1500 || namXuatBan > 2026) {
            System.out.println("- Bai 1: Nam xuat ban khong hop le.");
            hopLe = false;
        }
        
        if (hopLe) {
            System.out.println("- Bai 1: Thong tin sach hop le!");
        }

        // --- BAI 2: Phan loai gia ---
        System.out.print("- Bai 2: Phan loai gia -> ");
        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia >= 50000 && donGia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia > 100000 && donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }

        // --- BAI 3: Phan loai ton kho ---
        System.out.print("- Bai 3: Phan loai ton kho -> ");
        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong >= 1 && soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong >= 6 && soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }

        // --- BAI 4: Dung switch-case chon loai sach ---
        System.out.println("\n--- CHON LOAI SACH ---");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon cua ban (1-4): ");
        int chonLoai = Integer.parseInt(sc.nextLine());

        System.out.print("- Bai 4: Loai sach duoc chon -> ");
        switch (chonLoai) {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                break;
        }
        
        sc.close();
    }
}