package Buoi2_Vonglap;

import java.util.Scanner;

public class Baitaptrenlop_Nhapso_n_Insochiahetcho3 {
    public static void main(String[] args) {
        System.out.println("Nhap so ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("so chia het cho 3 la: " + i);
            }
        }
    }

}
