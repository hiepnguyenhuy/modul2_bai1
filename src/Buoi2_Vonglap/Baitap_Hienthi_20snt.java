package Buoi2_Vonglap;

import java.util.Scanner;

public class Baitap_Hienthi_20snt {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong snt can in ");
        Scanner scanner = new Scanner(System.in);
        int soLuong = scanner.nextInt();
        int dem = 0;
        int N = 2;
        boolean kiemTra = true;
        while (dem < soLuong) {
            kiemTra = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    kiemTra = false;
                    break;
                }
            }
            if (kiemTra == true) {
                dem = dem + 1;
                System.out.println(N);
            }

            N++;
        }
    }
}
