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
public class zad3_3 {
    
    public static double rekurencyjne(double x,double n){
        double a;
        if(n==0){
            return 1;
        }
        if(n%2!=0){
            return x*rekurencyjne(x,n-1);
        }
        else{
            a = rekurencyjne(x, n/2);
            return Math.pow(a, 2.0);
        }
        
    }
    
    public static double iteracyjne(double x, double n){
        int wynik = 1;
        while(n>0){
            wynik*=x;
            n--;
        }
        return wynik;
    }
    
    public static void main(String[] args) {
        double potega = 2;
        double wykladnik = 3;
        System.out.println("Rekurencja: "+rekurencyjne(potega, wykladnik));
        System.out.println("Iteracja: "+iteracyjne(potega, wykladnik));
    }
    
}
