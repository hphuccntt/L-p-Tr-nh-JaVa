/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
/**
 *
 * @author Administrator
 */
public class Bai10_TrungBinhCong {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Tinh Trung Binh Cong");
        int batdau = 27;
        int ketthuc = 250;
        int tong = 0;
        int dem = 0;
        for(int i = batdau; i <= ketthuc; i++){
            //for(int i = 270; i <= 250; i++)
            if(i % 3 == 0){
                tong += i;
                dem ++;
            }
        }
        if (dem > 0) {
            double trungBinh = (double) tong / dem;
            System.out.printf("Cac so chia het cho 3 tu %d den %d la: %.0f%n", batdau, ketthuc, trungBinh);
            //%.0f%n thêm số thực ở sau
        } else {
            System.out.printf("Khong co so nao chia het cho 3 trong khoang %d den %d%n", batdau, ketthuc);
        }
    }
}
