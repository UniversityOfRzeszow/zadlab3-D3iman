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
public class zad3_4 {
    
    public static double ciagFibb(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else
            return ciagFibb(n-1)+ciagFibb(n-2);
    }
    
    public static void main(String[] args) {
        
        int liczba = 7;
        
        System.out.println("Ciag Fibonacciego: "+ciagFibb(liczba));
    }
    
}
