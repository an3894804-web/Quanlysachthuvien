
import java.util.ArrayList;
import java.util.Scanner;

public class BTT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> danhSachSach = new ArrayList<>();
        ArrayList<Integer> soLuong = new ArrayList<>();
        ArrayList<Double> donGia = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim kiem sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua thong tin sach");
            System.out.println("6. Tinh tong so luong sach");
            System.out.println("7. Tinh tong gia tri sach");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maSach = sc.nextLine();

                    System.out.print("Nhap ten sach: ");
                    String tenSach = sc.nextLine();

                    System.out.print("Nhap so luong: ");
                    int sl = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap don gia: ");
                    double gia = Double.parseDouble(sc.nextLine());

                    String sach = maSach + " - " + tenSach;

                    danhSachSach.add(sach);
                    soLuong.add(sl);
                    donGia.add(gia);

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    System.out.println("\n----- DANH SACH SACH -----");

                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach rong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println("Ma va ten sach: " + danhSachSach.get(i));
                            System.out.println("So luong: " + soLuong.get(i));
                            System.out.println("Don gia: " + donGia.get(i));
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    boolean timThay = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).startsWith(maTim + " - ")) {
                            System.out.println("Tim thay sach: " + danhSachSach.get(i));
                            System.out.println("So luong: " + soLuong.get(i));
                            System.out.println("Don gia: " + donGia.get(i));
                            timThay = true;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    boolean daXoa = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).startsWith(maXoa + " - ")) {
                            danhSachSach.remove(i);
                            soLuong.remove(i);
                            donGia.remove(i);
                            daXoa = true;
                            System.out.println("Xoa sach thanh cong!");
                            break;
                        }
                    }

                    if (!daXoa) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();

                    boolean daSua = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).startsWith(maSua + " - ")) {
                            System.out.print("Nhap ten sach moi: ");
                            String tenMoi = sc.nextLine();

                            System.out.print("Nhap so luong moi: ");
                            int slMoi = Integer.parseInt(sc.nextLine());

                            System.out.print("Nhap don gia moi: ");
                            double giaMoi = Double.parseDouble(sc.nextLine());

                            danhSachSach.set(i, maSua + " - " + tenMoi);
                            soLuong.set(i, slMoi);
                            donGia.set(i, giaMoi);

                            daSua = true;
                            System.out.println("Cap nhat sach thanh cong!");
                            break;
                        }
                    }

                    if (!daSua) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 6:
                    int tongSoLuong = 0;

                    for (int i = 0; i < soLuong.size(); i++) {
                        tongSoLuong += soLuong.get(i);
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    break;

                case 7:
                    double tongGiaTri = 0;

                    for (int i = 0; i < soLuong.size(); i++) {
                        tongGiaTri += soLuong.get(i) * donGia.get(i);
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (chon != 8);

        sc.close();
    }
}

