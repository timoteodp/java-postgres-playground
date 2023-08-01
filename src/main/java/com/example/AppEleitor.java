package com.example;

import java.time.LocalDate;

import com.example.model.Cidadao;

public class AppEleitor {

    
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(2000, 10, 1));

        System.out.println();
        System.out.println("O codadão tem " + cidadao.idade()+ " anos");
        System.out.println("O senhor é um " +  cidadao.eleitor());
        System.out.println();
        
    }
    
}
