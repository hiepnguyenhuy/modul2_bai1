package Buoi2_Vonglap;

import java.util.Scanner;

public class Thuchanh_Ungdungtienlai {
    public static void main(String[] args) {
        System.out.println("Nhap vao so tien cho vay: ");
        System.out.println("Nhap vao ti le lai suat: ");
        System.out.println("Nhap vao so thang cho vay: ");
        Scanner scanner = new Scanner(System.in);
        float soTien = scanner.nextFloat();
        float laiSuat = scanner.nextFloat();
        float soThang = scanner.nextFloat();
        float tongTien = soTien*(laiSuat/12)*soThang;
        System.out.println(tongTien);
    }
}
