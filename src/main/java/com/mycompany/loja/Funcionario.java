package com.mycompany.loja;

public class Funcionario {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    
    public Funcionario(){
        this.nome= "";
        this.cpf= "";
        this.dataDeNascimento = "";
    }

    public Funcionario(String nome, String cpf, String dataDeNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }  
    
    public String getDataDeNascimento(){
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    } 
}
