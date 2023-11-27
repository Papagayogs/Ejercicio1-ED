/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MasLarga {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String frase="";    //comprara la frase mas larga
        boolean fin=false;  //bandera para determinar cuando finalizar el programa
        
        while (!fin){
            System.out.print("Introduce una frase(para finalizar dejar vacio): ");
            String frase2=sc.nextLine();
            if(!frase2.equals("")){
                if(frase2.length()>frase.length()){
                    frase = frase2;
                }
            }else{
                fin=true;
            }
        }
        System.out.println("La frase mas larga introducida es:" );
        System.out.println(frase);
        
        /**     CORRECION:
        String frase = "";
        int max = 0;
        String masLarga = "";

        do {
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
            
            if (frase.length() > max) {
                max = frase.length();
                masLarga = frase;
            }
        } while (!frase.isEmpty());

        System.out.println("La frase más larga introducida ha sido: " + masLarga);

        }
         */
    }
}
