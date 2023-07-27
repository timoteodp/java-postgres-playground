package com.example;

public class Cliente{
   private double renda ;
   private char sexo;
   private boolean especial;
   private String nome;
   private String CPF;
   private String cidade;


    public String getNome() {
    return nome;
}


public String getCPF() {
    return CPF;
}


public String getCidade() {
    return cidade;
}


public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
}


    public boolean isEspecial() {
    return especial;
}


public void setEspecial(boolean especial) {
    this.especial = especial;
}


    public Cliente() {
        System.out.println("Criando um cliente sem parâmentro ");
        double aleatorio = Math.random();
        if(aleatorio> 0.5)
        especial = true;
    }
    public Cliente(double renda, char sexo) {
        this();
        System.out.println("Criando um cliente com parâmetro ");
        setRenda(renda);
       this.renda = renda;
       this.sexo = sexo;


        especial = true;
    }


    public char getSexo() {
        return sexo;
    }
    public void setSexo(char c) {
        if(c== 'M'|| c == 'F')
        this.sexo = c;
        else System.out.println("Sexo Inválido");
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(String string) {
        this.anoNascimento = string;
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


    public void setNome(String string) {
    }


    public void setCPF(String string) {
    }


    public void setCidade(String string) {
    }


	public void setAnoNascimento(Object nextInt) {
	}


}