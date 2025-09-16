/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

//import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai12_TinhLuyThua {
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Tinh Luy Thua");
        /*
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = nhap.nextInt();
        System.out.println("Nhap so b:");
        int b = nhap.nextInt();
        int luythua = 1;
        for(int i = 0; i < b; i++){
            luythua *= a;
        }
        System.out.println(a + "^" + b + " = " + luythua);
*/
        int so = 2;
        int mu = 6;
        /*
        int luythua = 1;
        for(int i=1; i<=mu; i++){
            luythua *= so;
        }

        System.out.printf("%d ^ %d = %d\n",so,mu,luythua);
*/
         System.out.printf("%d ^ %d = %d\n",so,mu,tinhluythua(so,mu));
         System.out.printf("%d ^ %d = %.2f\n",so,mu,tinhluythuamath(so,mu));
    }
    public static int tinhluythua(int s, int m){
        int lt = 1;
        for(int i=1; i <=m; i++){
            lt *= s;
        }
        return lt;
    }
     public static double tinhluythuamath(double s, double m)
     {
         return Math.pow(s, m);
     }
}
