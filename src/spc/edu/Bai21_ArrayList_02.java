/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai21_ArrayList_02 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        ArrayList<String> sinhvien = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        
        while(true){
            // nhập
            System.out.print("Nhập Tên Sinh Viên: ");
            String s = nhap.next();
            if ("Stop".equals(s)) break;
                sinhvien.add(s);
        }
        System.out.println("Danh Sách Sinh Viên Là: " + sinhvien.toString());
        System.out.println("Tổng Số : " + sinhvien.size() + "Sinh Viên");
        
    }
}
