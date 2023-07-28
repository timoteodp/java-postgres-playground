package com.example;

public class AppOperadoresRelacionais {

    public static void main(String[] args) {

            var cliente1 = new Cliente();
            cliente1.setAnoNascimento(1930);

            var cliente2 = new Cliente();
            cliente2.setAnoNascimento(1930);
            boolean clienteMaisJovem = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
            boolean clienteMaisVelho = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();
            System.out.println();

        if(clienteMaisJovem){
            System.out.println("O Ciente 1 é mais velho que o Cliente 2");
            System.out.println("O ano de nascimento do cliente 1 é "+ cliente1.getAnoNascimento());
            System.out.println("O nano de nascimento do cliente 2 "+ cliente2.getAnoNascimento());
            System.out.println();


        } 
        else if (clienteMaisVelho)
        {
            
            System.out.println("O cliente 2 é mais jovem que o  cliente 2");
            System.out.println("O cliente 1 nasceu em "+ cliente1.getAnoNascimento());
            System.out.println("O cliente 2 nasceu em "+cliente2.getAnoNascimento());
            System.out.println();
           

        }
        else System.out.println("Os Clientes tem a mesma idade");
    
        
    }
}
