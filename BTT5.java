
import java.util.Scanner;

public class BTT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BAI 1: Nhap n sach bang vong lap
        System.out.print("Nhap so luong sach: ");
        int n = Integer.parseInt(sc.nextLine());

        while (n <= 0) {
            System.out.print("Nhap lai so luong sach: ");
            n = Integer.parseInt(sc.nextLine());
        }

        String[] maSach = new String[n];
        String[] tenSach = new String[n];
        double[] donGia = new double[n];
        int[] soLuong = new int[n];

        System.out.println("\n===== NHAP THONG TIN SACH =====");

        for (int i = 0; i < n; i++) {
            System.out.println("\nSach thu " + (i + 1));

            System.out.print("Nhap ma sach: ");
            maSach[i] = sc.nextLine();

            System.out.print("Nhap ten sach: ");
            tenSach[i] = sc.nextLine();

            System.out.print("Nhap don gia: ");
            donGia[i] = Double.parseDouble(sc.nextLine());

            System.out.print("Nhap so luong: ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
        }

        // BAI 3: Menu lap den khi chon thoat
        int chon;

        do {
            System.out.println("\n========== MENU QUAN LY SACH ==========");
            System.out.println("1. Hien thi danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    // Hien thi danh sach sach
                    System.out.println("\n===== DANH SACH SACH =====");

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nMa sach: " + maSach[i]);
                        System.out.println("Ten sach: " + tenSach[i]);
                        System.out.println("Don gia: " + donGia[i]);
                        System.out.println("So luong: " + soLuong[i]);
                    }
                    break;

                case 2:
                    // BAI 2: Tinh tong so luong va tong gia tri
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += donGia[i] * soLuong[i];
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 3:
                    // BAI 4: Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();

                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(maCanTim)) {
                            System.out.println("\nTim thay sach!");
                            System.out.println("Ma sach: " + maSach[i]);
                            System.out.println("Ten sach: " + tenSach[i]);
                            System.out.println("Don gia: " + donGia[i]);
                            System.out.println("So luong: " + soLuong[i]);

                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (chon != 0);

        sc.close();
    }
}
