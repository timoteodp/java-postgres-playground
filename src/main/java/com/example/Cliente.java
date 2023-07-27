package com.example;

public class Cliente{
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