/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;



/**
 *
 * @author Administrator
 */
public class Bai17_TongSoChanLe {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //gõ tiếng việt có dấu
        System.out.println("Chương Trình Tính Tổng Chằng Lẻ");
        System.out.println("Tổng Chẳng "+ TongChan(5));
        System.out.println("Tổng Lẻ "+ TongLe(5));
    }
    public static double TongChan(int so) {
        double tong = 0;
        for(int i = 1; i <= so;i++){
            if(i%2==0){
                tong += i;
            }
        }
        return tong;
    } 
    public static double TongLe(int so) {
        double tong = 0;
        for(int i = 1; i <= so;i++){
            if(i%2!=0){
                tong += i;
            }
        }
        return tong;
    }    
}
 
