import java.util.Scanner;

public class hoaDon {

    private String ten;
    private float gia, kluong;

    public hoaDon(String ten, float gia, float kluong) {
        this.ten = ten;
        this.gia = gia;
        this.kluong = kluong;
    }

    public float thanhTien() {
        return gia * kluong;
    }

    public void xuat() {
        System.out.println(ten + thanhTien());

    }

    boolean kiemtraKhoiLuong(float k) {
        return this.kluong > k;
    }

    public boolean kiemtraTongTien() {
        return this.thanhTien() > 500000;
    }

    public float giamGia(float x) {
        if (this.kiemtraTongTien()) {
            return (x / 100) * this.thanhTien();
        } else {
            return 0;
        }
    }

    public float soTien(float x) {
        if (this.kiemtraTongTien()) {
            return this.thanhTien() - (x / 100) * this.thanhTien();
        } else {
            return this.thanhTien();
        }
    }

}

class Try {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String t;
        float p, k;

        System.out.println("ten cp: ");
        t = scanner.nextLine();
        System.out.println("gia: ");
        p = scanner.nextFloat();
        System.out.println("kluong: ");
        k = scanner.nextFloat();
        hoaDon ob = new hoaDon(t, p, k);
        ob.xuat();
        System.out.println("khoi luong > 2: " + ob.kiemtraKhoiLuong(2));

        System.out.println("tong tien >500000: " + ob.kiemtraTongTien());

        System.out.println("tong tien sau giam gia: " + ob.soTien(5));
        scanner.close();
    }
}
