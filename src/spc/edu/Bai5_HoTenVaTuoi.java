/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai5_HoTenVaTuoi {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Nhap Ho Ten, Nam Sinh Va Tuoi");
        Scanner nhap = new Scanner(System.in);
         System.out.println("Nhap Ho Ten ");
        String hoten = nhap.nextLine();
        System.out.println("Nhap Nam Sinh ");
        int namsinh = nhap.nextInt();
        int namhientai = Year.now().getValue();
        int tuoi = namhientai - namsinh;
        System.out.printf("Chao Ban Ten La %s, Nam Nay Ban Co So Tuoi La %d",hoten,tuoi); 
        
    }
}
