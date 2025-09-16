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
public class Bai14_TinhDiem {
    public static void main(String[] args) {
        
        Scanner nhap = new Scanner(System.in);
        int diem = 0;
        int somonhoc = 0;
        int tongdiem = 0;
        while(true){
            System.out.println("Nhap diem mon " + (somonhoc + 1) + ":");
            diem = nhap.nextInt();
            if(diem >=0 && diem <=10)
            {
                tongdiem += diem;
                somonhoc++;
                continue;
            }
            System.out.println("Diem khong dung, dung nhap");
            break;
        }
        if(somonhoc > 0){
            double diemtb = (double)tongdiem/somonhoc;
            System.out.println("So Mon Hoc: " + somonhoc);
            System.out.println("Tong Diem: " + tongdiem);
            System.out.println("Diem Trung Binh: " + diemtb);
        }
    }
}
