package com.mycompany.loja;

import java.util.ArrayList;
import java.util.List;

public class Acesso {
    private List<Funcionario> funcionarioList = new ArrayList<>();
    private Opcao opcao;
    
    public Acesso(Opcao opcao){
        this.opcao = opcao;
    }
    
    public Acesso(Opcao opcao, List<Funcionario> funcionarioList){
        this.opcao = opcao;
        this.funcionarioList = funcionarioList;
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionarioList.add(funcionario);
    }
    
    public void removeFuncionario(Funcionario funcionario){
        this.funcionarioList.remove(funcionario);
    }
    
    public List<Funcionario> getFuncionarioList(){
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList){
        this.funcionarioList = funcionarioList;
    }

    public Opcao getOpcao(){
        return opcao;
    }

    public void setOpcao(Opcao opcao){
        this.opcao = opcao;
    }  
}
