package Buoi1_lamquen_java;

import java.util.Scanner;

public class Thuchanh_Tinhchisocothe {
    public static void main(String[] args) {
        System.out.print("Nhap vao weight: ");
        System.out.print("Nhap vao height: ");

        Scanner scanner = new Scanner(System.in);
double weight = scanner.nextDouble();
double height = scanner.nextDouble();
double bmi = weight/ Math.pow(height, 2);
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
