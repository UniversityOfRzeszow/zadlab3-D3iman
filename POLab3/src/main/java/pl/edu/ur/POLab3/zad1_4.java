package pl.edu.ur.POLab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deiman
 */
public class zad1_4 {
    
    public static void main(String[] args) {
        
        byte liczba = 5, b;                                           //Liczba 5 w bitach to 0000 0101
        
        System.out.println("Przed przesunieciem: "+liczba);
        b = (byte) (liczba << 3);                                     //Przesuniecie w lewo o 3
        System.out.println("Po przesunieciu o 3 w lewo: "+b);         //Po przesunieciu wartosc to 40, w bitach 0010 1000
        
        b = (byte) (b >> 2);
        System.out.println("Po przesunieciu o 2 w prawo: "+b);        //Po przesunieciu wartosc to 10, w bitach 0000 1010
        
        b = (byte) (b >>> 3);
        System.out.println("Po przesunieciu o 3 w praco bez znaku"+b);//Po przesunieciu wartosc to 1, w bitach 0000 0001
    }
    
}
