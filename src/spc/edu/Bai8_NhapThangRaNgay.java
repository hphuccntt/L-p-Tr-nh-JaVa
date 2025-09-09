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
public class Bai8_NhapThangRaNgay {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Nhap Thang Ra Ngay"); 
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap Thang");
        int thang = nhap.nextInt();
        switch(thang)
        {
            case 1:
                    System.out.println("31 Ngay\n");
                    break;
            case 2:
                    System.out.println("29 Ngay\n");
                    break;
            case 3:
                    System.out.println("31 Ngay\n");
                    break;
            case 4:
                    System.out.println("30 Ngay\n");
                    break;
            case 5:
                    System.out.println("31 Ngay\n");
                    break;
            case 6:
                    System.out.println("30 Ngay\n");
                    break;
            case 7:
                    System.out.println("31 Ngay\n");
                    break;
            case 8:
                    System.out.println("31 Ngay\n");
                    break;
            case 9:
                    System.out.println("30 Ngay\n");
                    break;
            case 10:
                    System.out.println("31 Ngay\n");
                    break;
            case 11:
                    System.out.println("30 Ngay\n");
                    break;
            case 12:
                    System.out.println("31 Ngay\n");
                    break;
            default:
                    System.out.println("khong phai thang\n");
                    break;
            }  
    }
}
