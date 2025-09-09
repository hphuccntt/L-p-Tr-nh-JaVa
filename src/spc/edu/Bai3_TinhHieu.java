/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai3_TinhHieu {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Tinh Hieu 2 So");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So a");
        int a = sc.nextInt();
        System.out.println("Nhap So b");
        int b = sc.nextInt();
        int hieu = a - b;
        
        System.out.printf("%d - %d = %d",a,b,hieu);
        /*
        int tong = a + b;
        System.out.printf("%d + %d = %d" ,a,b,tong);
        
        int tich = a * b;
        System.out.printf("%d * %d = %d" ,a,b,tich);
        
        double thuong =(double)a / b;
        System.out.printf("%d / %d = %d",a,b,thuong);
        */
    }
}
