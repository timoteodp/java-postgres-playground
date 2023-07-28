package com.example;

import java.util.Scanner;

public class AppClasseScanner {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o Nome: ");
            cliente1.setNome (scanner.nextLine());

            System.out.println("Digite o CPF: ");
            cliente1.setCPF(scanner.nextLine());

            System.out.println("Digite a Cidade: ");
            cliente1.setCidade(scanner.nextLine());
      
            System.out.println("Digite o Ano de Nascimento: ");
            cliente1.setAnoNascimento(scanner.nextInt());

            scanner.nextLine();
            System.out.println("Digite Sexo: ");
            String sexo  = scanner.nextLine();
            cliente1.setSexo(sexo.charAt(0));
        }

        

        System.out.println();
        System.out.println("Renda "+ cliente1.getRenda());
        System.out.println("Sexo: "+ cliente1.getSexo());
        System.out.println("Ano de Nascimento: "+ cliente1.getAnoNascimento());
        System.out.println("Especial: " + cliente1.isEspecial());
        System.out.println();

    
    }
}
