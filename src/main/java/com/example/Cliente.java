package com.example;

public class Cliente{
   private double renda ;
   private char sexo;
   private boolean especial;
   private String nome;
   private String CPF;
   private String cidade;
private int anoNascimento;


    public int getAnoNascimento() {
    return anoNascimento;
}


public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
}


    public String getNome() {
    return nome;
}


public String getCPF() {
    return CPF;
}


public String getCidade() {
    return cidade;
}



    public boolean isEspecial() {
    return especial;
}


public void setEspecial(boolean especial) {
    this.especial = especial;
}

    public char getSexo() {
        return sexo;
    }
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


    public void setSexo(char c) {
        if(c== 'M'|| c == 'F')
        this.sexo = c;
        else System.out.println("Sexo Inválido");
    }


}