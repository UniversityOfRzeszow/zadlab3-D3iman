/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Arrays;

/**
 *
 * @author Deiman
 */
public class zad2_2 {
    
    public static void main(String[] args) {
        
        String s1 = "New";
        String s2 = "Year";
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        System.out.println("toCharArray: "+Arrays.toString(s1.toCharArray())+" "+Arrays.toString(s2.toCharArray()));
        System.out.println("getBytes: "+Arrays.toString(s1.getBytes())+" "+Arrays.toString(s2.getBytes()));
        System.out.println("equals: "+s1.equals(s2));
        System.out.println("equalsIgnoreCase: "+s1.equals(s2));
        System.out.println("compareTo: "+s1.compareTo(s2));
        System.out.println("compareToIgnoreCase: "+s1.compareToIgnoreCase(s2));
        System.out.println("indexOf: "+s1.indexOf("e")+" "+s2.indexOf("a"));
        System.out.println("indexOf: "+s1.indexOf(s2));
        System.out.println("lastIndexOf: "+s1.lastIndexOf("w")+" "+s2.lastIndexOf("r"));
        System.out.println("lastIndexOf: "+s1.lastIndexOf(s2));
        System.out.println("substring: "+s1.substring(2)+" "+s2.substring(1));
        System.out.println("substring: "+s1.substring(1, 2)+" "+s2.substring(0, 2));
        System.out.println("replace: "+s1.replace("e", "a")+" "+s2.replace("r", "m"));
        System.out.println("trim: "+s1.trim()+" "+s2.trim());
        System.out.println("toLowerCase: "+s1.toLowerCase()+" "+s2.toLowerCase());
        System.out.println("toUpperCase: "+s1.toUpperCase()+" "+s2.toUpperCase());
        String s3 = "New Year";
        System.out.println("split: "+Arrays.toString(s3.split(" ", 2)));
        System.out.println("split: "+Arrays.toString(s3.split(" ")));
    }
    
}
