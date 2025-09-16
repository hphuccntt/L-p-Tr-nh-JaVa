/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Bai13_Break {
    public static void main(String[] args) {
        /*
        for(int i=1; i<=10000;i++){
            if(i==100){
                break;
            }
            System.out.println(i);
        }
*/
        for (int i = 0; i < 10000; i++) {
            if (i == 100) {
              continue;
            }
            System.out.println(i);
          }
    }
}
