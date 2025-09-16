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
public class Bai16_Fibonacci {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap So Fibonacci Muon Biet: ");
        int so = nhap.nextInt();
        int so1 = 1;
        int so2 = 1;
        int soketiep;
        for (int i = 1; i <= so; i++)
        {
            soketiep = so1 + so2;
            System.out.print(soketiep + " ");
            so1 = so2;
            so2 = soketiep;
        }
    }
}
