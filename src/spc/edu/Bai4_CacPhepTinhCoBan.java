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
public class Bai4_CacPhepTinhCoBan {
    public static void main(String[] args) {
        System.out.println(" Cac Phep Tinh Co Ban");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So a");
        int a = sc.nextInt();
        System.out.println("Nhap So b");
        int b = sc.nextInt();
        int sotongmoi = a + b;
        System.out.printf("%d + %d = %d\n",a,b,sotongmoi);
        int sohieumoi = a - b;
        System.out.printf("%d - %d = %d\n",a,b,sohieumoi);
        int sotichmoi = a * b;
        System.out.printf("%d * %d = %d\n" ,a,b,sotichmoi);
        double sothuongmoi =(double) a / b;
        System.out.printf("%d / %d = %f\n",a,b,sothuongmoi);
        double tinhthuongmoi =(double) a / b;
        System.out.printf("%d / %d = %s\n",a,b,tinhthuongmoi);
    }
    public static int sotongmoi(int so1,int so2){return so1 + so2;}
    public static int sohieumoi(int so1,int so2){ return so1 - so2;}
    public static int sotichmoi(int so1,int so2){ return so1 * so2;}
    public static int sothuongmoi(int so1,int so2){return so1 / so2;}
    public static String tinhthuongmoi(int so1,int so2){
        if(so2 == 0)
        {
            return " Khong The Chia Het Cho 0";
        }
        else{
            return Double.toString((double)so1 / so2);
        }
    
    }
}
