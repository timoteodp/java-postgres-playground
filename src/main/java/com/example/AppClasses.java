package com.example;

import com.example.model.Cliente;

public class AppClasses {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
    

        System.out.println();
        System.out.println("Renda "+ cliente1.getRenda());
        System.out.println("Sexo: "+ cliente1.getSexo());
        System.out.println("Ano de Nascimento: "+ cliente1.getAnoNascimento());
        System.out.println("Especial: " + cliente1.isEspecial());
        System.out.println();

        Cliente cliente2 = new Cliente(30000, 'F');

        System.out.println();
        System.out.println("Renda "+ cliente2.getRenda());
        System.out.println("Sexo: "+ cliente2.getSexo());
        System.out.println("Ano de Nascimento: "+ cliente2.getAnoNascimento());
        System.out.print("Cliente Especial " + cliente2.isEspecial());

        System.out.println();






    }
}
