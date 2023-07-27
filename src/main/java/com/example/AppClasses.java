package com.example;


class Cliente{
    double renda ;
    char sexo;
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo== 'M'|| sexo == 'F')
        this.sexo = sexo;
        else System.out.println("Sexo Inválido");
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    int anoNascimento;

    double getRenda(){
        return renda;
    }
    public void setRenda(double renda) {
       if(renda > 0)
            this.renda = renda;
        else System.out.println("A renda deve ser maior que zero");    
    }


}

public class AppClasses {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        //cliente1.renda = 100000;
        cliente1.setRenda(0);
        cliente1.anoNascimento = 1940;
        cliente1.sexo = 'M';

        System.out.println();
        System.out.println("Renda "+ cliente1.getRenda());
        System.out.println("Sexo: "+ cliente1.getSexo());
        System.out.println("Ano de Nascimento: "+ cliente1.getAnoNascimento());
        System.out.println();

        Cliente cliente2 = new Cliente();


        //cliente2.renda = 210000;
       cliente2.setRenda(200000);

        cliente2.anoNascimento = 1960;
        cliente2.sexo = 'F';

        System.out.println();
        System.out.println("Renda "+ cliente2.getRenda());
        System.out.println("Sexo: "+ cliente2.getSexo());
        System.out.println("Ano de Nascimento: "+ cliente2.getAnoNascimento());
        System.out.println();





    }
}
