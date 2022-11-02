package Buoi1_lamquen_java;

import java.util.Scanner;

public class Thuchanh_Kiemtra_Namnhuan {
    public static void main(String[] args) {
        System.out.println("Nhap vao nam can kiem tra: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 4 ==0) {
            System.out.println(a + " la nam nhuan");
        } else if (a % 100 == 0) {
            if (a % 400 == 0) {
                System.out.println(a + "la nam nhuan");
            } else {
                System.out.println(a + " khong la nam nhuan");
            }
        } else {
            System.out.println(a + " khong la nam nhuan");
        }
    }
}
