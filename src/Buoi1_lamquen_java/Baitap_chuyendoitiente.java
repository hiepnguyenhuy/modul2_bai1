package Buoi1_lamquen_java;

import java.util.Scanner;

public class Baitap_chuyendoitiente {
    public static void main(String[] args) {
        System.out.println("Nhap vao so tien USD: ");
        Scanner scanner = new Scanner(System.in);
        float Vnd = scanner.nextFloat();
        float Tigia = Vnd/25000;

        System.out.println("So tien VND cua ban la: " + Tigia + "USD");
    }
}
