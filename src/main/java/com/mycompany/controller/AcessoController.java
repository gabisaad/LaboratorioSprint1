package com.mycompany.controller;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.loja.Acesso;
import com.mycompany.loja.Funcionario;
import com.mycompany.loja.Opcao;

public class AcessoController {
    private List<Acesso> acessoList = new ArrayList<>();
    
    public AcessoController(List<Acesso> acessoList){
        this.acessoList = acessoList;
    }
    
    public boolean cadastrarAcesso(Opcao opcao, Funcionario funcionario){
        if((opcao == null) || (funcionario == null)){
            System.out.println("Erro ao cadastrar");
            return false;
        }
        Acesso acesso = consultarAcesso(opcao);
        if(acesso == null){
            acesso = new Acesso(opcao);
        }
        acesso.addFuncionario(funcionario);
        this.acessoList.add(acesso);
        return true;
    }
    
    public boolean atualizarAcesso(Opcao opcao, Funcionario funcionario){
        if((opcao == null) || (funcionario == null)){
            System.out.println("Erro ao atualizar");
            return false;
        }
        Acesso acessoVerificado = consultarAcesso(opcao);
        if(acessoVerificado == null){
            System.out.println("Acesso inexistente");
            return false;
        }
        if(acessoVerificado.getFuncionarioList().contains(funcionario)){
            acessoVerificado.getFuncionarioList().remove(funcionario);
            return true;
        }
        return cadastrarAcesso(opcao, funcionario);
    }
    
    public Acesso consultarAcesso(Opcao opcao){
        return this.acessoList.stream().filter(acesso -> acesso.getOpcao().equals(opcao)).findFirst().orElse(null); 
    }
    
    public int quantidadeAcessoCriado(){
        return acessoList.size();
    }
}
