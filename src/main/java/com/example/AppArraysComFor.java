package com.example;

import java.util.Arrays;

public class AppArraysComFor {

    public static void main(String[] args) {

        int vetor3[] = new int[5];
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = 100 * (i+1);

        }
        System.out.println();
        System.out.println(Arrays.toString(vetor3));
        System.out.println();
        
       
/* 
        System.out.println("vetor da posição 0: "+ vetorDouble2[0]);
        System.out.println("vetor da posição 1: "+ vetorDouble2[1]);
        System.out.println("vetor da posição 2: "+ vetorDouble2[2]);
        System.out.println("vetor da posição 3: "+ vetorDouble2[3]);
        System.out.println();
*/
       double matriz[][] = new double[4][4];
       for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
           matriz[i][j] = (i* matriz[i].length+ j+1)*2;
        }
        
       }
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5.1f ", matriz[i][j]);
            }
            System.out.println();
        }
    

      // System.out.println(Arrays.toString(matriz[0]));
      // System.out.println(Arrays.toString(matriz[1]));

       
  /*      
        System.out.println("Vetor na Posição 0 : "+ vetor[0]);
        System.out.println("Vetor na Posição 2 : "+ vetor[1]);
        System.out.println("Vetor na Posição 3 : "+ vetor[2]);
        System.out.println("Vetor na Posição 4 : "+ vetor[3]);
  */       
    }

   
}
