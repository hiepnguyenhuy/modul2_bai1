package Buoi1_lamquen_java;

import java.util.Scanner;

public class Thuchanh_Tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thang ban muon tinh ngay? ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth.equals("") == false) System.out.println("Thang " + month + " co " + daysInMonth + " ngay");
        else System.out.println("Invalid input!");
    }
}
