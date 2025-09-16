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
public class Bai15_GiaiThua {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Tinh Giai Thua");
        Scanner nhap = new Scanner(System.in);
        int so = nhap.nextInt();
        int giaithua = 1;
        if(so < 0){
            System.out.println("Nhap so nguyen khong am");
        }else
        {
            for(int i = 1; i <= so; i++){
            giaithua *= i;
        }
            System.out.printf("%d! = %d ",so,giaithua);
        }   
    }
}
