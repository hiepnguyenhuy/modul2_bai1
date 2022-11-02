package Buoi2_Vonglap;

import java.util.Scanner;

public class Thuchanh_Kiemtra_Songuyento {
    public static void main(String[] args) {
        System.out.println("Nhap vao so can kiem tra: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean dem = true;
//        int count = 0;
        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                dem = false;
//                count++;
            }

        }
        if (dem == true && a >= 2) {
            System.out.println(a + " la so nguyen to");
        } else {
            System.out.println(a + " khong la so nguyen to");
        }

    }
}
