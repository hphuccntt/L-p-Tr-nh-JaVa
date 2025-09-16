/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai18_TinhSoThocTrenBanCo {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Chương Trình In Số Thóc Trên Bàn Cờ");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập Số Ô Trên Bàn: ");
        int soO;
        soO = nhap.nextInt();
        System.out.printf("Tổng Số Thóc Trong Ô Thứ %d là %d\n ",soO,TongSoThoc(soO));
    }
     public static long TongSoThoc(int soO) // có thể thay (long) bằng (double)
     {
        long tong = 0;
        for(int i = 1; i <= soO;i++){
           tong += Math.pow(2, i); //tong += 2^i
        }
        return tong;
    }    
}
