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
public class Bai9_BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Nhap Bang Cuu Chuong");
        System.out.println("Bang Cuu Chuong ");
        for(int i = 1; i <= 10; i++){
              System.out.println("Bang Cuu Chuong " + i + ":");
		for (int so = 1; so < 10; so++)
		{
                      System.out.printf("%d x %d = %d\n", so, i, so * i); 
		}
        }
        /*
        for(int i = 1; i <=9; i++)
        System.out.println("7 x " + i + " = " + 7*i);
        c2. dùng while
        int k=9;
        while(k<=9){
        System.out.println("7 x " + k + " = " + 7*k);
        k++;
        }
        c3. dùng do while
        int n = 1;
        do{
        System.out.println("7 x " + n + " = " + 7*n);
        n++;
        }while(k<=9);
        */
    }
}
