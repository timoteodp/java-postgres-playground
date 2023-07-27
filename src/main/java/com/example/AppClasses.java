package com.example;
public class AppClasses {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        //cliente1.renda = 100000;
        cliente1.setRenda(0);
        cliente1.anoNascimento = 1940;
        cliente1.setSexo('M');

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
