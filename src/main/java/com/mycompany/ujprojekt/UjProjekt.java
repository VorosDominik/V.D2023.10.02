/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujprojekt;

import java.util.Scanner;

/**
 *
 * @author voros.dominik
 */
public class UjProjekt {

  
   
    static public String[] tomb;
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        for (int i = 0; i < 2; i++) {
             keveres();
        }
   
    ezvolt();
    }

    private static void keveres() {
    int oszlop = valasztas();
        if (oszlop==1) {
            for (String string : tomb) {
                
            }
        }
        else if (oszlop==2) {
            
        }
        else if (oszlop==3) {
            
        }else{
            System.out.println("hibás oszlopot választotál nem fog történi semmi!");
        }
        
        
        
        
        
    }

    private static void ezvolt() {
   
        System.out.println("ez volt ?" + tomb[11]);  
    }
     private static int valasztas() {
         Scanner src = new Scanner(System.in);
         System.out.println("melyik oszlopban van a választott szám?");
         int oszlop = src.nextInt();
         
         return oszlop;
     }
}
