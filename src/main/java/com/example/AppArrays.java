package com.example;

import java.util.Arrays;

public class AppArrays {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        x = 20;
        System.out.println(x);

        double vetorDouble1[] = {1,2,3};
        double vetorDouble2[] = vetorDouble1;

        System.out.println(Arrays.toString(vetorDouble2));

        int vetor3[] = new int[4];
        vetor3[0] = 100;
        vetor3[1] = 200;
        vetor3[2] = 300;
        vetor3[3] = 400;
    
        System.out.println(Arrays.toString(vetor3));
        
       
/* 
        System.out.println("vetor da posição 0: "+ vetorDouble2[0]);
        System.out.println("vetor da posição 1: "+ vetorDouble2[1]);
        System.out.println("vetor da posição 2: "+ vetorDouble2[2]);
        System.out.println("vetor da posição 3: "+ vetorDouble2[3]);
        System.out.println();
*/
       double matriz[][] = {{10, 20, 30},{40, 50,60}};
       matriz[0] = new double[]{1,2,3,4,5};

       System.out.println(Arrays.toString(matriz[0]));
       System.out.println(Arrays.toString(matriz[1]));

       
  /*      
        System.out.println("Vetor na Posição 0 : "+ vetor[0]);
        System.out.println("Vetor na Posição 2 : "+ vetor[1]);
        System.out.println("Vetor na Posição 3 : "+ vetor[2]);
        System.out.println("Vetor na Posição 4 : "+ vetor[3]);
  */       
    }

   
}
