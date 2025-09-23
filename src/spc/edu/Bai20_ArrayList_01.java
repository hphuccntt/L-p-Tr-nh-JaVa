/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Bai20_ArrayList_01 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        ArrayList<String> s = new ArrayList<>();
        s.add("Hoàng");
        s.add("Khoa");
        s.add("Kiệt");
        s.add("Huy");
        s.remove(2);
        s.remove("Kiệt");
        for(int i = 0; i < s.size();i++){
            System.out.println(s.get(i));
        }
    }
}
