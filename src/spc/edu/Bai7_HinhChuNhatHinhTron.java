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
public class Bai7_HinhChuNhatHinhTron {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Tinh Hinh Chu Nhat Va Hinh Tron");
        Scanner nhap = new Scanner(System.in);
        double bankinh, pi = Math.PI, chuvi, dientich;
        double dientichhinhchunhat, chieudai, chieurong;
        System.out.println("Nhap Ban Kinh");
        bankinh = nhap.nextDouble();
        chuvi = 2 * pi * bankinh;
        dientich = pi * (bankinh * bankinh);
        System.out.printf("Chu Vi Hinh Tron = %f\n", chuvi);
        System.out.printf("Dien Tich Hinh Tron = %f\n", dientich);
        
        System.out.println("Nhap Chieu Dai Hinh Chu Nhat: ");
        chieudai = nhap.nextDouble();
        System.out.println("Nhap Chieu Rong Hinh Chu Nhat: ");
        chieurong = nhap.nextDouble();
        dientichhinhchunhat = chieudai * chieurong;
        System.out.printf("Dien Tich Hinh Chu Nhat = %f\n", dientichhinhchunhat);
    }
}
