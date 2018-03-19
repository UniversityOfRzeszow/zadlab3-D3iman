/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Deiman
 */
public class zad1_7 {
    
    public static void main(String[] args) {
        boolean a = true; boolean b = false;  //true = 1, false = 0
        System.out.println("NOT i XOR: ");
        System.out.println("0, 0: "+(!a^b));
        System.out.println("0, 1: "+(!a^!b));
        System.out.println("1, 0: "+(a^b));
        System.out.println("1, 1: "+(a^!b));
    }
    
}
