package Buoi2_Vonglap;

import java.util.Scanner;

public class Baitaptrenlop_bai2 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Nhap vao so nguyen");
            Scanner scanner = new Scanner(System.in); // đọc cái nhập vào từ bàn phím
            int n = scanner.nextInt();
            boolean dem = true;
            if (n != 0) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        dem = false;
                        break;
                    }
                }
                if (dem == true && n >= 2) {
                    System.out.println("so vua nhap la so nguyen to");
                } else {
                    System.out.println("so vua nhap khong la so nguyen to");
                }
            } else {
                break;
            }
//            break;
        }
    }
}
