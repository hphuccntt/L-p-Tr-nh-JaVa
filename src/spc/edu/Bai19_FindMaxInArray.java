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
public class Bai19_FindMaxInArray {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Chương Trình Nhập Mãng");
        Scanner nhap = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++)
        {
            System.out.print("Nhập Phần Tử Thứ " + i + ": ");
            a[i] = nhap.nextInt();
        }
        int lonnhat = a[0];
        int nhonhat = a[0];
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] > lonnhat) {
                lonnhat = a[i];
            }
            if (a[i] < nhonhat){
                nhonhat = a[i];
            }
        }
        System.out.println("Số Lớn Nhất Trong Mãng: " + lonnhat);
        System.out.println("Số Nhỏ Nhất Trong Mãng: " + nhonhat);
        int tong = 0;
        for (int i : a) {
                tong += i;  
        }
        double trungbinh = (double) tong / a.length;
        System.out.println("Tổng: = " + tong); 
        System.out.println("Trung Bình Cộng Là: " + trungbinh);
        int tongchan = 0;
        int tongle = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                tongchan += i;
            }else{
                tongle += i;
            }
        }
        System.out.println("Tổng Chẵn Là: " + tongchan);
        System.out.println("Tổng Lẻ Là: " + tongle);
    }
}
