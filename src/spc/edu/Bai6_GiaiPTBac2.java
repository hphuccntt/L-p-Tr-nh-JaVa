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
public class Bai6_GiaiPTBac2 {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Giai PT Bac 2");
        double a, b, c, x1, x2, delta;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so a");
        a = nhap.nextDouble();
        System.out.println("Nhap so b");
        b = nhap.nextDouble();
        System.out.println("Nhap so c");
        c = nhap.nextDouble();
        if(a == 0){
            System.out.println("Khong Phai Phuong Trinh Bac 2");
           /* if (b == 0) {
            if (c != 0) {
                 System.out.println("Phuong trinh vo nghiem");
            }
            else {
                 System.out.println("Phuong trinh co vo so nghiem");
            }
        } else {
            x1 = -c / b;
             System.out.println("Phuong trinh co nghiem x = " + x1);
        }*/
        }
        else{
            delta = b * b - 4 * a * c;
            System.out.printf("Delta = %f\n",delta);
            if(delta < 0){
                System.out.println("Phuong Trinh Vo Nghiem");
            }
            else if(delta == 0){
                x1 = x2 = -b / (2 * a);
                System.out.println("Phuong Trinh Co Nghiem Kep x1 = x2");
            }
            else{
               x1 = (-b + Math.sqrt(delta)) / (2 * a);
               x2 = (-b - Math.sqrt(delta)) / (2 * a);
               System.out.printf("x1 = %f\n",x1);
               System.out.printf("x2 = %f\n",x2);
               System.out.println("Phuong Trinh Co 2 Nghiem Phan Biet");
            }
        }
    }
}
