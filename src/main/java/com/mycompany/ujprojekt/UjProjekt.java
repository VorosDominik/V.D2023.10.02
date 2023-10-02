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

  
   
    static public String[] tomb= new String[20];
    public static void main(String[] args) {
        
        
        jatek();
    }

    private static void jatek() {
        tombfeltoltes();
        
        for (int i = 0; i < 2; i++) {
            keveres();
        }
   
    //ezvolt();
    }

    private static void keveres() {
        String[] seged= new String [21];
    int oszlop = valasztas();
        switch (oszlop) {
            case 1:
                for (int i = 0; i < tomb.length; i++) {
                    seged[i] =tomb[20-(i-1)*3];
                    tomb[i]=seged[i];
                }   break;
            case 2:
                for (int i = 0; i < tomb.length; i++) {
                    //tomb[i] = 19 - (i-1)*3;
                }   break;
            case 3:
                for (int i = 0; i < tomb.length; i++) {
                    //    tomb[i] = 21 - (i-1)*3;
                }   break;
            default:
                System.out.println("hibás oszlopot választotál nem fog történi semmi!");
                break;
        }
        tombkiir();
        
        
        
        
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

    private static void tombfeltoltes() {
    String[] szin={"P","S","z"};
    String[] érték={"kir","dam","jum","X","IX","IIX"};
    int i =0;
        for (String szina : szin) {
            
            for (String erteka : érték) {
                i++;
                tomb[i]=szina+"_"+erteka;
            }
        }
    }

    private static void tombkiir() {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+"  ");
            if (i/3==1) {
             
                System.out.println("");
            }
        }
 
    }
}
