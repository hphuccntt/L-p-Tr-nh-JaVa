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
public class TinhLaiSuat {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Chương Trình Tính Lãi Suất Ngân Hàng");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số tiền gốc");
        double tiengoc = nhap.nextDouble();
        System.out.println("nhập lãi suất hàng năm");
        double laisuat = nhap.nextDouble();
        laisuat = laisuat / 100;
        System.out.println("Nhập thời gian gửi tiền");
        double time = nhap.nextDouble();
        double tienlai = tiengoc * laisuat * time;
        double tongtien = tiengoc + tienlai;
        System.out.println(tienlai + " Tiền lãi nhận được");
        System.out.println(tongtien + " Đây là số tiền nhận được");
    }
}
